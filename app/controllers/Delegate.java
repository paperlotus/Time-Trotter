package controllers;

import static play.data.Form.form;
import models.user.User;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import com.custom.ui.page.helper.DelegateUIModelContext;
import com.custom.ui.page.proxy.DelegateUIProxyModel;
import com.custom.ui.search.helper.UserSearchUI;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;


@Security.Authenticated(Secured.class)
@BasicAuth
public class Delegate extends Controller {
	
	public static Result index(){
		User user = User.findByEmail(request().username());
		models.delegation.Delegate delegate = new models.delegation.Delegate();
		delegate = models.delegation.Delegate.find.where().eq("delegator",user).findUnique();
		
		if(delegate == null)
		{
		return ok(views.html.delegate.delegateIndex.render(
				new DelegateUIModelContext(DelegateUIProxyModel.class).build(),MenuBarFixture.build(request().username()),user));
		}
		else
		{
			DelegateUIProxyModel proxyModel = new DelegateUIProxyModel();
			proxyModel.fromDate = delegate.fromDate;
			proxyModel.toDate = delegate.toDate;
			proxyModel.delegateTo = delegate.delegatedTo;
			return ok(views.html.delegate.delegateIndex.render(
					new DelegateUIModelContext(proxyModel).build(),MenuBarFixture.build(request().username()),user));
		}	
	}
	
	public static Result save(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		User user = User.findByEmail(request().username());
		Form<models.delegation.Delegate> delegateForm = form(models.delegation.Delegate.class).bindFromRequest();
		models.delegation.Delegate delegatep = new models.delegation.Delegate();
		delegatep = models.delegation.Delegate.find.where().eq("delegator",user).findUnique();
		
		if(delegatep == null)
		{
			models.delegation.Delegate delegate = new models.delegation.Delegate();
			delegate = delegateForm.get();
			delegate.delegatedTo = User.find.byId(Long.parseLong(form.get("delegateTo_id")));
			delegate.delegator = user;
			delegate.save();
			return redirect(routes.Delegate.index());
		}
		else
		{
			Long id = delegatep.id;
			delegatep = delegateForm.get();
			delegatep.delegatedTo = User.find.byId(Long.parseLong(form.get("delegateTo_id")));
			delegatep.delegator = user;
			delegatep.update(id);
			return redirect(routes.Delegate.index());
		}
	}
	
}
