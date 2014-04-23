package controllers;

import static play.data.Form.form;
import models.mail.MailSetting;
import models.user.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.index;
import views.html.mail.mailIndex;

import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;


@Security.Authenticated(Secured.class)
@BasicAuth
public class Mail extends Controller{
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		MailSetting mail = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
		Form<MailSetting> mailForm;
		mailForm = form(MailSetting.class).fill(mail);
		return ok(mailIndex.render(MenuBarFixture.build(request().username()),user,mailForm));
    }
	
	public static Result settingSave()
	{
		Form<MailSetting> mailForm = form(MailSetting.class).bindFromRequest();
		
		User user = User.findByEmail(request().username());
		MailSetting mail1 = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
		
		MailSetting mail = mailForm.get();
		mail.id = mail1.id;
		mail.update();
		
		return ok(index.render(MenuBarFixture.build(request().username()),User.findByEmail(request().username())));
	}
	
	
}
