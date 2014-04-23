package models.client;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import models.company.Company;
import play.db.ebean.Model;

import com.mnt.core.ui.annotation.SearchColumnOnUI;
import com.mnt.core.ui.annotation.SearchFilterOnUI;
import com.mnt.core.ui.annotation.UIFields;
import com.mnt.core.ui.annotation.Validation;
import com.mnt.core.ui.annotation.WizardCardUI;

@Entity
public class Client extends Model {
	
	public static final String ENTITY = "Client";
	
	@Id
	@WizardCardUI(name="Basic Info",step=0)
	@UIFields(order=0,label="id",hidden=true)
	public Long id;
	
	//first Wizard
	@SearchColumnOnUI(rank=1,colName="Client Name")
	@SearchFilterOnUI(label="Client Name")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=1,label="Client Name")
	@Validation(required=true)
	public String clientName;
	
	@SearchColumnOnUI(rank=2,colName="Phone No")
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=2,label="Phone No")
	@Validation(required=true,digits=true)
	public String phoneNo;
	
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=3,label="Email")
	@SearchColumnOnUI(rank=3,colName="Email")
	@Validation(required=true,email=true)
	public String email;
	
	@WizardCardUI(name="Basic Info",step=1)
	@UIFields(order=4,label="Fax")
	public Integer fax;
	
	//Second Wizard
	@WizardCardUI(name="Location",step=2)
	@UIFields(order=5,label="Address")
	@Validation(required=true)
	public String address;
	
	@WizardCardUI(name="Location",step=2)
	@UIFields(order=6,label="Street")
	public String street;
	
	@WizardCardUI(name="Location",step=2)
	@UIFields(order=7,label="City")
	@Validation(required=true)
	public String city;
	
	@WizardCardUI(name="Location",step=2)
	@UIFields(order=8,label="Country")
	@SearchFilterOnUI(label="Country")
	@SearchColumnOnUI(rank=4,colName="Country")
	@Validation(required=true)
	public String country;
	
	@WizardCardUI(name="Location",step=2)
	@UIFields(order=9,label="PIN")
	@Validation(required=true)
	public String pin;
	
	//Third Wizard
	@WizardCardUI(name="Contact Point",step=3)
	@UIFields(order=11,label="Contact Name")
	@SearchFilterOnUI(label="Contact Name")
	@Validation(required=true)
	public String contactName;
	
	@WizardCardUI(name="Contact Point",step=3)
	@UIFields(order=12,label="Contact Phone")
	@Validation(required=true,digits=true)
	public String contactPhone;
	
	@WizardCardUI(name="Contact Point",step=3)
	@UIFields(order=13,label="Contact Email")
	@SearchColumnOnUI(rank=5,colName="Contact Email")
	@Validation(required=true,email=true)
	public String contactEmail;
	
	@OneToOne(cascade=CascadeType.ALL)
	public Company company;
	
	public static Model.Finder<Long,Client> find = new Model.Finder<Long,Client>(Long.class, Client.class);
	
	
	public static Client findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
	
	public static Map<String,String> autoCompleteAction=new HashMap<String, String>();
	
	
	@Override
	public String toString() {
		return clientName;
	}
}
