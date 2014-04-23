package controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import models.company.Company;
import models.mail.MailSetting;
import models.notification.Notification;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.status.companyStatus;
import views.html.status.userStatus;

import com.avaje.ebean.Expr;
import com.custom.domain.BlackListedPermissions;
import com.custom.domain.Permissions;
import com.custom.emails.Email;
import com.custom.helpers.CustomCompanySearchContext;
import com.custom.ui.search.helper.UserStatusSearchContext;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.auth.BasicAuthAction;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Status extends Controller {

	private static final String DELIMITER = "[|]";
	public static Result userIndex() {
		User user = User.findByEmail(request().username());
		session().get("email");
		request().username();
		return ok(userStatus.render(UserStatusSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	public static Result userSearch() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email",request().username());
		return ok(Json.toJson(UserStatusSearchContext.getInstance().build().doSearch(form)));
    }
	public static Result approveUserStatus(String query){
		String result = "";
		
		Permissions[] permissions = Permissions.values();
		for(Permissions p :permissions)
		{
			if(!(p == Permissions.Home))
			{
				result += p+BasicAuthAction.DELIMITER;
			}
		}
		
		for(String ids : query.split(",")){
			User user = User.find.byId(Long.parseLong(ids));
			user.userStatus = com.custom.domain.Status.Approved;
			user.manager =  User.findByEmail(request().username());
			
			user.update();
			
			//Send Email to User After Approval
			MailSetting smtpSetting = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
			String recipients = "";
			String subject = "";
			String body = "";
			
			recipients = user.email;
			subject = "Approval By Admin";
			body = "Congratulation !!! You are Approved By Admin..." +
					"\nNow You can Login the TimeTrotter System!!";
			Email.sendOnlyMail(smtpSetting,recipients, subject, body);
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "The Selected User have been Approved Successfully. So Please Fill the User Detail in Manage User Section";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result excelReportUser() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  UserStatusSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	
	public static Result disapproveUserStatus(String query){
		for(String ids : query.split(",")){
			User user = User.find.byId(Long.parseLong(ids));
			user.userStatus = com.custom.domain.Status.Disapproved;
			if(user.getPermissions() != null){
				user.setPermissions(null);
			}
			user.update();
			
			//Send Email to User After Approval
			MailSetting smtpSetting = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
			String recipients = "";
			String subject = "";
			String body = "";
			
			recipients = user.email;
			subject = "Disapproved By Admin";
			body = "Sorry !!! You are Disapproved By Admin..." +
					"\nPlease Contact Your Company Admin Regarding This!!";
			Email.sendOnlyMail(smtpSetting,recipients, subject, body);
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "The Selected User Has Been Disapproved Successfully";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result companyIndex() {
		User user = User.findByEmail(request().username());
		session().get("email");
		request().username();
		return ok(companyStatus.render(CustomCompanySearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result companySearch() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		return ok(Json.toJson(CustomCompanySearchContext.getInstance().build().doSearch(form)));
    }
	public static Result approveCompanyStatus(String query){
		for(String ids : query.split(",")){
			Company company = Company.find.byId(Long.parseLong(ids));
			company.setCompanyStatus(com.custom.domain.Status.Approved);
			company.update();
			
			User companyAdmin = new User();
			MailSetting mailNew = new MailSetting();
			Notification notification = new Notification();
			String password = Application.generatePassword();
			companyAdmin.firstName = company.getCompanyCode()+" Admin";
			companyAdmin.designation = "Admin";
			companyAdmin.companyobject = company;
			companyAdmin.email = company.companyEmail;
			companyAdmin.userStatus = com.custom.domain.Status.Approved;
			companyAdmin.password = password;
			companyAdmin.tempPassword = 1;
			mailNew.companyObject = company;
			mailNew.userName = company.companyEmail;
			notification.company = company;
			notification.save();
			mailNew.save();
			companyAdmin.setPermissions(BlackListedPermissions.BLACKLISTED_PERMISSIONS_FOR_ADMIN);
			companyAdmin.save();
			
			//Send Email to company Admin After Approval
			String recipients = "";
			String subject = "";
			String body = "";
			
			recipients = companyAdmin.email;
			subject = "Company Approved by Super Admin";
			body = "Company "+company.companyName + " is Approved by Super Admin." +
					"\nYour Login Details are:" +
					"\nUsername :"+ companyAdmin.email+
					"\nPassword :"+ companyAdmin.password+
					"\n\nNow You Can Login Timesheet Trotter!";
			
			User superAdmin = User.find.where().eq("designation", "SuperAdmin").findUnique();
			MailSetting smtpSetting = MailSetting.find.where().eq("companyObject",superAdmin.companyobject).findUnique();
			Email.sendOnlyMail(smtpSetting,recipients, subject, body);
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "The Selected Company have been Approved Successfully.";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result excelReportCompany() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  CustomCompanySearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	//@Transactional
	//@play.db.ebean.Transactional
	public static Result disapproveCompanyStatus(String query){
		for(String ids : query.split(",")){
			Company company = Company.find.byId(Long.parseLong(ids));
			company.setCompanyStatus( com.custom.domain.Status.Disapproved);
			company.update();
			
			User companyAdmin = User.find.where().and(Expr.eq("companyobject.companyCode",company.getCompanyCode()), Expr.eq("designation", "Admin")).findUnique();
			if (companyAdmin != null) {
				MailSetting mailDel = MailSetting.find.where().eq("companyObject", companyAdmin.companyobject).findUnique();
				if(mailDel != null){
					MailSetting.find.ref(mailDel.id).delete();
				}
				Notification notify = Notification.find.where().eq("company", companyAdmin.companyobject).findUnique();
				if(notify != null){
					Notification.find.ref(notify.id).delete();
				}
				User.find.ref(companyAdmin.id).delete();
				
				if(companyAdmin.getPermissions() != null){
					companyAdmin.setPermissions(null);
				}
			}
			
			
			String recipients = "";
			String subject = "";
			String body = "";
			
			recipients = company.companyEmail;
			subject = "Company Disapproved by Super Admin";
			body = "Company "+company.companyName + " is Disapproved by Super Admin. \nPlease Contact Super Admin Regarding This!";
			
			User superAdmin = User.find.where().eq("designation", "SuperAdmin").findUnique();
			MailSetting smtpSetting = MailSetting.find.where().eq("companyObject",superAdmin.companyobject).findUnique();
			Email.sendOnlyMail(smtpSetting,recipients, subject, body);
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "The Selected Company Has Been Disapproved Successfully";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
}
