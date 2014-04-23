package com.custom.domain;

import controllers.routes;

public enum Permissions {
	Home(routes.Application.index().url(),null,"Home"),
	
	Manage("#",null,"Manage"),
	ManageUser(routes.Users.index().url(),Manage,"Users"),
	ManageClient(routes.Clients.index().url(),Manage,"Clients"),
	ManageProject(routes.Projects.index().url(),Manage,"Projects"),
	ManageTask(routes.Tasks.index().url(),Manage,"Tasks"),
	
	
	Leaves("#",null,"Leaves"),
	ApplyLeave(routes.Leaves.applyIndex().url(),Leaves,"My Leaves"),
	
	Timesheet("#",null,"Timesheet"),
	CreateTimesheet(routes.Timesheets.index().url(),Timesheet,"Create"),
	SearchTimesheet(routes.Timesheets.searchIndex().url(),Timesheet,"History"),
	
	Delegate(routes.Delegate.index().url(),null,"Delegation"),
	
	Feedback("#",null,"Feedback"),
	FeedBackCreate(routes.Feedbacks.customIndex().url(),Feedback,"Create"),
	FeedBackView(routes.Feedbacks.index().url(),Feedback,"View"),
	
	PermissionsManagement("#",null,"Permissions Management"),
	RolePermissions(routes.RolePermissions.index().url(),PermissionsManagement,"By Roles"),
	UserPermissions(routes.UserPermissions.index().url(),PermissionsManagement,"By Users"),
	
	ActionBox("#",null,"Action Items"),
	UserRequest(routes.Status.userIndex().url(),ActionBox,"On Users"),
	CompanyRequest(routes.Status.companyIndex().url(),ActionBox,"On Company"),
	MyBucket(routes.TimesheetBuckets.index().url(),ActionBox,"TimeSheet Requests"),
	LeaveBucket(routes.Leaves.bucketIndex().url(),ActionBox,"Leaves Requests"),
	
	Report("#",null,"Report"),
	TeamRate(routes.Reports.teamRateIndex().url(),Report,"Team Rate"),
	ProjectReport(routes.ProjectReports.projectReportIndex().url(),Report,"ProjectReport"),

	Setting("#",null,"Settings"),
	Mail(routes.Mail.index().url(),Setting,"Mail Setting"),
	Notification(routes.Notifications.index().url(),Setting,"TimeSheet Notification"),
	DefineRoles(routes.Roles.defineRoles().url(),Setting,"Define Roles"),
	OrgHierarchy(routes.Roles.showRoles().url(),Setting,"Org Hierarchy");		
	
	private String url;
	private int level;
	private Permissions parent;
	private String uiDisplay;
	
	private Permissions(String _url,Permissions parent,String uiDisplay){
		this.url=_url;
		this.parent = parent;
		this.uiDisplay = uiDisplay;
	}
	
	public String url(){
		return url;
	}
	
	public int level(){
		return level;
	}
	
	public Permissions parent(){
		return parent;
	}
	
	public String display(){
		return uiDisplay;
	}
}