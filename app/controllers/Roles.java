package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;

import models.role.RoleLevel;
import models.role.RoleX;
import models.user.User;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.editWizard;
import views.html.role.defineOrgHierarchy;
import views.html.role.defineRoles;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import com.avaje.ebean.SqlRow;
import com.custom.domain.RoleLevels;
import com.custom.helpers.CustomRoleSearchContext;
import com.custom.helpers.RoleSave;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;


@Security.Authenticated(Secured.class)
@BasicAuth
public class Roles extends Controller{

	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		return ok(Json.toJson(CustomRoleSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result edit() {
		try {
			RoleSave saveUtils = new RoleSave();
			saveUtils.doSave(true);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok();
    }
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		return ok(views.html.role.roleIndex.render(CustomRoleSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result create() {
		try {
			RoleSave saveUtils = new RoleSave();
			saveUtils.doSave(false);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok();
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			return ok(editWizard.render(new CustomRoleSearchContext(RoleX.findById(id)).build()));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Check Logs");
	}
	
	public static Result defineRoles(){
		User user = User.findByEmail(request().username());
		RoleX roleX = RoleX.find.where(Expr.eq("company", user.companyobject)).findUnique();
		Form<RoleX> roleXForm;
		if(roleX != null){
			System.out.println(roleX.roleLevels.get(0).permissions);
			roleXForm = form(RoleX.class).fill(roleX);
			System.out.println("To Send = "+roleXForm.get().roleLevels.get(0).permissions);
		}else{
			roleXForm = form(RoleX.class);
		}
		return ok(defineRoles.render(MenuBarFixture.build(request().username()),user,roleXForm));
	}
	
	
	public static Result saveRole(){
		User user = User.findByEmail(request().username());
		Form<RoleX> roleXForm = form(RoleX.class).bindFromRequest();
		RoleX roleX = RoleX.find.where(Expr.eq("company", user.companyobject)).findUnique();
		
		if(roleX != null){
			for(RoleLevel _rl : roleXForm.get().roleLevels){
				if( _rl.id != null ){
				_rl.update();
				} else {
					_rl.roleX = roleX;
					_rl.save();
				}
			}
			
		}else{
			roleXForm.get().company = user.companyobject;
			roleXForm.get().save();
		}
		String requestUrl = request().path().toString();
		if(requestUrl.equals("/saveOrg"))
			return ok("Defined Hierarchy has been saved");
		else
			return ok("Defined Roles has been saved");
	}
	
	public static Result showRoles(){
		User user = User.findByEmail(request().username());
		RoleX roleX = RoleX.find.where().add(Expr.eq("company", user.companyobject)).findUnique();
		if(roleX != null){
			Form<RoleX> roleXForm = form(RoleX.class).fill(roleX);
			return ok(defineOrgHierarchy.render(MenuBarFixture.build(request().username()),user,roleXForm));
		}else{
			Form<RoleX> roleXForm = form(RoleX.class);
			return ok(defineOrgHierarchy.render(MenuBarFixture.build(request().username()),user,roleXForm));
		}
	}
	
	public static List<String> getRoleLevels(){
		RoleLevels[] rolelevel = RoleLevels.values();
		List<String> roleLevels = new ArrayList<String>();
		for(int i=0;i<rolelevel.length;i++){
			roleLevels.add(rolelevel[i].name());
		}
		return roleLevels;
	}
	
	public static List<String> getAllRoles(){
		User user = User.findByEmail(request().username());
		List<String> roleLevels = new ArrayList<String>();
		
		List<RoleLevel> roleLevelList = RoleLevel.findListByCompany(user.companyobject.id);
		for(int i=0;i<roleLevelList.size();i++){
			roleLevels.add(roleLevelList.get(i).role_name);
		}
		return roleLevels;
	}
	
}
