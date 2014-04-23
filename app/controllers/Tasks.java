package controllers;

import static com.google.common.collect.Lists.transform;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.project.Project;
import models.task.Task;
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
import views.html.tasks.taskIndex;

import com.custom.helpers.ProjectSearchContext;
import com.custom.helpers.TaskSave;
import com.custom.helpers.TaskSearchContext;
import com.google.common.base.Function;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.ui.component.AutoComplete;

import dto.fixtures.MenuBarFixture;


@Security.Authenticated(Secured.class)
@BasicAuth
public class Tasks extends Controller {
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(TaskSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result edit() {
		try {
			TaskSave saveUtils = new TaskSave();
			saveUtils.doSave(true);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Tasks Edited Successfully");
    }
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  TaskSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		return ok(taskIndex.render(TaskSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result create() {
		try {
			Map<String, Object> extra = new HashMap<String, Object>();
			TaskSave saveUtils = new TaskSave(extra);
			saveUtils.doSave(false);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Tasks Created Successfully");
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			return ok(editWizard.render(new TaskSearchContext(Task.findById(id)).build()));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Check Logs");
		
	}
	
	public static Result findProjectByName(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.get("query");
		System.out.println(query);
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(Projects.findProjectByName(query), toAutoCompleteFormatForProject());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}
	
	private static Function<Project,AutoComplete> toAutoCompleteFormatForProject() {
		return new Function<Project, AutoComplete>() {
			@Override
			public AutoComplete apply(Project project) {
					return new AutoComplete(project.projectCode,project.projectName,project.clientName.clientName,project.id);
			}
		};
	}

}
