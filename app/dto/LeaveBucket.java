package dto;

import javax.persistence.Id;

import play.db.ebean.Model;

import com.custom.domain.LeaveStatus;
import com.custom.domain.TypeOfLeave;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;

public class LeaveBucket extends Model{
	
	public static final String ENTITY = "My Leave Approval Bucket";
	
	@Id
	public Long id;

	@SearchColumnOnUI(colName="Status", rank=7 , width = 60)
	@SearchFilterOnUI(label="Status")
	public LeaveStatus status;
	
	@SearchColumnOnUI(colName="First Name", rank=1 ,width = 100)
	public String firstName;
	
	@SearchColumnOnUI(colName="Last Name", rank=2 , width = 80)
	public String lastName;
	
	@SearchColumnOnUI(colName="Start Date", rank=3 , width = 50)
	public String startDate;
	
	@SearchColumnOnUI(colName="No of Days", rank=4 , width = 30)
	public String noOfDays;
	
	@SearchColumnOnUI(colName="Type of Leave", rank=5 , width = 60)
	public TypeOfLeave typeOfLeave;
	
	@SearchColumnOnUI(colName="Remarks", rank=6 , width = 80)
	public String	remarks;

	public static Model.Finder<Long, LeaveBucket> find = new Model.Finder<Long,LeaveBucket>(Long.class, LeaveBucket.class);
}
