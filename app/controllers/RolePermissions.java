package controllers;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.role.RoleLevel;
import models.role.RoleX;
import models.user.User;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.AvailablePermission;
import utils.GridViewModel;
import utils.GridViewModel.PageData;
import utils.GridViewModel.RowViewModel;
import views.html.userPermission.roleMainPermission;

import com.avaje.ebean.Expr;
import com.avaje.ebean.Expression;
import com.custom.domain.Permissions;
import com.google.common.base.Function;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.auth.BasicAuthAction;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class RolePermissions extends Controller {
	private static final String DELIMITER = " | ";
	public static Result index() {
		User user = User.findByEmail(request().cookie("email").value());
		return ok(roleMainPermission.render(MenuBarFixture.build(request().cookie("email").value()), user));
	}
	
	public static Result save(){
		DynamicForm form = form().bindFromRequest();
		Long uid = Long.parseLong(form.get("id"));
		int len=0;
		if(request().body().asFormUrlEncoded().containsKey("permissions")){
			len=request().body().asFormUrlEncoded().get("permissions").length;
		}
		
		String result = "";
		
		for(int i=0;i<len;i++){
			result += request().body().asFormUrlEncoded().get("permissions")[i]+BasicAuthAction.DELIMITER;
		}
		
		RoleLevel roleLevel = RoleLevel.find.byId(uid);
//		if(roleLevel.permissions == null){
			roleLevel.setPermissions(result);
			roleLevel.update();
//		}else{
//			permission = PermissionManager.findByRoleLevel(roleLevel.id);
//			permission.setPermissions(result);
//			permission.roleLevel = roleLevel;
//			permission.update();
//		}
		return ok("Permissions Saved Successfully");
	}
	
	public static Result update(){
		DynamicForm form = form().bindFromRequest();
		
		Long id = Long.parseLong(form.get("id"));
		RoleLevel roleLevel = RoleLevel.find.byId(id);
		
		Permissions[] permissions = Permissions.values();
		List<AvailablePermission> list = new ArrayList<AvailablePermission>();
		List<String> userPermission=new ArrayList<String>();
		if(roleLevel.getPermissions() != null){
			String permissions1 = roleLevel.getPermissions();
			String[] permissionArray = permissions1.split("\\"+BasicAuthAction.DELIMITER);
			for(String pa : permissionArray){
				userPermission.add(pa);
			}
		}
		AvailablePermission available= null;
		for(Permissions p:permissions){
			if(!p.name().equals("CompanyRequest"))
			{
				if(userPermission.size()!=0 && userPermission.contains(p.name())){
					if(p.parent() != null){
						if(p.url() != "#")
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,true,true);
						else
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,true,false);
					}
					else{
						if(p.url() != "#")
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,false,true);
						else
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,false,false);
					}
						list.add(available);
				}else{
					if(p.parent() != null){
						if(p.url() != "#")
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,true,true);
						else
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,true,false);
					}else{
						if(p.url() != "#")
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,false,true);
						else
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,false,false);
					}
					list.add(available);
				}
			}
		}
		return ok(Json.toJson(list));
	}
	public static Result getRoleList(){
		DynamicForm form = form().bindFromRequest();
		PageData pageData = new PageData(Integer.valueOf(form.get("rows")),
							Integer.valueOf(form.get("page")));
		int page = Integer.parseInt(form.get("page"));
		int limit = Integer.parseInt(form.get("rows"));
		double min = Double.parseDouble(form.get("rows"));
		String sidx = form.get("sidx");
		String sord = form.get("sord");
		List<RoleX> results = null;
		
		List<Expression> expressions = new ArrayList<Expression>();
		
		expressions.add(Expr.eq("company", User.findByEmail(request().cookie("email").value()).companyobject));
		
		if(form.get("role_name") != null){
			expressions.add( Expr.like("role_name", "%"+form.get("role_name")+"%"));
		}
		
		int count =0;
		Expression exp = null;
		if(expressions.size()!=0)
		{
			exp = expressions.get(0);
			for(int i =1;i<expressions.size();i++)
			{
				exp = Expr.and(exp, expressions.get(i));
			}
			count = RoleX.find.where().add(exp).findRowCount();
		}
		else{
			count = RoleX.find.where().findRowCount();
		}
			//results = Agent.find.where().add(exp).findList();
			int total_pages=0;
			if(count > 0){
				total_pages = (int) Math.ceil(count/min);
			}
			else{
				total_pages = 0;
			}
			
			if(page > total_pages){
				page = total_pages;
			}
			
			int start = limit*page - limit;
		RoleX role =  exp == null ?RoleX.find.setFirstRow(start).setMaxRows(limit).findUnique()
					:RoleX.find.where().add(exp).setFirstRow(start).setMaxRows(limit).findUnique();
			
		List<GridViewModel.RowViewModel> rows = transform(role.roleLevels, toJqGridFormat());
		GridViewModel gridViewModel = new GridViewModel(pageData, count, rows);
		return ok(Json.toJson(gridViewModel));
	}
	
	private static Function<RoleLevel,RowViewModel> toJqGridFormat() {
		return new Function<RoleLevel, RowViewModel>() {
		
			@Override
			public RowViewModel apply(RoleLevel roleLevel) {
				
				List<String> allPerission = new ArrayList<String>();
				for(Permissions tempPerm : Arrays.asList(Permissions.values())){
					allPerission.add(tempPerm.name());
				}
				
				List<String> blackListedPermissions = new ArrayList<String>();
				String permissions="";
				if(roleLevel.getPermissions() != null && !"".equals(roleLevel.getPermissions())){
					blackListedPermissions = Arrays.asList(roleLevel.getPermissions().split("[|]"));
//					permissions = roleLevel.getPermissions();
					for(String permission : allPerission){
						if(!blackListedPermissions.contains(permission)){
							permissions = permissions.concat(permission).concat("|");
						}
					}
				}
				
				return new GridViewModel.RowViewModel((roleLevel.id).intValue(), newArrayList(
						roleLevel.role_name,
						permissions,
						Long.toString(roleLevel.id)));
			}
		};
	}
}
