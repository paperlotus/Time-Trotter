package models.leave;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import models.user.User;
import play.data.format.Formats;
import play.db.ebean.Model;

import com.custom.domain.LeaveStatus;
import com.custom.domain.TypeOfLeave;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.Validation;
import com.mnt.core.ui.annotation.WizardCardUI;

@Entity
public class ApplyLeave extends Model {
  
	public static final String ENTITY = "Leave";  
	@Id
	@WizardCardUI(name="Leave",step=0)
	@UIFields(order=0,label="id",hidden=true)
	public Long id;
	
	@WizardCardUI(name="Leave",step=1)
	@UIFields(order=1,label="Start Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	@Validation(required=true)
	public Date startDate;
	
	@SearchColumnOnUI(rank=2,colName="No of Days")
	@WizardCardUI(name="Leave",step=1)
	@UIFields(order=2,label="No of Days")
	@Validation(required=true)
	public String noOfDays;
	
	@SearchColumnOnUI(rank=3,colName="Type of Leave")
	@SearchFilterOnUI(label="Type of Leave")
	@WizardCardUI(name="Leave",step=1)
	@UIFields(order=3,label="Type of Leave")
	@Enumerated(EnumType.STRING)
	@Validation(required=true)
	public TypeOfLeave typeOfLeave;
	
	@SearchColumnOnUI(rank=4,colName="Remarks")
	@WizardCardUI(name="Leave",step=1)
	@UIFields(order=4,label="Remarks")
	@Validation(required=true)
	public String	remarks;
	
	@SearchColumnOnUI(rank=5,colName="Status")
	@Enumerated(EnumType.STRING)
	public LeaveStatus status;
	
	@Transient
	@SearchColumnOnUI(colName="Start Date", rank=1)
	public String startDateGrid;
	
	@Transient
	@SearchFilterOnUI(label="Start Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date startDateWindow;
	
	@Transient
	@SearchFilterOnUI(label="End Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date endDateWindow;
	
	@ManyToOne
	public User user;
	
	@OneToOne
    public User pendingWith;
	
	public Integer level=0;
	
	public String processInstanceId;
	
	//Guid
	public String leaveGuid;
	
	public static Model.Finder<Long,ApplyLeave> find = new Model.Finder<Long,ApplyLeave>(Long.class, ApplyLeave.class);
	
	public static ApplyLeave findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
	
	public static List<ApplyLeave> findByIds(List<Long> ids) {
        return find.where().idIn(ids).findList();
    }
}