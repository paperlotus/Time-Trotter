package models.timesheet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class TimesheetRow extends Model{

    @Id
    public Long id;
    
    @ManyToOne
    public Timesheet timesheet;
    
    public String projectCode;
    
    public String taskCode;
    
    public Integer totalHrs;
    
    public Integer sun;
    
    public Integer mon;
    
    public Integer tue;
    
    public Integer wed;
    
    public Integer thu;
    
    public Integer fri;
    
    public Integer sat;
    
    public Boolean overTime;
    
    public static Model.Finder<Long, TimesheetRow> find = new Model.Finder<Long,TimesheetRow>(Long.class, TimesheetRow.class);
}