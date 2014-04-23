package models.role;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import models.company.Company;
import models.user.User;
import play.db.ebean.Model;

import com.avaje.ebean.Expr;
import com.custom.domain.RoleLevels;

@Entity
public class RoleLevel extends Model{

	public static final long serialVersionUID = 6992202576999577853L;

	@Id
	public Long id;
	
	@Version
	public Timestamp lastUpdate;
	
	@ManyToOne
	public RoleX roleX;
	
	@Enumerated(EnumType.ORDINAL)
	public RoleLevels role_level;
		
	public String role_name;
	
	public String reporting_to;
	
	public String final_approval;
	
	@Column(length=700)
	public String permissions;
	
	public String getPermissions(){
		return permissions;
	}
	
	public void setPermissions(String permissions){
		this.permissions = permissions;
	}
	
	public static Model.Finder<Long, RoleLevel> find = new Model.Finder<Long,RoleLevel>(Long.class, RoleLevel.class);
    
	public static RoleLevel findById(Long id){
		return RoleLevel.find.byId(id);
	}
	
	public static RoleLevel findByUser(Long id, String pm) {
        return find.where().add(Expr.eq("roleX", RoleX.findByCompany(User.findById(id).companyobject.id))).findUnique();
    }
	
	public static List<RoleLevel> findListByCompany(Long id) {
		return find.where().add(Expr.eq("roleX",RoleX.find.where().eq("company", Company.find.byId(id)).findUnique())).findList();
    }
	
	public static RoleLevel findByCompany(Long id) {
		return find.where().add(Expr.eq("roleX",RoleX.find.where().eq("company", Company.find.byId(id)).findUnique())).findUnique();
    }
	
	
	
	public static boolean checkUserLevel(Long id,RoleLevels currentLevel){
		RoleX roleX = RoleX.find.where(Expr.eq("company", User.findById(id).companyobject)).findUnique();
		for(RoleLevel level : roleX.roleLevels){
			if(level.role_level.ordinal() >= currentLevel.ordinal()){
				return true;
			}
		}
		return false;
	}
	
}
