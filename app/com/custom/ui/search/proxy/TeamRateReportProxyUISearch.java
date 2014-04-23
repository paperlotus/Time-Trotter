package com.custom.ui.search.proxy;

import javax.persistence.Id;

import play.db.ebean.Model;

import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.WizardCardUI;

public class TeamRateReportProxyUISearch extends Model{

	@Id
	public Long id;
	
	@SearchColumnOnUI(rank=1,colName="Employee First Name")
	@UIFields(order=1,label="Employee First Name")
	@WizardCardUI(name="#",step=1)
	public String firstName;
	
	@SearchColumnOnUI(rank=2,colName="Employee Last Name")
	@UIFields(order=1,label="Employee Last Name")
	@WizardCardUI(name="#",step=1)
	public String lastName;
	
	@SearchColumnOnUI(rank=3,colName="Project Code")
	@SearchFilterOnUI(label="Project Code")
	public String	projectCode;
	
	@SearchColumnOnUI(rank=4,colName="Per Hr Rate")
	public Double	perHrRate;

	@SearchColumnOnUI(rank=5,colName="Total HRS")
	public Integer	totalHrs;
	
}
