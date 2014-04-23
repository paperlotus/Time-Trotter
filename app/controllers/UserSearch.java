package controllers;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import com.custom.ui.search.helper.UserSearchUI;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.helper.SearchUI;

@Security.Authenticated(Secured.class)
@BasicAuth
public class UserSearch extends Controller{
	private static SearchUI searchUI = new UserSearchUI().build();
	
	public static Result index(){
		return ok(views.html.searchPopup.render(searchUI));
	}
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(searchUI.doSearch(form)));
    }
}
