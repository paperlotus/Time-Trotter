package models.timesheet;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import models.user.User;
import play.data.format.Formats;
import play.db.ebean.Model;

import com.avaje.ebean.Expr;
import com.custom.domain.TimesheetStatus;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.WizardCardUI;

@Entity
public class Timesheet extends Model{

    public static final String ENTITY = "Timesheet";

	@Id
	@WizardCardUI(name="Timesheet Status Info",step=0)
	@UIFields(order=0,label="id",hidden=true)
	public Long id;
    
    @ManyToOne
    public User user;
    
    @WizardCardUI(name="Timesheet Status Info",step=1)
    @UIFields(order=1,label="Status")
    @SearchColumnOnUI(rank=3,colName="Status")
	@SearchFilterOnUI(label="Status")
    public TimesheetStatus status;

    @SearchColumnOnUI(rank=2,colName="Week")
    public Integer weekOfYear;
    
    @SearchColumnOnUI(rank=1,colName="Year")
    public Integer year;
    
    @OneToMany(cascade = CascadeType.ALL)
    public List<TimesheetRow> timesheetRows;
    
    @Transient
	@SearchFilterOnUI(label="From")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date fromWeekWindow;
	
	@Transient
	@SearchFilterOnUI(label="To")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date toWeekWindow;
    
	@OneToOne
	@SearchColumnOnUI(rank=4,colName="Pending With")
    public User timesheetWith;
	
	public Integer level=0;
	
	public String processInstanceId;
	
	//Guid
	public String tid;
	
	public static Model.Finder<Long, Timesheet> find = new Model.Finder<Long,Timesheet>(Long.class, Timesheet.class);
    
    public static List<Timesheet> byUser_Week_Year(Long id, int week, int year){
    	return Timesheet.find.where(Expr.and(Expr.eq("user", User.findById(id)), Expr.and(Expr.eq("year", year),Expr.eq("weekOfYear", week)))).findList();
    }
    
    public static Timesheet findById(long _id){
    	return find.byId(_id);
    }
    
}