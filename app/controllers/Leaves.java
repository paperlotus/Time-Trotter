package controllers;

import static play.data.Form.form;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.joda.time.DateTime;

import models.leave.ApplyLeave;
import models.user.User;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.EmailExceptionHandler;
import utils.ExceptionHandler;
import views.html.editWizard;
import views.html.leaves.leaveBucket;
import views.html.leaves.leaveIndex;

import com.custom.domain.LeaveStatus;
import com.custom.helpers.LeaveApplyContext;
import com.custom.helpers.LeaveBucketSearchContext;
import com.custom.helpers.LeaveSave;
import com.custom.helpers.ProjectSearchContext;
import com.custom.workflow.vacation.VacationWorkflowUtils;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Leaves extends Controller {
	
	public static Result applyIndex() {
		User user = User.findByEmail(request().username());
		session().get("email");
		request().username();
		return ok(leaveIndex.render(LeaveApplyContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
		
    }
	
	public static Result edit() {
		try {
			LeaveSave saveUtils = new LeaveSave();
			saveUtils.doSave(true);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Leave Edited Successfully");
    }
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  LeaveBucketSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }

	public static Result excelApplyReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  LeaveApplyContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			ApplyLeave status = ApplyLeave.findById(id);
			if(status.status == LeaveStatus.Approved)
			{
				return badRequest("Approved Leave cannot be Edited");
			}
			else
			return ok(editWizard.render(new LeaveApplyContext(ApplyLeave.findById(id)).build()));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Check Logs");
	}

	public static Result create() {
		Form<ApplyLeave> leaveForm = form(ApplyLeave.class).bindFromRequest();
		User user = User.findByEmail(request().username());
		leaveForm.get().user = user;
		leaveForm.get().pendingWith = user;
		leaveForm.get().leaveGuid = UUID.randomUUID().toString();
		leaveForm.get().status = LeaveStatus.Submitted;
		leaveForm.get().save();
		
		if(leaveForm.get().status == LeaveStatus.Submitted){
			leaveForm.get().pendingWith = user.manager;
			leaveForm.get().update();
		}
		
		try{
			VacationWorkflowUtils.startVacationWF(leaveForm.get().leaveGuid);
		}
		catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Leave Created Successfully");
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(LeaveApplyContext.getInstance().build().doSearch(form)));
    }
	
	public static Result leaveApprovalViaMail(){
		DynamicForm dynamicForm =DynamicForm .form().bindFromRequest();
		String query = dynamicForm.get("q");
		String leaveGUID = dynamicForm.get("id");
		
		ApplyLeave applyLeave = ApplyLeave.find.where().eq("leaveGuid", leaveGUID).findUnique();
		
		boolean isApproved;
		if(query.equals("yes")){
			isApproved = true;
		}
		else{
			isApproved = false;
		}
		
		
		if(applyLeave != null){
			String pid = applyLeave.processInstanceId;
			VacationWorkflowUtils.setVariableToTask(pid, isApproved,applyLeave.leaveGuid);
		}else{
		}
		
		return ok();
	}
	
	
	
	public static Result bucketIndex(){
		User user = User.findByEmail(request().username());
		return ok(leaveBucket.render(LeaveBucketSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
	}
	
	
	
	public static Result leaveSearch() {
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(LeaveBucketSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result approveLeave(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.data().get("query");
		if(query == null){
			query = form.data().get("leaveID");
		}
		for(String ids : query.split(",")){
			ApplyLeave leave = ApplyLeave.find.byId(Long.parseLong(ids));
			leave.status = LeaveStatus.Approved;
			leave.update(Long.parseLong(ids));
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "Selected Leave have been Approved";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result rejectLeave(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.data().get("query");
		if(query == null){
			query = form.data().get("leaveID");
		}
		for(String ids : query.split(",")){
			ApplyLeave leave = ApplyLeave.find.byId(Long.parseLong(ids));
			leave.status = LeaveStatus.Rejected;
			leave.update(Long.parseLong(ids));
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "Selected Leave have been Rejected";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result retractLeave(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.data().get("query");
		ApplyLeave leave = ApplyLeave.find.byId(Long.parseLong(query));
		DateTime today = new DateTime();
		if(today.isBefore(leave.startDate.getTime()))
		{
			if(leave.status == LeaveStatus.Submitted || leave.status == LeaveStatus.Approved)
			{
				leave.status = LeaveStatus.Withdrawn;
				leave.update();
					return ok("Leave has been WithDrawn Successfully");
			}
			else if(leave.status == LeaveStatus.Rejected)
					return ok("Leave is Rejected it cannot be Retracted");
			else
					return ok("Leave is Already WithDrawn");
		}
		else{
				return ok("Leave Period has Started it cannot be Withdrawn now");
		}
	}
}
