package models.mail;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import models.company.Company;
import play.db.ebean.Model;

@Entity
public class MailSetting extends Model{
	
	
	@Version
    public Timestamp lastUpdate;
	
	@Id
	public Long id;
	
	public String hostName;
	public String portNumber;
	
	public Boolean sslPort;
	
	public Boolean tlsPort;
	
	public String userName;
	public String password;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	public Company companyObject;
	
	public static Finder<Long,MailSetting> find=new Finder<Long, MailSetting>(Long.class, MailSetting.class);
}
