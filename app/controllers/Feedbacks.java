package controllers;

import static play.data.Form.form;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.feedback.Feedback;
import models.user.User;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.feedback.createFeedback;
import views.html.feedback.feedbackIndex;
import views.html.feedback.viewFeedback;

import com.custom.domain.Rating;
import com.custom.helpers.CustomFeedbackSearchContext;
import com.custom.helpers.FeedbackSearchContext;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Feedbacks extends Controller{

	public static Result customIndex() {
		User user = User.findByEmail(request().username());
		session().get("email");
		request().username();
		return ok(feedbackIndex.render(CustomFeedbackSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		session().get("email");
		request().username();
		return ok(feedbackIndex.render(FeedbackSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	//FeedbackProxySearchModel
	public static Result create() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			User us = User.findById(id);
			Form<Feedback> feedbackForm = form(Feedback.class);
			return ok(createFeedback.render(feedbackForm, us));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Please check Employee for feedback.");
	}
	
	public static Result submit(){
		Form<Feedback> feedbackForm = form(Feedback.class).bindFromRequest();
		User user = User.findById(Long.parseLong(feedbackForm.data().get("employeeID")));
		feedbackForm.get().user = user;
		feedbackForm.get().manager = User.findByEmail(request().username());
		feedbackForm.get().save();
		return ok("Feedback Submitted Successfully");
	}
	
	public static Result customSearchIndex(){
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(CustomFeedbackSearchContext.getInstance().build().doSearch(form)));
	}
	
	public static Result searchIndex(){
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(FeedbackSearchContext.getInstance().build().doSearch(form)));
	}
	
	public static List<String> getRatingOptions(){
		Rating[] rating = Rating.values();
		List<String> ratings = new ArrayList<String>();
		for(int i=0;i<rating.length;i++){
			ratings.add(rating[i].name());
		}
		return ratings;
	}
	
	public static Result display(){
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			SimpleDateFormat customDateFormat = new SimpleDateFormat("dd MMM yyyy");
	        id = Long.valueOf(form.get("query"));
			Feedback feedback = Feedback.find.byId(id);
			feedback.feedbackDateDisplay = customDateFormat.format(feedback.feedbackDate);
			return ok(viewFeedback.render(feedback,user));
		}catch(NumberFormatException nfe){
			ExceptionHandler.onError(request().uri(),nfe);
		}
		return ok("Not able to show Results, Please select feedback.");
	}
	
}
