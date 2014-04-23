package controllers;

import models.user.User;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.report.reportIndex;

import com.custom.ui.search.helper.TeamRateReportSearchUI;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Reports extends Controller{

	public static Result teamRateIndex() {
		User user = User.findByEmail(request().username());
		return ok(reportIndex.render(TeamRateReportSearchUI.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result teamRateSearch() {
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(TeamRateReportSearchUI.getInstance().build().doSearch(form)));
    }
	
}
