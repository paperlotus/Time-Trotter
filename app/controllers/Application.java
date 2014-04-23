package controllers;

import static com.google.common.collect.Lists.transform;
import static play.data.Form.form;

import java.util.List;

import models.company.Company;
import models.leave.ApplyLeave;
import models.mail.MailSetting;
import models.role.RoleLevel;
import models.timesheet.Timesheet;
import models.user.User;

import org.codehaus.jackson.node.ObjectNode;

import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import utils.ExceptionHandler;
import views.html.index;
import views.html.menuContext;
import views.html.userPermission.restrictedPage;

import com.avaje.ebean.Expr;
import com.avaje.ebean.Expression;
import com.custom.domain.LeaveStatus;
import com.custom.domain.TimesheetStatus;
import com.custom.emails.Email;
import com.google.common.base.Function;
import com.mnt.core.ui.component.AutoComplete;
import com.mnt.core.workflow.ActivitiHelper;

import dto.fixtures.MenuBarFixture;

public class Application extends Controller {
  
	@Security.Authenticated(Secured.class)
    public static Result index() {
    	 return ok(index.render(MenuBarFixture.build(request().username()),User.findByEmail(request().username())));
    }
	public static Result companyregistration()
	{
		return ok(views.html.company.companyRegister.render());
	}
	public static Result setPassword()
	{
	    	return ok(views.html.login.setPassword.render());
	}
	
	
	public static Result companycreateAccount()
	{
		String email,code;
		int a,b;
		
		Form<Company> companyForm = form(Company.class).bindFromRequest();
		Company company = companyForm.get();
		company.setCompanyStatus(com.custom.domain.Status.PendingApproval);
		
		email = companyForm.get().companyEmail;
		b = email.length();
		a = email.lastIndexOf("@");
		code  = email.substring(a+1, b);
		
		Company companyCheck = Company.find.where().eq("companyCode", code).findUnique();
		if(companyCheck == null)
			{
				company.setCompanyCode(code);
				company.save();
				
				
				//Send Email to company email
				String recipients = "";
				String subject = "";
				String body = "";
				
				recipients = company.companyEmail;
				subject = "Company Registration Success";
				body = "Company "+company.companyName + " is Registered Successfully. \nPlease Be Patient while SUPER ADMIN Approves It!";
				
				User superAdmin = User.find.where().eq("designation", "SuperAdmin").findUnique();
				MailSetting smtpSetting = MailSetting.find.where().eq("companyObject",superAdmin.companyobject).findUnique();
				Email.sendOnlyMail(smtpSetting,recipients, subject, body);
				//Send Email to super Admin
				
				recipients = superAdmin.email;
				subject = "New Company Registered";
				body = "A New Company "+company.companyEmail +" is Registered.\n Please Take Necessary Action!";
				Email.sendOnlyMail(smtpSetting,recipients, subject, body);
				return redirect(routes.Application.login());
			}
		else
			{
				flash("registered", "Please Register Through Other Domain");
				return redirect(routes.Application.companyregistration());
			}
			
	}
    
    public static Result menuContext() {
        return ok(menuContext.render(MenuBarFixture.build(request().username()),null));
    }
    
    public static Result login() {
        return ok(
        	views.html.login.login.render(form(Login.class))
        );
    }
    
    public static Result logout() {
        session().clear();
        response().discardCookie("email");
        flash("success", "You've been logged out");
        return redirect(
            routes.Application.login()
        );
    }
    
    public static class Login {

        public String email;
        public String password;
        
        public String validate() {
        	int a,b;
        	String code;
        	System.out.println("***email="+email);
            System.out.println("***password="+password);
        	User user= User.find.where().eq("email", email).eq("password", password).findUnique();
    		if (user!=null)
    		{
    			b = email.length();
    			a = email.lastIndexOf("@");
    			code  = email.substring(a+1, b);
    			
    			if("SuperAdmin".equals(user.designation))
    			{
    				return null; // Happy Scenario
    			}
    			
    			if(user.companyobject.getCompanyCode() != null  && user.companyobject.getCompanyCode().equalsIgnoreCase(code))
    			{
    				if(user.companyobject.getCompanyStatus() == com.custom.domain.Status.Disapproved)
    				{
    					return "Company Domain is not approve";
    				}
    				else
    				{
    					if(user.userStatus == com.custom.domain.Status.Disapproved){
    						return "You are Not Yet Approved";
    					}
    					return null; // Happy Scenario
    				}
    			}
    			else
    			{
    				return "Invalid Company Domain";
    			}
    		}
    		else
    		{
    			return "Invalid Password";
    		}
        }
    }
    
    
    
    public static Result authenticate() {
    	Form<Login> loginForm = form(Login.class).bindFromRequest();
        String error = null;
        if (User.findByEmail(loginForm.data().get("email"))==null)
        {
        	flash("error","You have Entered Username that does not exists");
        	return badRequest(views.html.login.login.render(loginForm));
        } 
        else
        {
            if(loginForm.globalErrors().size()>0)
            {
            	error = loginForm.globalErrors().get(0).message();
            		flash("error",error);
	            	return badRequest(views.html.login.login.render(loginForm));
            } 
            session().clear();
            response().setCookie("email", loginForm.get().email);
            session("email", loginForm.get().email);
            User user = User.findByEmail(loginForm.get().email);
            if(user.tempPassword == 0)
            	return redirect(routes.Application.index());
            else
            	 return redirect(routes.Application.setPassword());
            
        }
    }
    
    
    public static Result registration() {
    	return ok(views.html.login.registration.render());
    }

    //create a new user in DB
    public static Result createAccount(){
    	DynamicForm dynamicForm = DynamicForm.form().bindFromRequest();
    	String code,email;
    	email = dynamicForm.get("email");
		code  = email.substring(email.lastIndexOf("@")+1, email.length());
		
    	Form<User> userForm = form(User.class).bindFromRequest();
    	User userEmail = User.find.where().eq("email", userForm.get().email).findUnique();
    	if(userEmail == null)
    	{
    			User user = userForm.get();
		    	user.userStatus=com.custom.domain.Status.PendingApproval;
		    	Company companyObj = Company.find.where().eq("companyCode", code).findUnique();
		    	user.companyobject= companyObj;
		    	user.tempPassword = 0;
		    	user.save();
		    try{	
		    	String recipients = "";
		    	String subject = "";
		    	String body = "";
		    	
		    	//send email to user
		    	MailSetting smtpSettings = MailSetting.find.where().eq("companyObject", user.companyobject).findUnique();
		    	recipients = user.email;
		    	subject = "Account Created Successfully.";
		    	body = "Your Account is created Successfully.";
		    	body += "\nUsername :"+ user.email;
		    	body += "\nPassword :"+user.password;
		    	body += "\n...Please wait to be approved by your Company Admin!";
		    	Email.sendOnlyMail(smtpSettings,recipients, subject, body);
		    	
		    	
		    	//send email to company admin
		    	Company company = user.companyobject;
		    	User companyAdmin = User.find.where().
		    			and(Expr.eq("companyobject", company),Expr.eq("designation", "Admin")).findUnique();
		    	
		    	recipients = companyAdmin.email;
		    	subject = "New User Account Creation";
		    	body = "User "+ user.firstName +" is created Successfully.";
		    	body +="\nPlease take Necessary Action regarding Approval/Disapproval of User...";
		    	
		    	User superAdmin = User.find.where().eq("designation", "SuperAdmin").findUnique();
				MailSetting smtpSetting = MailSetting.find.where().eq("companyObject",superAdmin.companyobject).findUnique();
				Email.sendOnlyMail(smtpSetting,recipients, subject, body);
    		}
    		catch (Exception e) {
    			ExceptionHandler.onError(request().uri(),e);
    		}
    		return ok(views.html.login.login.render(form(Login.class)));
    	}
    	else
    	{
    		flash("registered", "Email id already exists");
    		return redirect(routes.Application.registration());
    	}
    }
    
	//auto-complete for company name in user registration
    public static Result companysearch(String q)
 	{	
    	ObjectNode result = Json.newObject();
		List<Company> companies = Company.find.where().eq("companyStatus", com.custom.domain.Status.Approved).ilike("companyName", q+"%").findList();
		List<AutoComplete> results = transform(companies, toAutoCompleteFormatForCompanyName());
		result.put("results", Json.toJson(results));
    	return ok(result);
     }
   
	//auto-complete format for company name in user registration
    private static Function<models.company.Company,AutoComplete> toAutoCompleteFormatForCompanyName() {
		return new Function<models.company.Company, AutoComplete>() {
			@Override
			public AutoComplete apply(models.company.Company company) {
					return new AutoComplete(company.companyName,company.companyEmail,company.getCompanyCode(),company.id);
				
			}
		};
	}
    
    //to show forgot password page
    public static Result forgotpassword()
	{
		return ok(views.html.forgotpassword.emailvalidate.render());
	}
    
    
    public static Result finduser()
	{
		
			DynamicForm formObj = form().bindFromRequest();
			String emailid= formObj.get("inputemail");
			User userobject	=User.find.where().ilike("email",emailid).findUnique();
			if(userobject==null)
			{	
				flash("success", "WRONG USERNAME.... PLEASE TRY AGAIN");
				return ok(views.html.forgotpassword.emailvalidate.render());
			}
			else
			{		
					MailSetting smtpSettings = MailSetting.find.where().eq("companyObject", userobject.companyobject).findUnique();
					String recipients = "";
			    	String subject = "";
			    	String body = "";
			    	String passWord = generatePassword();
			    	recipients = userobject.email;
			    	subject = "Password recovery email";
			    	body = "Your Login Details :";
			    	body += "\nUser Name :" + userobject.email;
			    	body += "\nPassword  :" + passWord;
			    	userobject.tempPassword = 1;
			    	userobject.password = passWord;
			    	userobject.update();
			    	Email.sendOnlyMail(smtpSettings,recipients, subject, body);
					return ok(views.html.forgotpassword.displaypassword.render(userobject));
			}
	}
	
    
    public static Result restrictedPage()
   	{
           return ok(restrictedPage.render());
 	}
    
    public static Result deployment(){
    	ActivitiHelper.me().doDeploy();
//    	ActivitiHelper.me().doRequestDeploy();
//    	ActivitiHelper.me().doVacationDeploy();
    	return redirect(routes.Application.index());
    }
    
    //Code to check whether company code is available or not
    public static Result checkCompanyCodeAvailability(){
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		Company company = Company.find.where().eq("companyCode", q).findUnique();
		
		if(company == null){
			return ok(Json.toJson(true));
		}
    	return ok(Json.toJson(false));
    }
    
    //Code to check whether company Name is available or not
    public static Result checkCompanyNameAvailability(){
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		Company company = Company.find.where().eq("companyName", q).findUnique();
		
		if(company == null){
			return ok(Json.toJson(true));
		}
    	return ok(Json.toJson("Company Name is not available"));
    }
    
    //Code to check whether User Name is available or not
    public static Result checkUserEmailAvailability(){
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String email = form.get("q");
		int a,b;
    	String code;
    	
    	b = email.length();
		a = email.lastIndexOf("@");
		code  = email.substring(a+1, b);
		
		Company company = Company.find.where().eq("companyCode", code).findUnique();
		if(company != null)
		{
			if(company.companyStatus == com.custom.domain.Status.Approved)
			{
				User user = User.find.where().eq("email", email).findUnique();
				if(user == null){
					return ok(Json.toJson(true));
				}
				else
					return ok(Json.toJson("Email ID is in use"));
			}
			else
			{
				return ok(Json.toJson("Company Domain not yet approved"));
			}
		} 
		else
		{
			return ok(Json.toJson("Company domain is not yet registered with us,Only employees of registered user can register with us.If you are comapny authorized person please register your company by clicking below link"));
		}
}

    public static Result checkCompanyEmailAvailability(){
    	String email,code;
		int a,b;
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		b = q.length();
		a = q.lastIndexOf("@");
		code  = q.substring(a+1, b);
		Company companyCheck = Company.find.where().eq("companyCode", code).findUnique();
		
		if(companyCheck == null){
			return ok(Json.toJson(true));
		}
    	return ok(Json.toJson("Please Register Through Other Domain "));
    }
    @Security.Authenticated(Secured.class)
    public static Result checkOldPassword(){
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");
		User user = User.findByEmail(request().username());
		if(q.equals(user.password))
		{
			return ok(Json.toJson(true));
		}
		else
			return ok(Json.toJson("Wrong Password"));
    }
   
    @Security.Authenticated(Secured.class)
    public static Result changePassword(){
    	DynamicForm form = DynamicForm.form().bindFromRequest();
    	User user = User.findByEmail(request().username());
    	String password = form.get("password");
    	user.password = password;
    	user.tempPassword = 0;
    	user.update();
    	return redirect(routes.Application.index());
    }
    
    public static String generatePassword()
    {
	    String alphaNumerics = "qwertyuiopasdfghjklzxcvbnm1234567890";
		String t = "";
		for (int i = 0; i < 6; i++) {
		    t += alphaNumerics.charAt((int) (Math.random() * alphaNumerics.length()));
		}
		return t;
    }
    
   public static Result checkPassword()
    {
	   	boolean letter = false;
	   	boolean number = false;
    	DynamicForm form = DynamicForm.form().bindFromRequest();
		String q = form.get("q");

		if(q.length()>=6)
		{
			if (q.matches("[0-9][0-9]*[A-Za-z][A-Za-z]*")) {
			    System.out.println("Alphanumeric");
			    for (int n=0 ; n< q.length() ; n++)
			    {
			    Character c = q.charAt(n);
			    if (Character.isLetter(c))
			    letter=true;
			    else if (Character.isDigit(c))
			    number=true;
			    }
			    System.out.println("number------"+number);
			    System.out.println("letter------"+letter);
			    return ok(Json.toJson(number&&letter)); 
			}
			else {
			    return ok("Remove Special Characters");
			}
		 }
		 else
				return ok("Minimum 6 characters required");
    } 
   
   public static int count()
   {
	   int count = 0;
	   
	   User user = User.findByEmail(request().username());

	   if("Admin".equals(user.designation))
		   	{
			   Expression exp1 = Expr.eq("companyobject.companyCode", user.companyobject.getCompanyCode());
			   Expression exp2 = Expr.ne("email", user.email);
			   count = User.find.where().ilike("userStatus","PendingApproval").add(exp1).add(exp2).findRowCount();
		   	}
		else if("SuperAdmin".equals(user.designation))
		   	{
			   count = Company.find.where().ilike("companyStatus","PendingApproval").findRowCount();
		   	}
		else if(RoleLevel.checkUserLevel(user.id, user.role.role_level))
			{
			 int count1 = Timesheet.find.where().and(Expr.eq("status", TimesheetStatus.Submitted),Expr.eq("timesheetWith", user)).findRowCount();
			 int count2 = count = ApplyLeave.find.where().eq("status",LeaveStatus.Submitted).findRowCount();
			 count = count1 + count2;
			}
	   return count;
   }
}
