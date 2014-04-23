package controllers;
import static play.data.Form.form;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import models.notification.NotificationDO.Day;
import models.project.Project;
import models.task.Task;
import models.timesheet.Timesheet;
import models.timesheet.TimesheetRow;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.EmailExceptionHandler;
import utils.SelectUIMap;
import views.html.timesheet.searchTimesheet;
import views.html.timesheet.timesheetIndex;
import views.html.timesheet.timesheetTable;

import com.avaje.ebean.Expr;
import com.custom.domain.TimesheetStatus;
import com.custom.helpers.TimesheetSearchContext;
import com.custom.workflow.timesheet.TimesheetWorkflowUtils;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Timesheets extends Controller{
	
	private static HashMap<String,Integer> timesheetRowsMap = null;
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		Form<Timesheet> timesheetForm = form(Timesheet.class);
		return ok(timesheetIndex.render(MenuBarFixture.build(request().username()),user,timesheetForm));
    }
    
	//Submit
	public static Result create(){
		Form<Timesheet> timesheetForm = form(Timesheet.class).bindFromRequest();
		User user = User.findByEmail(request().username());
		timesheetForm.get().user = user;
		Form<Timesheet> newTimesheetForm;
		
		createHashMapOfTimesheetRows(timesheetForm.get());
//		for(String key : timesheetRowsMap.keySet()){
//			
//		}
		
		List<String> userProjects = getProjects(user.id, Integer.valueOf(timesheetForm.get().weekOfYear));
		
		if(Timesheet.byUser_Week_Year(user.id,timesheetForm.get().weekOfYear,timesheetForm.get().year).size() != 0){
			
			if(timesheetForm.get().status == TimesheetStatus.Submitted){
				timesheetForm.get().timesheetWith = user.manager;
			}else{
				timesheetForm.get().timesheetWith = user;
			}
			timesheetForm.get().update(timesheetForm.get().id);
			newTimesheetForm = form(Timesheet.class).fill(Timesheet.find.byId(timesheetForm.get().id));
			if(timesheetForm.get().status == TimesheetStatus.Submitted){
				System.out.println(newTimesheetForm.get().tid);
				try{
					TimesheetWorkflowUtils.startTimeSheetWF(newTimesheetForm.get().tid);
				}
				catch (Exception e) {
					EmailExceptionHandler.handleException(e);
				}
			}
			
			return ok(timesheetTable.render(user,newTimesheetForm,userProjects));
		}else{
			timesheetForm.get().id = null;
			if(timesheetForm.get().status == TimesheetStatus.Submitted){
				timesheetForm.get().timesheetWith = user.manager;
			}
			else{
				timesheetForm.get().timesheetWith = user;
			}
			timesheetForm.get().tid = UUID.randomUUID().toString();
			timesheetForm.get().save();
			System.out.println(timesheetForm.get().id);
			newTimesheetForm = timesheetForm.fill(Timesheet.find.byId(timesheetForm.get().id));
			
			if(timesheetForm.get().status == TimesheetStatus.Submitted){
				System.out.println(newTimesheetForm.get().tid);
				try{
					TimesheetWorkflowUtils.startTimeSheetWF(newTimesheetForm.get().tid);
				}
				catch (Exception e) {
					// TODO: handle exception
					EmailExceptionHandler.handleException(e);
				}
			}
			return ok(timesheetTable.render(user,newTimesheetForm,userProjects));
		}
	}
	
	public static Result retractTimesheet(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String id = form.data().get("id");
		User user = User.findByEmail(request().username());
		Timesheet timesheet = Timesheet.findById(Long.parseLong(id));
		timesheet.timesheetWith = user;
		timesheet.status = TimesheetStatus.Draft;
		timesheet.update();
		Form<Timesheet> timesheetForm = form(Timesheet.class).fill(timesheet);
		List<String> userProjects = getProjects(user.id, Integer.valueOf(timesheetForm.get().weekOfYear));
		return ok(timesheetTable.render(user,timesheetForm,userProjects));
	}
	
	public static HashMap<String,Integer> createHashMapOfTimesheetRows(Timesheet timesheet){
		timesheetRowsMap = new HashMap<String,Integer>();
		for(TimesheetRow row : timesheet.timesheetRows){
			if(timesheetRowsMap.containsKey(row.projectCode)){
				timesheetRowsMap.put(row.projectCode, timesheetRowsMap.get(row.projectCode)+row.totalHrs);
			}else{
				timesheetRowsMap.put(row.projectCode, row.totalHrs);
			}
		}
		return timesheetRowsMap;
	}
	
	
	
	public static Result getLastWeekTimesheet(Integer week,Integer year){
		User user = User.findByEmail(request().username());
		Form<Timesheet> timesheetForm;
		Timesheet timesheet;
		List<String> userProjects = getProjects(user.id, Integer.valueOf(week));
		
		if(userProjects.size() != 0){
			if(Timesheet.byUser_Week_Year(user.id,(week-1),year).size() != 0 ){
				timesheet = Timesheet.byUser_Week_Year(user.id,(week-1),year).get(0);
				timesheet.status = TimesheetStatus.Draft;
				timesheetForm = form(Timesheet.class).fill(timesheet);
			}else{
				timesheetForm = form(Timesheet.class);
			}
			
			int timesheetRowSize = 0;
			if(timesheetForm != null){
				timesheetRowSize = timesheetForm.get().timesheetRows.size();
			}
			
			if(userProjects.size() == timesheetRowSize){
				return ok(timesheetTable.render(user, timesheetForm,userProjects));
			}else{
				return badRequest("Sorry. You are not able to copy last week timesheet.");
			}
		}else{
			return badRequest("Sorry. No timesheet available.");
		}
	}
	
	public static Result cancel(){
		User user = User.findByEmail(request().username());
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		Form<Timesheet> newTimesheetForm = form(Timesheet.class).fill(Timesheet.byUser_Week_Year
												(user.id, cal.get(Calendar.WEEK_OF_YEAR), 
														cal.get(Calendar.YEAR)).get(0));
		List<String> userProjects = getProjects(user.id, Integer.valueOf(newTimesheetForm.get().weekOfYear));
		return ok(timesheetTable.render(user,newTimesheetForm,userProjects));
	}
	
	public static List<String> getProjects(Long id, int week){
		User user = User.findById(id);
		List<String> projects = new ArrayList<String>(); 
		for(Project project : Project.find.where().add(Expr.eq("users", user)).findList()){
			if(checkProjectDateValidation(user,project.projectCode,week)){
				projects.add(project.projectCode);
			}
		}
		return projects;
	}
	
	public static boolean checkProjectDateValidation(User user, String projectCode, int week){
		Project project = Project.findByProjectCode(projectCode);
		if(user.hireDate != null){
			if(getWeekNumber(project.startDate) <= week && getWeekNumber(project.endDate) >= week 
					&& getWeekNumber(user.hireDate) <= week){
//				if(project.endDate != null){
//					if(getWeekNumber(project.endDate) >= week){
						return true;
//					}else{
//						return false;
//					}
//				}else{
//					return true;
//				}
			}else{
				return false;
			}
		}else{
			return false;
		}
//		Project project = Project.findByProjectCode(projectCode);
//		if(getWeekNumber(user.hireDate) <= week && getWeekNumber(user.hireDate) >= getWeekNumber(project.startDate)){
//			if(week >= getWeekNumber(project.startDate) && week <= getWeekNumber(project.endDate)){
//				return true;
//			}else{
//				return false;
//			}
//		}else{
//			return false;
//		}
	}
	
	public static int getWeekNumber(Date date){
		Calendar userCal = Calendar.getInstance();
		userCal.setFirstDayOfWeek(1);
		userCal.setTime(date);
		return userCal.get(Calendar.WEEK_OF_YEAR);
	}
	
	public static List<String> getTaskByProject(Long userId,String projectCode){
		List<String> tasks = new ArrayList<String>(); 
		Project project = Project.find.where().add(Expr.eq("projectCode", projectCode)).findUnique();
		for(Task task : Task.find.where().add(Expr.eq("projects", project)).findList()){
			tasks.add(task.taskCode);
		}
		return tasks;
	}
	
	public static Result getTimesheetTable(String id,String week,String year){
		User user = User.findByEmail(request().username());
		Form<Timesheet> timesheetForm;
		Timesheet timesheet;
		if(Timesheet.byUser_Week_Year(Long.parseLong(id),Integer.valueOf(week),Integer.valueOf(year)).size() != 0){
			timesheet = Timesheet.byUser_Week_Year(Long.parseLong(id),Integer.valueOf(week),Integer.valueOf(year)).get(0);
			timesheetForm = form(Timesheet.class).fill(timesheet);
		}else{
			timesheetForm = form(Timesheet.class);
		}
		
		List<String> userProjects = getProjects(user.id, Integer.valueOf(week)); 
		return ok(timesheetTable.render(user, timesheetForm, userProjects));
	}
	
	public static Result getTaskCodes(String _value){
		Project projects = Project.find.where().add(Expr.eq("projectCode", _value)).findUnique();
		List<Task> listOfTasks = Task.find.where().add(Expr.eq("projects", projects)).findList(); 
		SelectUIMap[] maps=new SelectUIMap[listOfTasks.size()];
		for(int i=0;i<listOfTasks.size();i++){
			maps[i]=new SelectUIMap(listOfTasks.get(i).taskCode, listOfTasks.get(i).taskCode);
		}
		return ok(Json.toJson(maps));
	}
	
	public static List<String> getTimesheetStatus(){
		TimesheetStatus[] status = TimesheetStatus.values();
		List<String> timesheetStatus = new ArrayList<String>();
		for(int i=0;i<status.length;i++){
			timesheetStatus.add(status[i].name());
		}
		return timesheetStatus;
	}
	
	public static Result searchIndex(){
		User user = User.findByEmail(request().username());
		Form<Timesheet> timesheetForm = form(Timesheet.class);
		return ok(searchTimesheet.render(TimesheetSearchContext.getInstance().build(),MenuBarFixture.build(request().username()), user,timesheetForm));
	}
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(TimesheetSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result editTimesheet(String id){
		User user = User.findByEmail(request().username());
		Timesheet timesheet = Timesheet.findById(Long.parseLong(id));
		Form<Timesheet> timesheetForm = form(Timesheet.class).fill(timesheet);
		return ok(timesheetIndex.render(MenuBarFixture.build(request().username()),user,timesheetForm));
	}
	
	public static Result timeSheetApprovalViaMail(){
		DynamicForm dynamicForm =DynamicForm .form().bindFromRequest();
		String query = dynamicForm.get("q");
		String tid = dynamicForm.get("id");
		
		Timesheet timesheet = Timesheet.find.where().eq("tid", tid).findUnique();
		
		boolean isApproved;
		if(query.equals("yes")){
			isApproved = true;
		}
		else{
			isApproved = false;
		}
		
		
		if(timesheet != null){
			String pid = timesheet.processInstanceId;
			TimesheetWorkflowUtils.setVariableToTask(pid, isApproved,timesheet.tid);
		}else{
		}
		return ok();
	}
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  TimesheetSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
}