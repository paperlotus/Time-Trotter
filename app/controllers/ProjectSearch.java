package controllers;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import com.custom.ui.search.helper.ProjectSearchUI;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.helper.SearchUI;

@Security.Authenticated(Secured.class)
@BasicAuth
public class ProjectSearch extends Controller {
	private static SearchUI searchUI = new ProjectSearchUI().build();
	
	public static Result index(){
		return ok(views.html.searchPopup.render(searchUI));
	}
	
	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		return ok(Json.toJson(searchUI.doSearch(form)));
    }
}
