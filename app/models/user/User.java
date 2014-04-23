package models.user;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.persistence.Version;

import models.company.Company;
import models.feedback.Feedback;
import models.leave.ApplyLeave;
import models.project.Project;
import models.role.RoleLevel;
import models.timesheet.Timesheet;
import play.data.format.Formats;
import play.db.ebean.Model;

import com.custom.domain.DomainEnum;
import com.custom.domain.EmployeeStatus;
import com.custom.domain.Gender;
import com.custom.domain.Salutation;
import com.custom.domain.Status;
import com.custom.helpers.UserSearchContext;
import com.mnt.core.helper.SearchContext;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.Validation;
import com.mnt.core.ui.annotation.WizardCardUI;

import controllers.routes;

@Entity
public class User extends Model {
	
	public static final String ENTITY = "User";
	
	private static final String REPORTING_MANAGER = "Reporting Manager";

	private static final String HR_MANAGER = "HR Manager";
	@Version
    public Timestamp lastUpdate;
	
	@Id
	@WizardCardUI(name="Basic Info",step=0)
	@UIFields(order=0,label="id",hidden=true)
	public Long id;
	
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=1,label="Salutation")
	@Enumerated(EnumType.STRING)
	public Salutation	salutation;
	
	@SearchColumnOnUI(rank=1,colName="Employee Id")
	@SearchFilterOnUI(label="Employee Id")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=7,label="Employee Id")
//	@Validation(required = true,remote="/idAvailability", messages ="Employee Id is already occupied")
	@Validation(required = true)
	public String	employeeId;
	
	@SearchColumnOnUI(rank=2,colName="First Name")
	@SearchFilterOnUI(label="First Name")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=2,label="First Name", mandatory = true)
	@Validation(required=true)
	public String	firstName;
    
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=3,label="Middle Name", mandatory = true)
    public String	middleName;
    
	@SearchFilterOnUI(label="Last Name")
	@SearchColumnOnUI(rank=3,colName="Last Name")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=4,label="Last Name",mandatory = true)
	@Validation(required=true)
	public String	lastName;
	
	@SearchColumnOnUI(rank=4,colName="Email")
	@SearchFilterOnUI(label="Email")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=5,label="Username")
	@Validation(required=true,remote="/emailAvailability", messages="Username is not available")
	@Column(unique = true)
    public String	email;
	
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=6,label="Gender")
	@Enumerated(EnumType.STRING)
	@Validation(required = true)
	public Gender gender;
    
    
	@Enumerated(EnumType.STRING)
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=1,label="Employee Status")
	public EmployeeStatus status;
	
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=2,label="Date of Joining")
	@Validation(required = true)
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date	hireDate;
    
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=3,label="Annual Income")
	@Validation(number=true)
	public Double annualIncome;
	
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=4,label="Hourly Rate")
	@Validation(required = true)
	public Double hourlyrate;
	
	@Transient
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=5,label="Designation")
	@Validation(required = true)
	public static List<DomainEnum> rolex;
	
	@OneToOne(cascade=CascadeType.ALL)
	public Company companyobject;
	
	@SearchColumnOnUI(rank=5,colName="Designation")
	public String designation;
	
	@OneToOne
	public RoleLevel role;
	
	
	@WizardCardUI(name="Other Info",step=3)
	@UIFields(order=6,label=REPORTING_MANAGER, autocomplete=true)
	@Validation(required = true)
	@OneToOne
	public User manager;
	
	@WizardCardUI(name="Other Info",step=2)
	@UIFields(order=8,label="Date of Release")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date releaseDate;
	
	//@WizardCardUI(name="Other Info",step=2)
	//@UIFields(order=6,label=HR_MANAGER, autocomplete=true)
	@OneToOne
	public User hrmanager;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	public List<Timesheet> timesheets;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	public List<Feedback> feedbacks;
	
	@Column(length=700)
	public String permissions;
	
	public String getPermissions(){
		return permissions;
	}
	
	public void setPermissions(String permissions){
		this.permissions = permissions;
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	public List<ApplyLeave> leaves;
	
	public Integer 	tempPassword;
	public String	password;
	public Boolean	resetFlag;
    public Integer	failedLoginAttempt;
    public Date		createDate;
    public Date		modifiedDate;
    public Boolean	passwordReset;
    @Enumerated(EnumType.STRING)
	public Status 	userStatus;
    
    public String processInstanceId;
    
    @ManyToMany
	public List<Project> project;
	
    public static Model.Finder<Long,User> find = new Model.Finder<Long,User>(Long.class, User.class);
	
	public static User findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
	
	public static List<User> findByIds(List<Long> ids) {
        return find.where().idIn(ids).findList();
    }
	
	
	public static User authenticate(String email, String password, String companyCode) {
		User user= find.where().eq("email", email).eq("password", password).findUnique();
				
		if (user!=null)
		{
			if("SuperAdmin".equals(user.designation))
			{
				return user;
			}
			
			return find.where().eq("email", email).eq("password", password).eq("companyobject.companyCode",companyCode)
							.findUnique();
		}	
		else
			return null;
	}
	
    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
	
	public static SearchContext  getSearchContext(String onFieldNamePrefix){
		return  UserSearchContext.getInstance().withFieldNamePrefix(onFieldNamePrefix);
	}
	
	// Note from Dev: I want this code to be in model, dont move it to some other place in name of refactoring.
	// This field is more coupled with field level, may be it not Best to put the code here.
	public static Map<String,String> autoCompleteAction=new HashMap<String, String>();
	static {
		autoCompleteAction.put(HR_MANAGER, routes.Users.findHRUser().url());
		autoCompleteAction.put(REPORTING_MANAGER, routes.Users.findProjectManagers().url());
	}
	
	@Override
	public String toString() {
		return firstName + ","  + "("+email +")" + "," + "("+designation+")";
	}

}
