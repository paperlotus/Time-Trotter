package controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.project.Project;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.editWizard;
import views.html.projects.projectIndex;

import com.avaje.ebean.Expr;
import com.custom.helpers.ProjectSave;
import com.custom.helpers.ProjectSearchContext;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;


@Security.Authenticated(Secured.class)
@BasicAuth
public class Projects extends Controller {
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(ProjectSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result edit() {
		try {
			ProjectSave saveUtils = new ProjectSave();
			saveUtils.doSave(true);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Project Edited Successfully");
    }
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		return ok(projectIndex.render(ProjectSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  ProjectSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	public static Result create() {
		try {
			Map<String, Object> extra = new HashMap<String, Object>();
			extra.put("companyObj", User.findByEmail(request().username()).companyobject);
			ProjectSave saveUtils = new ProjectSave(extra);
			saveUtils.doSave(false);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Project Created Successfully");
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			return ok(editWizard.render(new ProjectSearchContext(Project.findById(id)).build()));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Check Logs");
		
	}
	
	public static Result checkProjectCodeAvailability(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		Project p = Project.find.where().eq("projectCode", q).findUnique();
		if(p==null){
			return ok(Json.toJson(true));
		}
		return ok(Json.toJson(false));
	}
	public static List<Project> findProjectByName(String query) {
		User user = User.findByEmail(request().username());
		List<Project> projects =  Project.find.where().and(Expr.eq("companyObj.companyCode", user.companyobject.getCompanyCode()),Expr.or(Expr.ilike("projectName", query+"%"),Expr.ilike("projectCode", query+"%")))
	       		.findList();
		return projects;
	}

}
