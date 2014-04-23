package models.delegation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import models.user.User;
import play.data.format.Formats;
import play.db.ebean.Model;

import com.mnt.core.ui.annotation.AutoComplete;
import com.mnt.core.ui.annotation.Validation;

@Entity
public class Delegate extends Model{
	
	@Id
	public Long id;
	
	@Validation(required=true)
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date fromDate;
	
	@Validation(required=true)
	@Formats.DateTime(pattern="dd-MM-yyyy")
	public Date toDate;
	
	@OneToOne
	public User delegator;
	@OneToOne
	public User delegatedTo;
	
	
	public static Finder<Long,Delegate> find = new Finder<Long, Delegate>(Long.class, Delegate.class);
}
