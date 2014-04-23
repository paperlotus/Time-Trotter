package controllers;

import static play.data.Form.form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import models.notification.Notification;
import models.notification.NotificationDO;
import models.user.User;

import org.codehaus.jackson.JsonNode;
import org.joda.time.DateTime;

import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.index;
import views.html.notification.notificationIndex;

import com.custom.ScheduleManager;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Notifications extends Controller {
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		Notification notify = Notification.find.where().eq("company", user.companyobject).findUnique();
		Form<JsonNode> notifyForm;
		if(notify==null || notify.settingAsJson == null){
			notifyForm = form(JsonNode.class).fill(Json.toJson(Arrays.asList(new NotificationDO(NotificationDO.Day.Sunday),
					new NotificationDO(NotificationDO.Day.Monday),new NotificationDO(NotificationDO.Day.Tuesday),new NotificationDO(NotificationDO.Day.Wednesday),
					new NotificationDO(NotificationDO.Day.Thursday),new NotificationDO(NotificationDO.Day.Friday),new NotificationDO(NotificationDO.Day.Saturday))));
		}else{
			notifyForm = form(JsonNode.class).fill(Json.parse(notify.settingAsJson));
			
		}
		
		return ok(notificationIndex.render(MenuBarFixture.build(request().username()),user,notifyForm));
    }
	
	public static Result save() throws ParseException
	{
		
		User user = User.findByEmail(request().username());
		Map<String,String[]> _rmap = request().body().asFormUrlEncoded();
		
		List<NotificationDO> list = new ArrayList<NotificationDO>();
		String[] mins = _rmap.get("m[]");
		String[] hrs = _rmap.get("h[]");
		
		for(int _day =0 ; _day < 7 ; _day++){
			list.add(new NotificationDO(NotificationDO.Day.values()[_day],hrs[_day],mins[_day]));
		}
		/**Database handling start*/
		String asJson = Json.toJson(list).toString();
		Notification notificationModel = Notification.find.where().eq("company", user.companyobject).findUnique();
		Notification notify= new Notification();
		notify.company = user.companyobject;
		notify.settingAsJson = asJson;
		if(notificationModel==null){
			notify.save();
		}else{
			notificationModel.settingAsJson = asJson;
			notificationModel.update();
		}
		/**Database handling end*/
		
		List<DateTime> plannedTimes = new ArrayList<DateTime>(); 
		for(NotificationDO notificationDO:list){
			if(notificationDO.dateTime!=null){
				plannedTimes.add(notificationDO.dateTime);
			}
		}
		ScheduleManager.reSchedule(plannedTimes, user.companyobject.id);
		return ok(index.render(MenuBarFixture.build(request().username()),User.findByEmail(request().username())));
	}

}
