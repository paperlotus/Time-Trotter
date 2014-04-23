package controllers;

import static com.google.common.collect.Lists.transform;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.client.Client;
import models.user.User;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.codehaus.jackson.node.ObjectNode;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.editWizard;
import views.html.client.clientIndex;

import com.avaje.ebean.Expr;
import com.custom.helpers.ClientSave;
import com.custom.helpers.ClientSearchContext;
import com.google.common.base.Function;
import com.mnt.core.auth.BasicAuth;
import com.mnt.core.ui.component.AutoComplete;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class Clients extends Controller {

	public static Result search() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		return ok(Json.toJson(ClientSearchContext.getInstance().build().doSearch(form)));
    }
	
	public static Result edit() {
			try {
				ClientSave saveUtils = new ClientSave();
				saveUtils.doSave(true);
			} catch (Exception e) {
				ExceptionHandler.onError(request().uri(),e);
			}
			return ok("Clients Edited Successfully");
    }
	
	public static Result excelReport() throws IOException {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("email", request().username());
		HSSFWorkbook hssfWorkbook =  ClientSearchContext.getInstance().build().doExcel(form);
		File f = new File("excelReport.xls");
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		hssfWorkbook.write(fileOutputStream);
		return ok(f).as("application/vnd.ms-excel");
    }
	
	
	public static Result index() {
		User user = User.findByEmail(request().username());
		return ok(clientIndex.render(ClientSearchContext.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result delete() {
		return ok();
    }
	
	public static Result findClients(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String query = form.get("query");
		ObjectNode result = Json.newObject();
		List<AutoComplete> results = transform(Clients.findClients(query), toAutoCompleteFormatForClient());
		result.put("results", Json.toJson(results));
		return ok(Json.toJson(result));
	}
	
	private static Function<Client,AutoComplete> toAutoCompleteFormatForClient() {
		return new Function<Client, AutoComplete>() {
			@Override
			public AutoComplete apply(Client client) {
					return new AutoComplete(client.clientName,client.email,client.contactEmail,client.id);
			}
		};
	}
	
	public static Result create() {
		try {
			Map<String, Object> extra = new HashMap<String, Object>();
			extra.put("company", User.findByEmail(request().username()).companyobject);
			ClientSave saveUtils = new ClientSave(extra);
			saveUtils.doSave(false);
		} catch (Exception e) {
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Clients Created Successfully");
    }
	
	public static Result showEdit() {
		DynamicForm form = DynamicForm.form().bindFromRequest();
		Long id = null;
		try{
			id = Long.valueOf(form.get("query"));
			return ok(editWizard.render(new ClientSearchContext(Client.findById(id)).build()));
		}catch(NumberFormatException e){
			ExceptionHandler.onError(request().uri(),e);
		}
		return ok("Not able to show Results, Check Logs");
		
	}
	public static List<Client> findClients(String query) {
		User user = User.findByEmail(request().username());
		List<Client> clients =  Client.find.where().and(Expr.eq("company.companyCode", user.companyobject.getCompanyCode()),Expr.ilike("clientName", query+"%")).findList();
		return clients;
	}
}
