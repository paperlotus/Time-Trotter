package utils;

import org.apache.commons.lang.exception.ExceptionUtils;

import play.mvc.Http.RequestHeader;

import com.custom.emails.Email;

public class ExceptionHandler {

	public static void onError(RequestHeader arg0, Throwable t) {
		onError(arg0.uri(), t);
	}
	
	public static void onError(Throwable t) {
		onError("", t);
	}
	
	public static void onError(String uri, Throwable t) {
		String stackTrace = ExceptionUtils.getStackTrace(t);
		System.out.println(stackTrace);
		Email.sendOnlyMail(null,"mindnervestech@gmail.com", "Crash Report for Time @ " + uri, stackTrace);
	}
	
}
