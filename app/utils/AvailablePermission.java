package utils;

public class AvailablePermission {
	public String permissionName;
	public String permissionKey;
	public boolean state=false;
	public boolean parentPresent = false;
	public boolean urlPresent = false;
	
	public AvailablePermission(String permissionKey, String permission,boolean state,boolean parentPresent,boolean urlPresent){
		this.permissionName = permission;
		this.parentPresent = parentPresent;
		this.state = state;
		this.permissionKey = permissionKey;
		this.urlPresent = urlPresent;
	}
}
