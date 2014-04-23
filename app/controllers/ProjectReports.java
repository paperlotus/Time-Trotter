package controllers;

import java.util.ArrayList;
import java.util.List;

import models.project.Project;
import models.user.User;

import org.activiti.engine.impl.util.json.JSONArray;
import org.activiti.engine.impl.util.json.JSONObject;

import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.UserDetails;
import views.html.report.reportIndex;
import views.html.report.viewUserDetails;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.custom.ui.search.helper.ProjectReportSearchUI;
import com.mnt.core.auth.BasicAuth;

import dto.fixtures.MenuBarFixture;

@Security.Authenticated(Secured.class)
@BasicAuth
public class ProjectReports extends Controller {
	public static Result projectReportIndex() {
		User user = User.findByEmail(request().username());
		return ok(reportIndex.render(ProjectReportSearchUI.getInstance().build(),MenuBarFixture.build(request().username()),user));
    }
	
	public static Result projectReportSearch() {
		User user = User.findByEmail(request().username());
		DynamicForm form = DynamicForm.form().bindFromRequest();
		form.data().put("userEmail", user.email);
		return ok(Json.toJson(ProjectReportSearchUI.getInstance().build().doSearch(form)));
    }
	
	public static Result viewProjectDetails(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String id = form.get("query");
		Project project = Project.find.byId(Long.parseLong(id));
		String query="";
		query = "Select u.first_name firstname , sum(ts_r.total_hrs) total_hrs, sum(ts_r.total_hrs * u.hourlyrate) total_billed from timesheet ts , " +
				"timesheet_row ts_r , user u " +
				"where "+
				"ts.id = ts_r.timesheet_id and "+ 
				"ts_r.project_code = '"+project.projectCode +"' and "+
				"u.id = ts.user_id "+
				"group by ts.user_id;";
		List<SqlRow> resultList = Ebean.createSqlQuery(query).findList();
		
		String empName="";
		Integer hrsSpent=0;
		Double moneyBilled=0.0;
		
		List<UserDetails> detailsList = new ArrayList<UserDetails>();
		for(int j=0;j<resultList.size();j++){
			empName = resultList.get(j).getString("firstname");
			if(resultList.get(j).getString("total_hrs") != null){
				hrsSpent = Integer.valueOf(resultList.get(j).getString("total_hrs"));
			}else{
				hrsSpent = 0;
			}
			
			if(resultList.get(j).getString("total_billed") != null){
				moneyBilled = Double.valueOf(resultList.get(j).getString("total_billed")).doubleValue();
			}
			else{
				moneyBilled = 0.0;
			}
			UserDetails userDetail = new UserDetails(empName, hrsSpent, moneyBilled);
			detailsList.add(userDetail);
		}
		return ok(viewUserDetails.render(detailsList));
	}
	
	public static Result viewGraph(){
		DynamicForm form = DynamicForm.form().bindFromRequest();
		String id = form.get("query");
		return ok(views.html.report.viewUsageByHrs.render(id));
	}	
	
	public static Result viewUsageByHrs(String id){
		Project project = Project.find.byId(Long.parseLong(id));
		System.out.println(id);
		String query = "";
		query = "Select u.first_name firstname , sum(ts_r.total_hrs) total_hrs, sum(ts_r.total_hrs * u.hourlyrate) total_billed from timesheet ts , " +
				"timesheet_row ts_r , user u " +
				"where "+
				"ts.id = ts_r.timesheet_id and "+ 
				"ts_r.project_code = '"+project.projectCode.toString()+"' and "+
				"u.id = ts.user_id "+
				"group by ts.user_id;";
		List<SqlRow> resultList = Ebean.createSqlQuery(query).findList();
		
		String empName="";
		String hrsSpent="";
		String total_billed="";
		
		JSONArray mainJsonArray = new JSONArray();
		JSONObject hrsJSON = new JSONObject();
		JSONArray hrsJSONArray = new JSONArray();
		JSONObject billJSON = new JSONObject();
		JSONArray billJSONArray = new JSONArray();
		
		for(int j=0;j<resultList.size();j++){
			empName = resultList.get(j).getString("firstname");
			if(resultList.get(j).getString("total_hrs") != null){
				hrsSpent = resultList.get(j).getString("total_hrs");
			}else{
				hrsSpent = "0";
			}
			
			if(resultList.get(j).getString("total_billed") != null){
				total_billed = resultList.get(j).getString("total_billed");
			}else{
				total_billed = "0";
			}
			JSONObject hrsTempJSON = new JSONObject();
			JSONArray hrsTempArray = new JSONArray();
			
			hrsTempArray.put(hrsSpent);
			hrsTempJSON.put("label", empName);
			hrsTempJSON.put("values", hrsTempArray);
			hrsJSONArray.put(hrsTempJSON);
			
			JSONObject billTempJSON = new JSONObject();
			JSONArray billempArray = new JSONArray();
			
			billempArray.put(total_billed);
			billTempJSON.put("label", empName);
			billTempJSON.put("values", billempArray);
			billJSONArray.put(billTempJSON);
			
		}
		hrsJSON.put("values", hrsJSONArray);
		billJSON.put("values", billJSONArray);
		mainJsonArray.put(hrsJSON);
		mainJsonArray.put(billJSON);
		System.out.println(mainJsonArray);
		return ok(mainJsonArray.toString());
	}
}
