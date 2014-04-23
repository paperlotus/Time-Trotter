package com.custom.ui.search.proxy;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import play.db.ebean.Model;

import com.custom.domain.Status;
import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.WizardCardUI;

public class CompanyProxyUISearch extends Model{

	@Id
	public Long id;
	
	@SearchFilterOnUI(label="Status")
	@UIFields(order=1,label="Status")
	@Enumerated(EnumType.STRING)
	@WizardCardUI(name="#",step=1)
	public Status status;
	
	@SearchColumnOnUI(rank=1,colName="Company Name")
	public String	companyName;
	
	@SearchColumnOnUI(rank=2,colName="Company Code")
	public String	companyCode;

	@SearchColumnOnUI(rank=3,colName="Company Email")
	public String	companyEmail;
	
}
