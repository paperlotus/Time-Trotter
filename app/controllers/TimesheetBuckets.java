package controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import models.timesheet.Timesheet;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.EmailExceptionHandler;
import utils.ExceptionHandler;
import views.html.timesheet.timesheetsBucket;
import views.html.timesheet.viewTimesheet;

import com.custom.helpers.TimesheetBucketSearchContext;
import com.custom.workflow.timesheet.TimesheetWorkflowUtils;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class TimesheetBuckets extends Controller {

	public static Result index(){
		User user = User.findByEmail(request().username());
		return ok(timesheetsBucket.render(TimesheetBucketSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
	}
	
	public static Result search() {
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(TimesheetBucketSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  TimesheetBucketSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	public static Result approveTimesheets(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.data().get("query");
		if(query == null){
			query = form.data().get("timesheetID_hidden");
		}
		for(String ids : query.split(",")){
			Timesheet timesheet = Timesheet.find.byId(Long.parseLong(ids));
			try{
				TimesheetWorkflowUtils.setVariableToTask(timesheet.processInstanceId, true, timesheet.tid);
			}
			catch (Exception e) {
				ExceptionHandler.onError(request().uri(),e);
			}
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "TimeSheet has been Approved";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}

	public static Result approveTimesheetsOk(String id){
		System.out.println(id+"----------------");
		Timesheet timesheet = Timesheet.find.byId(Long.parseLong(id));
		try{
			TimesheetWorkflowUtils.setVariableToTask(timesheet.processInstanceId, true, timesheet.tid);
		}
		catch (Exception e) {
			EmailExceptionHandler.handleException(e);
		}
		Integer count = Application.count();
		String notification = count.toString(); 
		String message = "TimeSheet has been Approved";
		Map<String,String> jsonMap = new HashMap<String,String>();
		jsonMap.put("count", notification);
		jsonMap.put("message", message);
		return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result rejectTimesheetsOk(String id){
		
		Timesheet timesheet = Timesheet.find.byId(Long.parseLong(id));
		
		try{
			TimesheetWorkflowUtils.setVariableToTask(timesheet.processInstanceId, false, timesheet.tid);
		}
		catch (Exception e) {
			EmailExceptionHandler.handleException(e);
		}
			Integer count = Application.count();
			String notification = count.toString(); 
			String message = "TimeSheet has been Rejected";
			Map<String,String> jsonMap = new HashMap<String,String>();
			jsonMap.put("count", notification);
			jsonMap.put("message", message);
			return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result rejectTimesheets(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.data().get("query");
		if(query == null){
			query = form.data().get("timesheetID_hidden");
		}
		for(String ids : query.split(",")){
			Timesheet timesheet = Timesheet.find.byId(Long.parseLong(ids));
			try{
				TimesheetWorkflowUtils.setVariableToTask(timesheet.processInstanceId, false, timesheet.tid);
			}
			catch (Exception e) {
				ExceptionHandler.onError(request().uri(),e);
			}
		}
		
			Integer count = Application.count();
			String notification = count.toString(); 
			String message = "TimeSheet has been Rejected";
			Map<String,String> jsonMap = new HashMap<String,String>();
			jsonMap.put("count", notification);
			jsonMap.put("message", message);
			return ok(Json.toJson(jsonMap)).as("JSON");
	}
	
	public static Result displaySelectedTimesheet(String query){
		User user = User.findByEmail(request().username());
		Timesheet timesheet = Timesheet.find.byId(Long.parseLong(query));
		return ok(viewTimesheet.render(timesheet, user));
	}
	
}
