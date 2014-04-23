package models.notification;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import models.company.Company;
import play.db.ebean.Model;

@Entity
public class Notification extends Model{
		
		@Id
		public Long id;
       
		public String  settingAsJson;
		
		@OneToOne(cascade=CascadeType.ALL)
		public Company company;

		
		public static Finder<Long,Notification> find=new Finder<Long, Notification>(Long.class, Notification.class);
        
}

