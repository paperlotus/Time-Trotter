package models.feedback;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import models.user.User;
import play.data.format.Formats;
import play.db.ebean.Model;

import com.custom.domain.Rating;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.Validation;

@Entity
public class Feedback extends Model{

	public static final String ENTITY = "Feedback";
	
	@Id
	public Long id;
	
	
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date feedbackDate = new Date();
	
	@Transient
	@SearchColumnOnUI(rank=1,colName="Feedback Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public String feedbackDateDisplay;
	
	@Transient
	@SearchColumnOnUI(rank=2,colName="Feedback From")
	public String feedbackFromManager;
	
	@Lob
    @Validation(required=true)
	public String feedback;
	
	@SearchColumnOnUI(rank=3,colName="Rating")
	public Rating rating;
	
	@ManyToOne
	public User user;
	
	@Transient
	@SearchFilterOnUI(label="From Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date fromDateWindow;
	
	@OneToOne
	public User manager;
	
	@Transient
	@SearchFilterOnUI(label="To Date")
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date toDateWindow;
	
	public static Model.Finder<Long,Feedback> find = new Model.Finder<Long,Feedback>(Long.class, Feedback.class);
	
}
