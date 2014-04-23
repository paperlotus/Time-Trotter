package com.mnt.core.auth;

import java.util.Arrays;
import java.util.List;

import models.role.RoleLevel;
import models.user.User;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;
import views.html.userPermission.restrictedPage;

import com.avaje.ebean.Expr;
import com.custom.domain.BlackListedPermissions;

public class BasicAuthAction extends Action<BasicAuth>{
	public static final String DELIMITER = "|";
	@Override
	public Result call(Context ctx) throws Throwable {
		String userName = ctx.request().username();
        if(isInUserPermission(userName, ctx.request().uri())){
               return delegate.call(ctx);
        }
        return ok(restrictedPage.render());
	}
	
	public static boolean isInRolePermission(String userName, String menu) {
		User user = User.findByEmail(userName);
		List<String> blackListedPermissions = null;
		
		if("SuperAdmin".equals(user.designation)){
			blackListedPermissions = Arrays.asList(user.getPermissions().split("[|]"));
		}else if("Admin".equals(user.designation)){
			return isInUserPermission(user.email, menu);
		}else{
			RoleLevel roleLevel = RoleLevel.find.where().add(Expr.eq("role_level", user.designation)).findUnique();
			if(roleLevel.getPermissions() != null && !"".equals(roleLevel.getPermissions())){
				blackListedPermissions = Arrays.asList(roleLevel.getPermissions().split("[|]"));
			}else{
				blackListedPermissions = Arrays.asList(
						BlackListedPermissions.BLACKLISTED_PERMISSIONS_FOR_USERS.split("[|]"));
			}
		}
		if(!"Admin".equals(user.designation)){
        	if(blackListedPermissions.contains(menu)){ //|| "CompanyRequest".equals(menu)
        		return false;
        	}
        }
		return true;
	}

	public static boolean isInUserPermission(String userName,String menu){
        // Logic to check the uri in permission list for User, if yes return true else false
        User user = User.findByEmail(userName);
        if("CompanyRequest".equals(menu)){
        	if("SuperAdmin".equals(user.designation)){
        		return true;
    		}else{
    			return false;
    		}
		}
        
        List<String> blackListedPermissions = null;
        if(user.getPermissions() != null){
        	blackListedPermissions = Arrays.asList(user.getPermissions().split("[|]"));
           	if(blackListedPermissions.contains(menu)){
           		return false;
           	}
        }else{
        	return false;
        }
        return true;
	}
}