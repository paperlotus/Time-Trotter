package com.custom.ui.search.proxy;

import javax.persistence.Id;

import play.db.ebean.Model;

import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;

public class FeedbackProxyUISearch extends Model{

	public static final String ENTITY = "EMPLOYEE_REVIEW";

	@Id
	public Long id;

	@SearchColumnOnUI(colName="Employee ID", rank=1)
	public Long employeeID;
	
	@SearchColumnOnUI(colName="First Name", rank=2)
	@SearchFilterOnUI(label="First Name")
	public String firstName;
	
	@SearchColumnOnUI(colName="Last Name", rank=3)
	public String lastName;
	
	public static Model.Finder<Long, FeedbackProxyUISearch> find = new Model.Finder<Long,FeedbackProxyUISearch>(Long.class, FeedbackProxyUISearch.class);
}
