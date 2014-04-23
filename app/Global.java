import org.apache.commons.lang.exception.ExceptionUtils;

import play.mvc.Result;
import play.mvc.Http.RequestHeader;

import com.custom.emails.Email;


public class Global extends  play.GlobalSettings {
	
	@Override
	public Result onError(RequestHeader arg0, Throwable t) {
		String stackTrace = ExceptionUtils.getStackTrace(t);
		Email.sendOnlyMail(null,"prashant@suzeva.com", "Crash Report for Time @ " + arg0.uri(), stackTrace);
		return super.onError(arg0, t);
	}
	 

//	@Override
//	public void onStart(Application arg0) {
//		
//		List<Notification> notifications = new ArrayList<Notification>();
//		notifications = Notification.find.all();
//		Map<Long,List<DateTime>> _notificationMap = new HashMap<Long,List<DateTime>>();
//		for(Notification _n:notifications){
//			NotificationDO[] notificationDOs =Json.fromJson(Json.parse(_n.settingAsJson),NotificationDO[].class);
//			
//			List<DateTime> dateTimes = _notificationMap.get(_n.company.id);
//			if(dateTimes == null){
//				dateTimes = new ArrayList<DateTime>();
//			}
//			
//			for(NotificationDO notificationDO :notificationDOs){
//				dateTimes.add(notificationDO.getDateTime());
//			}
//			_notificationMap.put(_n.company.id, dateTimes);
//		}
//		
//		//ScheduleManager.reSchedule(_notificationMap);
//		
//		
//		super.onStart(arg0);
//	}

}
