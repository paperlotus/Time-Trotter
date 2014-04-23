package controllers;

import static com.google.common.collect.Lists.transform;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.mail.MailSetting;
import models.role.RoleLevel;
import models.role.RoleX;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.codehaus.jackson.node.ObjectNode;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.editWizard;
import views.html.users.userIndex;

import com.avaje.ebean.Expr;
import com.custom.domain.DomainEnum;
import com.custom.domain.RoleDomain;
import com.custom.emails.Email;
import com.custom.helpers.UserSave;
import com.custom.helpers.UserSearchContext;
import com.google.common.base.Function;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.ui.component.AutoComplete;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Users extends Controller {
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(UserSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			User user = User.findById(id);
			RoleX role = RoleX.find.where(Expr.eq("company", user.companyobject)).findUnique();
			List<DomainEnum> roleX = new ArrayList<DomainEnum>();
			if(role != null){
				for(int i=0; i<role.roleLevels.size(); i++){
					roleX.add(new RoleDomain(role.roleLevels.get(i).id+"",role.roleLevels.get(i).role_name,false));
				}
			}
			user.rolex = roleX;
			
			return ok(editWizard.render(new UserSearchContext(user).build()));
		}catch(Exception e){
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Not able to show Results, Check Logs");
		
	}
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  UserSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	public static Result edit() {
		boolean userStatus = false;
		
		try {
			DynamicForm form = DynamicForm.form().bindFromRequest();
			Map<String, Object> extra = new HashMap<String, Object>();
			RoleLevel rl = RoleLevel.find.byId(Long.parseLong(form.get("rolex")));
			extra.put("role", rl);
			
			if(User.findById(Long.parseLong(form.data().get("id"))).userStatus == com.custom.domain.Status.Approved){
				userStatus = true;
			}
			
			if(User.findById(Long.parseLong(form.data().get("id"))).permissions != null){
				String permissions = User.findById(Long.parseLong(form.data().get("id"))).permissions;
				permissions = permissions+"|"+rl.getPermissions();
				List<String> blackListedPerm = Arrays.asList(permissions.split("[|]"));
				Set<String> set = new HashSet<String>(blackListedPerm);
				String permission = "";
				for(String temp : set){
					permission = temp + "|" +permission;
				}
				extra.put("permissions",permission);
			}else{
				extra.put("permissions",rl.getPermissions());
			}
	    	
			
			extra.put("designation",rl.role_name);
	    	
	    	UserSave saveUtils = new UserSave(extra);
			Object o = saveUtils.doSave(true);
			User user = User.findById((Long)o);
			if(user.userStatus == com.custom.domain.Status.PendingApproval){
				user.userStatus = com.custom.domain.Status.Approved;
				user.update();
				try{
				MailSetting smtpSetting = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
				String recipients = "";
				String subject = "";
				String body = "";
				
				recipients = user.email;
				subject = "Approval By Admin";
				body = "Congratulation !!! You are Approved By Admin..." +
						"\nNow You can Login the TimeTrotter System!!";
				Email.sendOnlyMail(smtpSetting,recipients, subject, body);
				}catch (Exception e){
					ExceptionHandler.onError(request().uri(),e);
				}
				
			}
			
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
			return badRequest();
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message="";
		if(userStatus){
			message = "User have been Edited Successfully";
		}else{
			message = "The Selected User have been Approved and Edited Successfully";
		}
		 
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
    }
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		RoleX role = RoleX.find.where(Expr.eq("company", user.companyobject)).findUnique();
		List<DomainEnum> roleX = new ArrayList<DomainEnum>();
		if(role != null){
			for(int i=0; i<role.roleLevels.size(); i++){
				roleX.add(new RoleDomain(role.roleLevels.get(i).id+"",role.roleLevels.get(i).role_name,false));
			}
		}
		user.rolex = roleX;
		return ok(userIndex.render(UserSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result findProjectManagers(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String designation = form.get("param");
		String query = form.get("query");
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(findUpperLevelUser(query, designation, true), toAutoCompleteFormatForPM());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}
	
	public static Result findHRUser(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String designation = form.get("param");
		String query = form.get("query");
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(findHRManagers(query,designation), toAutoCompleteFormatForHR());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}
	
	public static Result findDelegateTos(){
		
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.get("query");
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(findDelegateTos(query), toAutoCompleteFormatForDelegate());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}

	private static Function<models.user.User,AutoComplete> toAutoCompleteFormatForHR() {
		return new Function<models.user.User, AutoComplete>() {
			@Override
			public AutoComplete apply(models.user.User user) {
					return new AutoComplete(user.firstName,user.lastName,user.email,user.id);
			}
		};
	}
	
	private static Function<models.user.User,AutoComplete> toAutoCompleteFormatForPM() {
		return new Function<models.user.User, AutoComplete>() {
			@Override
			public AutoComplete apply(models.user.User user) {
					return new AutoComplete(user.firstName,user.lastName,user.email,user.id);
			}
		};
	}
	
	public static List<User> findHRManagers(String query, String param) {
		RoleX roleX = RoleX.find.where(Expr.eq("company", 
										User.findByEmail(request().username()).companyobject)).findUnique();
		
		List<String> upperRoleLevels = new ArrayList<String>();
		for(RoleLevel level : roleX.roleLevels){
			if(Integer.parseInt(level.role_level.name().split("[_]")[1]) > Integer.parseInt(param)){
				upperRoleLevels.add(level.role_level.name());
			}
		}
		
	    return User.find.where().and(Expr.in("designation", upperRoleLevels),
	    		   Expr.or(Expr.ilike("firstName", query+"%"), 
	    				   Expr.or(Expr.ilike("lastName", query+"%"),
	    						   Expr.ilike("middleName", query+"%")))).findList();
	}
	
	public static List<User> findProjectManagers(String query, String param) {
		return findUpperLevelUser(query, param, false);
	}
	
	public static List<User> findUpperLevelUser(String query, String param, boolean check){

		User _thisUser = User.findByEmail(request().username());
		RoleX roleX = RoleX.find.where(Expr.eq("company", 
				_thisUser.companyobject)).findUnique();
		List<User> usersAfterFilter = new ArrayList<User>(); 
		
		if(param.length() != 0) {
			RoleLevel thisLevel = RoleLevel.findById(Long.parseLong(param));
			
			List<User> users = User.find.where().
			and(Expr.eq("role.roleX",roleX),
			Expr.or(Expr.ilike("firstName", query+"%"), 
				Expr.or(Expr.ilike("lastName", query+"%"),
						Expr.ilike("middleName", query+"%")))).findList();
			
			for(User _u : users){
				if(_u.role.role_level.ordinal() > thisLevel.role_level.ordinal()){
					usersAfterFilter.add(_u);
				}
			}
		} else {
			List<User> users = User.find.where().add(Expr.eq("role.roleX",roleX)).findList();
			for(User _u : users){
				usersAfterFilter.add(_u);
			}
		}
		if (usersAfterFilter.size() == 0 ){
			usersAfterFilter.add(_thisUser);
		}
		
		return usersAfterFilter;
	}
	
	
	public static List<User> findDelegateTos(String query) {
		return findUpperLevelUser(query, User.findByEmail(request().username()).designation, true);
	}
	
	private static Function<models.user.User,AutoComplete> toAutoCompleteFormatForDelegate() {
		return new Function<models.user.User, AutoComplete>() {
			@Override
			public AutoComplete apply(models.user.User user) {
					return new AutoComplete(user.firstName,user.lastName,user.email,user.id);
			}
		};
	}
	
	public static Result findManagerUser(){
		return ok();
	}
	
	public static Result create() {
		String email,code,userEmail;
		int a,b;
		
			DynamicForm form = DynamicForm.form().bindFromRequest();
			String userName = form.get("email");
			User user = User.findByEmail(request().username());
			
			email = user.email;
			b = email.length();
			a = email.lastIndexOf("@");
			code = email.substring(a,b);
			userEmail = userName.concat(code);
			
			User companyAdmin = User.findByEmail(request().username());
			form.data().put("email", userEmail);
			String password = Application.generatePassword();
			RoleLevel roleLevel = RoleLevel.findById(Long.parseLong(form.get("rolex")));
	    	Map<String, Object> extra = new HashMap<String, Object>();
	    	extra.put("email", userEmail);
			extra.put("companyobject", User.findByEmail(request().username()).companyobject);
			extra.put("userStatus", com.custom.domain.Status.Approved);
			extra.put("password", password);
			extra.put("tempPassword", 1);
			extra.put("role", roleLevel);
			extra.put("designation", roleLevel.role_name);
			extra.put("permissions",roleLevel.getPermissions());
			
			UserSave saveUtils = new UserSave(extra);
			
			try {
				saveUtils.doSave(false);
			}catch (Exception e) {
				ExceptionHandler.onError(request().uri(),e);
				return badRequest();
			}
			
			try {
				MailSetting smtpSetting = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
				String recipients = "";
		    	String subject = "";
		    	String body = "";
		    	recipients = userEmail;
		    	subject = "Account Creation By" + companyAdmin.firstName;
		    	body = "Your Login Details :";
		    	body += "\nUser Name :" + userEmail;
		    	body += "\nPassword  :" + password;
		    	Email.sendOnlyMail(smtpSetting,recipients, subject, body);
			}catch (Exception e) {
				ExceptionHandler.onError(request().uri(),e);
			}
			return ok("User Created Successfully");
    }
	
	public static Result emailAvailability()
	{
		String email,code,userEmail;
		int a,b;
		
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		User user = User.findByEmail(request().username());
		
		email = user.email;
		b = email.length();
		a = email.lastIndexOf("@");
		code = email.substring(a,b);
		userEmail = q.concat(code);
		
		User userNew = User.find.where().eq("email", userEmail).findUnique();
		if(userNew==null){
			return ok(Json.toJson(true));
		}
		return ok(Json.toJson(false));
		
	}
	
	public static Result getCompanyUser()
	{
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String designation = form.get("param");
		String query = form.get("query");
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(findCompanyUser(query, designation), toAutoCompleteFormatForCU());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}
	
	public static List<User> findCompanyUser(String query, String param) {
		User user = User.findByEmail(request().username());
	    return User.find.where().eq("companyobject", user.companyobject).ilike("firstName", query+"%").findList();
	}
	
	private static Function<models.user.User,AutoComplete> toAutoCompleteFormatForCU() {
		return new Function<models.user.User, AutoComplete>() {
			@Override
			public AutoComplete apply(models.user.User user) {
					return new AutoComplete(user.firstName,user.lastName,user.email,user.id);
				
			}
		};
	}
	
	public static Result idAvailability()
	{
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		User user = User.find.where().eq("employeeId", q).findUnique();
		if(user == null){
			return ok(Json.toJson(true));
		}
		return ok(Json.toJson(false));
	}
}
