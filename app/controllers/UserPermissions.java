package controllers;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import views.html.userPermission.mainPermission;

import com.avaje.ebean.Expr;
import com.avaje.ebean.Expression;
import com.custom.domain.Permissions;
import com.google.common.base.Function;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.auth.BasicAuthAction;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class UserPermissions extends Controller {
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		return ok(mainPermission.render(MenuBarFixture.build(request().cookie("email").value()), user));
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
		User user = User.find.byId(uid);
		user.setPermissions(result);
		user.update(user.id);
		return ok("Permissions Saved Successfully");
	}
	public static Result update(){
		DynamicForm form = form().bindFromRequest();
		
		Long id = Long.parseLong(form.get("id"));
		User user = User.find.byId(id);
		List<AvailablePermission> list = new ArrayList<AvailablePermission>();
		Permissions[] permissions = Permissions.values();
		List<String> userPermission=new ArrayList<String>();
		if(user.getPermissions() != null){
			String permission = user.getPermissions();
			String[] permissionArray = permission.split("[|]");
			for(String pa : permissionArray){
				userPermission.add(pa);
			}
		}
		AvailablePermission available= null;
		for(Permissions p:permissions){
			if(!p.name().equals("CompanyRequest")){
				if(userPermission.size()!=0 && userPermission.contains(p.name())){
					if(p.parent() != null){
						if(p.url() != "#"){
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,true,true);
						}else{
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,true,false);
						}	
					}else{
						if(p.url() != "#"){
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,false,true);
						}else{
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), true,false,false);
						}	
					}
					list.add(available);
				}else{
					if(p.parent() != null){
						if(p.url() != "#"){
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,true,true);
						}else{
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,true,false);
						}	
					}else{
						if(p.url() != "#"){
							if("Home".equals(p.name())){
								available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,false,true);
							}else{
								available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,false,true);
							}
						}else{
							available = new AvailablePermission(p.name(),p.parent() == null ? p.display():  p.display(), false,false,false);
						}	
					}
					list.add(available);
				}
			}
		}
		return ok(Json.toJson(list));
	}
	public static Result getUserList(){
		
		User user = User.findByEmail(request().username());
		
		DynamicForm form = form().bindFromRequest();
		PageData pageData = new PageData(Integer.valueOf(form.get("rows")),
							Integer.valueOf(form.get("page")));
		int page = Integer.parseInt(form.get("page"));
		int limit = Integer.parseInt(form.get("rows"));
		double min = Double.parseDouble(form.get("rows"));
		String sidx = form.get("sidx");
		String sord = form.get("sord");
		
		List<Expression> expressions = new ArrayList<Expression>();
		if(form.get("firstName") != null){
			expressions.add( Expr.like("firstName", "%"+form.get("firstName")+"%"));
		}
		
		if(form.get("lastName") != null){
			expressions.add( Expr.like("lastName", "%"+form.get("lastName")+"%"));
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
			count = User.find.where().eq("userStatus", com.custom.domain.Status.Approved).eq("companyobject.companyCode", user.companyobject.getCompanyCode()).add(exp)
						.ne("email", user.email).findRowCount();
		}
		else{
			count = User.find.where().eq("userStatus", com.custom.domain.Status.Approved).eq("companyobject.companyCode", user.companyobject.getCompanyCode())
						.ne("email", user.email).findRowCount();
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
		List<User> results =  exp == null ?models.user.User.find.where().eq("userStatus", com.custom.domain.Status.Approved).eq("companyobject.companyCode", user.companyobject.getCompanyCode())
							.ne("email", user.email).setFirstRow(start).setMaxRows(limit).findList()
					:models.user.User.find.where().eq("userStatus", com.custom.domain.Status.Approved).eq("companyobject.companyCode", user.companyobject.getCompanyCode()).add(exp)
							 .ne("email", user.email).setFirstRow(start).setMaxRows(limit).findList();
							
		List<GridViewModel.RowViewModel> rows = transform(results, toJqGridFormat()) ;
		GridViewModel gridViewModel = new GridViewModel(pageData, count, rows);
		return ok(Json.toJson(gridViewModel));
	}
	
	private static Function<User,RowViewModel> toJqGridFormat() {
		return new Function<User, RowViewModel>() {
		
			@Override
			public RowViewModel apply(User user) {
		
				List<String> allPerission = new ArrayList<String>();
				for(Permissions tempPerm : Arrays.asList(Permissions.values())){
					allPerission.add(tempPerm.name());
				}
				
				List<String> blackListedPermissions = new ArrayList<String>();
				String permissions="";
				if(user.getPermissions() != null && !"".equals(user.getPermissions())){
					blackListedPermissions = Arrays.asList(user.getPermissions().split("[|]"));
					for(String permission : allPerission){
						if(!"CompanyRequest".equals(permission)){
							if(!blackListedPermissions.contains(permission)){
								permissions = permissions.concat(permission).concat("|");
							}
						}
					}
				}
				
				return new GridViewModel.RowViewModel((user.id).intValue(), newArrayList(
						user.employeeId,
						user.firstName,
						user.lastName,
						user.designation.toString(),
						permissions,
					Long.toString(user.id)));
			}
		};
	}
}
