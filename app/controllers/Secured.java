package controllers;

import models.user.User;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
    	if(User.findByEmail(ctx.session().get("email"))!=null){
    		return ctx.session().get("email");
    	}
    	return null;
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }
}