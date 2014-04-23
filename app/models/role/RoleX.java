package models.role;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import models.company.Company;
import play.db.ebean.Model;

@Entity
public class RoleX extends Model{

	private static final long serialVersionUID = -7692739284963294943L;

	@Id
	public Long id;
	
	@OneToOne
	public Company company;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<RoleLevel> roleLevels;
	
	
	public static Model.Finder<Long, RoleX> find = new Model.Finder<Long,RoleX>(Long.class, RoleX.class);
    
	public static RoleX findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
	
	public static RoleX findByCompany(Long id) {
        return find.where().eq("company.id", id).findUnique();
    }
	
	public List<RoleLevel> getRoleLevels(){
		return roleLevels;
	}
	
}