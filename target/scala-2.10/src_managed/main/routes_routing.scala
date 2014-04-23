// @SOURCE:/Users/Secret/Technology/play-2.1.0/Time_Trotter/conf/routes
// @HASH:4dd6244e9ca3d3375b7182bcc19769f3618ca939
// @DATE:Mon Apr 21 14:16:17 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_deployment1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deploy"))))
        

// @LINE:8
private[this] lazy val controllers_Application_restrictedPage2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accessDeny"))))
        

// @LINE:9
private[this] lazy val controllers_Application_setPassword3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("set"))))
        

// @LINE:12
private[this] lazy val controllers_Application_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Application_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:16
private[this] lazy val controllers_Application_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:19
private[this] lazy val controllers_Application_registration7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration"))))
        

// @LINE:20
private[this] lazy val controllers_Application_createAccount8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration"))))
        

// @LINE:21
private[this] lazy val controllers_Application_checkUserEmailAvailability9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkUserEmail"))))
        

// @LINE:22
private[this] lazy val controllers_Application_checkPassword10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkPassword"))))
        

// @LINE:23
private[this] lazy val controllers_Application_checkOldPassword11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkOldPassword"))))
        

// @LINE:24
private[this] lazy val controllers_Application_changePassword12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("changePassword"))))
        

// @LINE:27
private[this] lazy val controllers_Application_checkCompanyEmailAvailability13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkCompanyEmail"))))
        

// @LINE:30
private[this] lazy val controllers_Leaves_applyIndex14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveIndex"))))
        

// @LINE:31
private[this] lazy val controllers_Leaves_search15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveSearch"))))
        

// @LINE:32
private[this] lazy val controllers_Leaves_delete16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveDelete"))))
        

// @LINE:33
private[this] lazy val controllers_Leaves_create17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveCreate"))))
        

// @LINE:34
private[this] lazy val controllers_Leaves_edit18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveEdit"))))
        

// @LINE:35
private[this] lazy val controllers_Leaves_showEdit19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leavesShowEdit"))))
        

// @LINE:36
private[this] lazy val controllers_Leaves_leaveApprovalViaMail20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveApprovalViaMail"))))
        

// @LINE:37
private[this] lazy val controllers_Leaves_excelReport21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveExcelReport"))))
        

// @LINE:38
private[this] lazy val controllers_Leaves_excelApplyReport22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leaveApplyExcelReport"))))
        

// @LINE:41
private[this] lazy val controllers_Leaves_bucketIndex23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leave/bucketIndex"))))
        

// @LINE:42
private[this] lazy val controllers_Leaves_leaveSearch24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leave/bucketSearch"))))
        

// @LINE:43
private[this] lazy val controllers_Leaves_approveLeave25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leave/approveLeave"))))
        

// @LINE:44
private[this] lazy val controllers_Leaves_rejectLeave26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leave/rejectLeave"))))
        

// @LINE:45
private[this] lazy val controllers_Leaves_retractLeave27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("leave/retractLeave"))))
        

// @LINE:48
private[this] lazy val controllers_Application_finduser28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("finduserid"))))
        

// @LINE:49
private[this] lazy val controllers_Application_forgotpassword29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forgot"))))
        

// @LINE:52
private[this] lazy val controllers_Application_companyregistration30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:53
private[this] lazy val controllers_Application_companycreateAccount31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("complete"))))
        

// @LINE:54
private[this] lazy val controllers_Application_companysearch32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companysearch"))))
        

// @LINE:55
private[this] lazy val controllers_Application_checkCompanyCodeAvailability33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkCompanyCode"))))
        

// @LINE:56
private[this] lazy val controllers_Application_checkCompanyNameAvailability34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkCompanyName"))))
        

// @LINE:59
private[this] lazy val controllers_Users_search35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userSearch"))))
        

// @LINE:60
private[this] lazy val controllers_Users_delete36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userDelete"))))
        

// @LINE:61
private[this] lazy val controllers_Users_create37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userCreate"))))
        

// @LINE:62
private[this] lazy val controllers_Users_edit38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userEdit"))))
        

// @LINE:63
private[this] lazy val controllers_Users_index39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userIndex"))))
        

// @LINE:64
private[this] lazy val controllers_Users_findHRUser40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findHRUser"))))
        

// @LINE:65
private[this] lazy val controllers_Users_getCompanyUser41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findcompanyuser"))))
        

// @LINE:66
private[this] lazy val controllers_Users_findManagerUser42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findManagerUser"))))
        

// @LINE:67
private[this] lazy val controllers_Users_findProjectManagers43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findPM"))))
        

// @LINE:68
private[this] lazy val controllers_Users_showEdit44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userShowEdit"))))
        

// @LINE:69
private[this] lazy val controllers_UserSearch_index45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGenericSearchIndex"))))
        

// @LINE:70
private[this] lazy val controllers_UserSearch_search46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGenericDoSearch"))))
        

// @LINE:71
private[this] lazy val controllers_Users_emailAvailability47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("emailAvailability"))))
        

// @LINE:72
private[this] lazy val controllers_Users_idAvailability48 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("idAvailability"))))
        

// @LINE:73
private[this] lazy val controllers_Users_excelReport49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userExcelReport"))))
        

// @LINE:74
private[this] lazy val controllers_Users_findDelegateTos50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findDelegatedTo"))))
        

// @LINE:77
private[this] lazy val controllers_Projects_index51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectIndex"))))
        

// @LINE:78
private[this] lazy val controllers_Projects_search52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectSearch"))))
        

// @LINE:79
private[this] lazy val controllers_Projects_delete53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectDelete"))))
        

// @LINE:80
private[this] lazy val controllers_Projects_create54 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectCreate"))))
        

// @LINE:81
private[this] lazy val controllers_Projects_edit55 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectEdit"))))
        

// @LINE:82
private[this] lazy val controllers_Clients_findClients56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("findClient"))))
        

// @LINE:83
private[this] lazy val controllers_Projects_showEdit57 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectShowEdit"))))
        

// @LINE:84
private[this] lazy val controllers_Projects_checkProjectCodeAvailability58 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectCodeAvailability"))))
        

// @LINE:85
private[this] lazy val controllers_Projects_excelReport59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectExcelReport"))))
        

// @LINE:88
private[this] lazy val controllers_Tasks_index60 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskIndex"))))
        

// @LINE:89
private[this] lazy val controllers_Tasks_search61 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskSearch"))))
        

// @LINE:90
private[this] lazy val controllers_Tasks_delete62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskDelete"))))
        

// @LINE:91
private[this] lazy val controllers_Tasks_create63 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskCreate"))))
        

// @LINE:92
private[this] lazy val controllers_Tasks_edit64 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskEdit"))))
        

// @LINE:93
private[this] lazy val controllers_Tasks_findProjectByName65 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projectByName"))))
        

// @LINE:94
private[this] lazy val controllers_Tasks_showEdit66 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskShowEdit"))))
        

// @LINE:95
private[this] lazy val controllers_Tasks_excelReport67 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taskExcelReport"))))
        

// @LINE:98
private[this] lazy val controllers_Clients_index68 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientIndex"))))
        

// @LINE:99
private[this] lazy val controllers_Clients_search69 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientSearch"))))
        

// @LINE:100
private[this] lazy val controllers_Clients_delete70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientDelete"))))
        

// @LINE:101
private[this] lazy val controllers_Clients_create71 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientCreate"))))
        

// @LINE:102
private[this] lazy val controllers_Clients_edit72 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientEdit"))))
        

// @LINE:103
private[this] lazy val controllers_Clients_showEdit73 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientShowEdit"))))
        

// @LINE:104
private[this] lazy val controllers_Clients_excelReport74 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientExcelReport"))))
        

// @LINE:107
private[this] lazy val controllers_Timesheets_index75 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetIndex"))))
        

// @LINE:108
private[this] lazy val controllers_Timesheets_searchIndex76 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetSearchIndex"))))
        

// @LINE:109
private[this] lazy val controllers_Timesheets_create77 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetCreate"))))
        

// @LINE:110
private[this] lazy val controllers_Timesheets_cancel78 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetCancel"))))
        

// @LINE:111
private[this] lazy val controllers_Timesheets_getTaskCodes79 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/getTaskCode"))))
        

// @LINE:112
private[this] lazy val controllers_Timesheets_getTimesheetTable80 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/getTimesheetTable"))))
        

// @LINE:113
private[this] lazy val controllers_Timesheets_getLastWeekTimesheet81 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/getLastWeekTimesheet"))))
        

// @LINE:114
private[this] lazy val controllers_Timesheets_search82 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("TimesheetSearch"))))
        

// @LINE:115
private[this] lazy val controllers_Timesheets_editTimesheet83 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetEdit/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:116
private[this] lazy val controllers_Timesheets_excelReport84 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetExcelReport"))))
        

// @LINE:117
private[this] lazy val controllers_Timesheets_retractTimesheet85 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("retractTimesheet"))))
        

// @LINE:120
private[this] lazy val controllers_TimesheetBuckets_index86 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/bucketIndex"))))
        

// @LINE:121
private[this] lazy val controllers_TimesheetBuckets_search87 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/bucketSearch"))))
        

// @LINE:122
private[this] lazy val controllers_TimesheetBuckets_displaySelectedTimesheet88 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/displayTimesheet"))))
        

// @LINE:123
private[this] lazy val controllers_TimesheetBuckets_approveTimesheets89 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/approveTimesheets"))))
        

// @LINE:124
private[this] lazy val controllers_TimesheetBuckets_rejectTimesheets90 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/rejectTimesheets"))))
        

// @LINE:125
private[this] lazy val controllers_TimesheetBuckets_approveTimesheetsOk91 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/approveTimesheetsOk"))))
        

// @LINE:126
private[this] lazy val controllers_TimesheetBuckets_rejectTimesheetsOk92 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheet/rejectTimesheetsOk"))))
        

// @LINE:127
private[this] lazy val controllers_TimesheetBuckets_excelReport93 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetBucketExcelReport"))))
        

// @LINE:128
private[this] lazy val controllers_Timesheets_timeSheetApprovalViaMail94 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetApprovalViaMail"))))
        

// @LINE:131
private[this] lazy val controllers_Feedbacks_index95 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback/view"))))
        

// @LINE:132
private[this] lazy val controllers_Feedbacks_customIndex96 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback/create"))))
        

// @LINE:133
private[this] lazy val controllers_Feedbacks_customSearchIndex97 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback/customSearchIndex"))))
        

// @LINE:134
private[this] lazy val controllers_Feedbacks_create98 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedbackCreate"))))
        

// @LINE:135
private[this] lazy val controllers_Feedbacks_submit99 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submitFeedback"))))
        

// @LINE:136
private[this] lazy val controllers_Feedbacks_searchIndex100 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedback/searchIndex"))))
        

// @LINE:137
private[this] lazy val controllers_Feedbacks_display101 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feedbackDisplay"))))
        

// @LINE:140
private[this] lazy val controllers_UserPermissions_index102 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("permissionIndex"))))
        

// @LINE:141
private[this] lazy val controllers_UserPermissions_getUserList103 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("permissionsearch"))))
        

// @LINE:142
private[this] lazy val controllers_UserPermissions_update104 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("permission/update"))))
        

// @LINE:143
private[this] lazy val controllers_UserPermissions_save105 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("permission/save"))))
        

// @LINE:144
private[this] lazy val controllers_RolePermissions_index106 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rolepermissionIndex"))))
        

// @LINE:145
private[this] lazy val controllers_RolePermissions_getRoleList107 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rolepermissionsearch"))))
        

// @LINE:146
private[this] lazy val controllers_RolePermissions_update108 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rolepermission/update"))))
        

// @LINE:147
private[this] lazy val controllers_RolePermissions_save109 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rolepermission/save"))))
        

// @LINE:150
private[this] lazy val controllers_Status_userIndex110 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userStatusIndex"))))
        

// @LINE:151
private[this] lazy val controllers_Status_userSearch111 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userStatusSearch"))))
        

// @LINE:152
private[this] lazy val controllers_Status_approveUserStatus112 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userStatusApprove"))))
        

// @LINE:153
private[this] lazy val controllers_Status_disapproveUserStatus113 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userStatusdisapprove"))))
        

// @LINE:154
private[this] lazy val controllers_Status_excelReportUser114 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userStatusExcelReport"))))
        

// @LINE:155
private[this] lazy val controllers_Status_companyIndex115 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companyStatusIndex"))))
        

// @LINE:156
private[this] lazy val controllers_Status_companySearch116 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companyStatusSearch"))))
        

// @LINE:157
private[this] lazy val controllers_Status_approveCompanyStatus117 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companyStatusApprove"))))
        

// @LINE:158
private[this] lazy val controllers_Status_disapproveCompanyStatus118 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companyStatusDisapprove"))))
        

// @LINE:159
private[this] lazy val controllers_Status_excelReportCompany119 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companyStatusExcelReport"))))
        

// @LINE:162
private[this] lazy val controllers_Mail_index120 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mailIndex"))))
        

// @LINE:163
private[this] lazy val controllers_Mail_settingSave121 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mailSave"))))
        

// @LINE:166
private[this] lazy val controllers_Notifications_index122 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("notificationIndex"))))
        

// @LINE:167
private[this] lazy val controllers_Notifications_save123 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("notificationSave"))))
        

// @LINE:170
private[this] lazy val controllers_Delegate_index124 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delegateIndex"))))
        

// @LINE:171
private[this] lazy val controllers_Delegate_save125 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delagationSave"))))
        

// @LINE:174
private[this] lazy val controllers_Roles_index126 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleIndex"))))
        

// @LINE:175
private[this] lazy val controllers_Roles_search127 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleSearch"))))
        

// @LINE:176
private[this] lazy val controllers_Roles_delete128 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleDelete"))))
        

// @LINE:177
private[this] lazy val controllers_Roles_create129 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleCreate"))))
        

// @LINE:178
private[this] lazy val controllers_Roles_edit130 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleEdit"))))
        

// @LINE:179
private[this] lazy val controllers_Roles_showEdit131 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roleShowEdit"))))
        

// @LINE:180
private[this] lazy val controllers_Roles_defineRoles132 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("defineRoles"))))
        

// @LINE:181
private[this] lazy val controllers_Roles_showRoles133 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showRoles"))))
        

// @LINE:182
private[this] lazy val controllers_Roles_saveRole134 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveRole"))))
        

// @LINE:183
private[this] lazy val controllers_Roles_saveRole135 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveOrg"))))
        

// @LINE:186
private[this] lazy val controllers_Reports_teamRateIndex136 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reportIndex"))))
        

// @LINE:187
private[this] lazy val controllers_Reports_teamRateSearch137 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reportSearch"))))
        

// @LINE:190
private[this] lazy val controllers_ProjectReports_projectReportIndex138 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projReportIndex"))))
        

// @LINE:191
private[this] lazy val controllers_ProjectReports_projectReportSearch139 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projReportSearch"))))
        

// @LINE:192
private[this] lazy val controllers_ProjectReports_viewProjectDetails140 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projViewDetails"))))
        

// @LINE:193
private[this] lazy val controllers_ProjectReports_viewGraph141 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("viewGraph"))))
        

// @LINE:194
private[this] lazy val controllers_ProjectReports_viewUsageByHrs142 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projViewGraphHrs"))))
        

// @LINE:197
private[this] lazy val controllers_ProjectSearch_index143 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projDetailsIndex"))))
        

// @LINE:198
private[this] lazy val controllers_ProjectSearch_search144 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projDetailsSearch"))))
        

// @LINE:201
private[this] lazy val controllers_Assets_at145 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deploy""","""controllers.Application.deployment()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accessDeny""","""controllers.Application.restrictedPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """set""","""controllers.Application.setPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration""","""controllers.Application.registration()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration""","""controllers.Application.createAccount()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkUserEmail""","""controllers.Application.checkUserEmailAvailability()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkPassword""","""controllers.Application.checkPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkOldPassword""","""controllers.Application.checkOldPassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """changePassword""","""controllers.Application.changePassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkCompanyEmail""","""controllers.Application.checkCompanyEmailAvailability()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveIndex""","""controllers.Leaves.applyIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveSearch""","""controllers.Leaves.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveDelete""","""controllers.Leaves.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveCreate""","""controllers.Leaves.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveEdit""","""controllers.Leaves.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leavesShowEdit""","""controllers.Leaves.showEdit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveApprovalViaMail""","""controllers.Leaves.leaveApprovalViaMail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveExcelReport""","""controllers.Leaves.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leaveApplyExcelReport""","""controllers.Leaves.excelApplyReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave/bucketIndex""","""controllers.Leaves.bucketIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave/bucketSearch""","""controllers.Leaves.leaveSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave/approveLeave""","""controllers.Leaves.approveLeave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave/rejectLeave""","""controllers.Leaves.rejectLeave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """leave/retractLeave""","""controllers.Leaves.retractLeave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """finduserid""","""controllers.Application.finduser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forgot""","""controllers.Application.forgotpassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.companyregistration()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """complete""","""controllers.Application.companycreateAccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companysearch""","""controllers.Application.companysearch(q:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkCompanyCode""","""controllers.Application.checkCompanyCodeAvailability()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkCompanyName""","""controllers.Application.checkCompanyNameAvailability()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userSearch""","""controllers.Users.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userDelete""","""controllers.Users.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userCreate""","""controllers.Users.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userEdit""","""controllers.Users.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userIndex""","""controllers.Users.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findHRUser""","""controllers.Users.findHRUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findcompanyuser""","""controllers.Users.getCompanyUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findManagerUser""","""controllers.Users.findManagerUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findPM""","""controllers.Users.findProjectManagers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userShowEdit""","""controllers.Users.showEdit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGenericSearchIndex""","""controllers.UserSearch.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGenericDoSearch""","""controllers.UserSearch.search()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """emailAvailability""","""controllers.Users.emailAvailability()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """idAvailability""","""controllers.Users.idAvailability()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userExcelReport""","""controllers.Users.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findDelegatedTo""","""controllers.Users.findDelegateTos()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectIndex""","""controllers.Projects.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectSearch""","""controllers.Projects.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectDelete""","""controllers.Projects.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectCreate""","""controllers.Projects.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectEdit""","""controllers.Projects.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """findClient""","""controllers.Clients.findClients()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectShowEdit""","""controllers.Projects.showEdit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectCodeAvailability""","""controllers.Projects.checkProjectCodeAvailability()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectExcelReport""","""controllers.Projects.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskIndex""","""controllers.Tasks.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskSearch""","""controllers.Tasks.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskDelete""","""controllers.Tasks.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskCreate""","""controllers.Tasks.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskEdit""","""controllers.Tasks.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projectByName""","""controllers.Tasks.findProjectByName()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskShowEdit""","""controllers.Tasks.showEdit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taskExcelReport""","""controllers.Tasks.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientIndex""","""controllers.Clients.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientSearch""","""controllers.Clients.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientDelete""","""controllers.Clients.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientCreate""","""controllers.Clients.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientEdit""","""controllers.Clients.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientShowEdit""","""controllers.Clients.showEdit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientExcelReport""","""controllers.Clients.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetIndex""","""controllers.Timesheets.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetSearchIndex""","""controllers.Timesheets.searchIndex()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetCreate""","""controllers.Timesheets.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetCancel""","""controllers.Timesheets.cancel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/getTaskCode""","""controllers.Timesheets.getTaskCodes(_value:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/getTimesheetTable""","""controllers.Timesheets.getTimesheetTable(id:String, week:String, year:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/getLastWeekTimesheet""","""controllers.Timesheets.getLastWeekTimesheet(week:Integer, year:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """TimesheetSearch""","""controllers.Timesheets.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetEdit/$id<[^/]+>""","""controllers.Timesheets.editTimesheet(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetExcelReport""","""controllers.Timesheets.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """retractTimesheet""","""controllers.Timesheets.retractTimesheet()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/bucketIndex""","""controllers.TimesheetBuckets.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/bucketSearch""","""controllers.TimesheetBuckets.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/displayTimesheet""","""controllers.TimesheetBuckets.displaySelectedTimesheet(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/approveTimesheets""","""controllers.TimesheetBuckets.approveTimesheets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/rejectTimesheets""","""controllers.TimesheetBuckets.rejectTimesheets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/approveTimesheetsOk""","""controllers.TimesheetBuckets.approveTimesheetsOk(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheet/rejectTimesheetsOk""","""controllers.TimesheetBuckets.rejectTimesheetsOk(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetBucketExcelReport""","""controllers.TimesheetBuckets.excelReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetApprovalViaMail""","""controllers.Timesheets.timeSheetApprovalViaMail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback/view""","""controllers.Feedbacks.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback/create""","""controllers.Feedbacks.customIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback/customSearchIndex""","""controllers.Feedbacks.customSearchIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedbackCreate""","""controllers.Feedbacks.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submitFeedback""","""controllers.Feedbacks.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedback/searchIndex""","""controllers.Feedbacks.searchIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feedbackDisplay""","""controllers.Feedbacks.display()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """permissionIndex""","""controllers.UserPermissions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """permissionsearch""","""controllers.UserPermissions.getUserList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """permission/update""","""controllers.UserPermissions.update()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """permission/save""","""controllers.UserPermissions.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rolepermissionIndex""","""controllers.RolePermissions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rolepermissionsearch""","""controllers.RolePermissions.getRoleList()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rolepermission/update""","""controllers.RolePermissions.update()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rolepermission/save""","""controllers.RolePermissions.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userStatusIndex""","""controllers.Status.userIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userStatusSearch""","""controllers.Status.userSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userStatusApprove""","""controllers.Status.approveUserStatus(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userStatusdisapprove""","""controllers.Status.disapproveUserStatus(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userStatusExcelReport""","""controllers.Status.excelReportUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companyStatusIndex""","""controllers.Status.companyIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companyStatusSearch""","""controllers.Status.companySearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companyStatusApprove""","""controllers.Status.approveCompanyStatus(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companyStatusDisapprove""","""controllers.Status.disapproveCompanyStatus(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companyStatusExcelReport""","""controllers.Status.excelReportCompany()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mailIndex""","""controllers.Mail.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mailSave""","""controllers.Mail.settingSave()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """notificationIndex""","""controllers.Notifications.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """notificationSave""","""controllers.Notifications.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delegateIndex""","""controllers.Delegate.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delagationSave""","""controllers.Delegate.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleIndex""","""controllers.Roles.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleSearch""","""controllers.Roles.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleDelete""","""controllers.Roles.delete()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleCreate""","""controllers.Roles.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleEdit""","""controllers.Roles.edit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roleShowEdit""","""controllers.Roles.showEdit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """defineRoles""","""controllers.Roles.defineRoles()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showRoles""","""controllers.Roles.showRoles()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveRole""","""controllers.Roles.saveRole()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveOrg""","""controllers.Roles.saveRole()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reportIndex""","""controllers.Reports.teamRateIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reportSearch""","""controllers.Reports.teamRateSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projReportIndex""","""controllers.ProjectReports.projectReportIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projReportSearch""","""controllers.ProjectReports.projectReportSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projViewDetails""","""controllers.ProjectReports.viewProjectDetails()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """viewGraph""","""controllers.ProjectReports.viewGraph()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projViewGraphHrs""","""controllers.ProjectReports.viewUsageByHrs(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projDetailsIndex""","""controllers.ProjectSearch.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projDetailsSearch""","""controllers.ProjectSearch.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_deployment1(params) => {
   call { 
        invokeHandler(controllers.Application.deployment(), HandlerDef(this, "controllers.Application", "deployment", Nil,"GET", """""", Routes.prefix + """deploy"""))
   }
}
        

// @LINE:8
case controllers_Application_restrictedPage2(params) => {
   call { 
        invokeHandler(controllers.Application.restrictedPage(), HandlerDef(this, "controllers.Application", "restrictedPage", Nil,"GET", """""", Routes.prefix + """accessDeny"""))
   }
}
        

// @LINE:9
case controllers_Application_setPassword3(params) => {
   call { 
        invokeHandler(controllers.Application.setPassword(), HandlerDef(this, "controllers.Application", "setPassword", Nil,"GET", """""", Routes.prefix + """set"""))
   }
}
        

// @LINE:12
case controllers_Application_login4(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """Login Module""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Application_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:16
case controllers_Application_logout6(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """Logout""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:19
case controllers_Application_registration7(params) => {
   call { 
        invokeHandler(controllers.Application.registration(), HandlerDef(this, "controllers.Application", "registration", Nil,"GET", """User Registration""", Routes.prefix + """registration"""))
   }
}
        

// @LINE:20
case controllers_Application_createAccount8(params) => {
   call { 
        invokeHandler(controllers.Application.createAccount(), HandlerDef(this, "controllers.Application", "createAccount", Nil,"POST", """""", Routes.prefix + """registration"""))
   }
}
        

// @LINE:21
case controllers_Application_checkUserEmailAvailability9(params) => {
   call { 
        invokeHandler(controllers.Application.checkUserEmailAvailability(), HandlerDef(this, "controllers.Application", "checkUserEmailAvailability", Nil,"POST", """""", Routes.prefix + """checkUserEmail"""))
   }
}
        

// @LINE:22
case controllers_Application_checkPassword10(params) => {
   call { 
        invokeHandler(controllers.Application.checkPassword(), HandlerDef(this, "controllers.Application", "checkPassword", Nil,"POST", """""", Routes.prefix + """checkPassword"""))
   }
}
        

// @LINE:23
case controllers_Application_checkOldPassword11(params) => {
   call { 
        invokeHandler(controllers.Application.checkOldPassword(), HandlerDef(this, "controllers.Application", "checkOldPassword", Nil,"POST", """""", Routes.prefix + """checkOldPassword"""))
   }
}
        

// @LINE:24
case controllers_Application_changePassword12(params) => {
   call { 
        invokeHandler(controllers.Application.changePassword(), HandlerDef(this, "controllers.Application", "changePassword", Nil,"POST", """""", Routes.prefix + """changePassword"""))
   }
}
        

// @LINE:27
case controllers_Application_checkCompanyEmailAvailability13(params) => {
   call { 
        invokeHandler(controllers.Application.checkCompanyEmailAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyEmailAvailability", Nil,"POST", """Company Registration""", Routes.prefix + """checkCompanyEmail"""))
   }
}
        

// @LINE:30
case controllers_Leaves_applyIndex14(params) => {
   call { 
        invokeHandler(controllers.Leaves.applyIndex(), HandlerDef(this, "controllers.Leaves", "applyIndex", Nil,"GET", """ Leave Section""", Routes.prefix + """leaveIndex"""))
   }
}
        

// @LINE:31
case controllers_Leaves_search15(params) => {
   call { 
        invokeHandler(controllers.Leaves.search(), HandlerDef(this, "controllers.Leaves", "search", Nil,"GET", """""", Routes.prefix + """leaveSearch"""))
   }
}
        

// @LINE:32
case controllers_Leaves_delete16(params) => {
   call { 
        invokeHandler(controllers.Leaves.delete(), HandlerDef(this, "controllers.Leaves", "delete", Nil,"GET", """""", Routes.prefix + """leaveDelete"""))
   }
}
        

// @LINE:33
case controllers_Leaves_create17(params) => {
   call { 
        invokeHandler(controllers.Leaves.create(), HandlerDef(this, "controllers.Leaves", "create", Nil,"POST", """""", Routes.prefix + """leaveCreate"""))
   }
}
        

// @LINE:34
case controllers_Leaves_edit18(params) => {
   call { 
        invokeHandler(controllers.Leaves.edit(), HandlerDef(this, "controllers.Leaves", "edit", Nil,"POST", """""", Routes.prefix + """leaveEdit"""))
   }
}
        

// @LINE:35
case controllers_Leaves_showEdit19(params) => {
   call { 
        invokeHandler(controllers.Leaves.showEdit(), HandlerDef(this, "controllers.Leaves", "showEdit", Nil,"GET", """""", Routes.prefix + """leavesShowEdit"""))
   }
}
        

// @LINE:36
case controllers_Leaves_leaveApprovalViaMail20(params) => {
   call { 
        invokeHandler(controllers.Leaves.leaveApprovalViaMail(), HandlerDef(this, "controllers.Leaves", "leaveApprovalViaMail", Nil,"GET", """""", Routes.prefix + """leaveApprovalViaMail"""))
   }
}
        

// @LINE:37
case controllers_Leaves_excelReport21(params) => {
   call { 
        invokeHandler(controllers.Leaves.excelReport(), HandlerDef(this, "controllers.Leaves", "excelReport", Nil,"GET", """""", Routes.prefix + """leaveExcelReport"""))
   }
}
        

// @LINE:38
case controllers_Leaves_excelApplyReport22(params) => {
   call { 
        invokeHandler(controllers.Leaves.excelApplyReport(), HandlerDef(this, "controllers.Leaves", "excelApplyReport", Nil,"GET", """""", Routes.prefix + """leaveApplyExcelReport"""))
   }
}
        

// @LINE:41
case controllers_Leaves_bucketIndex23(params) => {
   call { 
        invokeHandler(controllers.Leaves.bucketIndex(), HandlerDef(this, "controllers.Leaves", "bucketIndex", Nil,"GET", """ LeaveBucket""", Routes.prefix + """leave/bucketIndex"""))
   }
}
        

// @LINE:42
case controllers_Leaves_leaveSearch24(params) => {
   call { 
        invokeHandler(controllers.Leaves.leaveSearch(), HandlerDef(this, "controllers.Leaves", "leaveSearch", Nil,"GET", """""", Routes.prefix + """leave/bucketSearch"""))
   }
}
        

// @LINE:43
case controllers_Leaves_approveLeave25(params) => {
   call { 
        invokeHandler(controllers.Leaves.approveLeave(), HandlerDef(this, "controllers.Leaves", "approveLeave", Nil,"GET", """""", Routes.prefix + """leave/approveLeave"""))
   }
}
        

// @LINE:44
case controllers_Leaves_rejectLeave26(params) => {
   call { 
        invokeHandler(controllers.Leaves.rejectLeave(), HandlerDef(this, "controllers.Leaves", "rejectLeave", Nil,"GET", """""", Routes.prefix + """leave/rejectLeave"""))
   }
}
        

// @LINE:45
case controllers_Leaves_retractLeave27(params) => {
   call { 
        invokeHandler(controllers.Leaves.retractLeave(), HandlerDef(this, "controllers.Leaves", "retractLeave", Nil,"GET", """""", Routes.prefix + """leave/retractLeave"""))
   }
}
        

// @LINE:48
case controllers_Application_finduser28(params) => {
   call { 
        invokeHandler(controllers.Application.finduser(), HandlerDef(this, "controllers.Application", "finduser", Nil,"GET", """Forgot Password""", Routes.prefix + """finduserid"""))
   }
}
        

// @LINE:49
case controllers_Application_forgotpassword29(params) => {
   call { 
        invokeHandler(controllers.Application.forgotpassword(), HandlerDef(this, "controllers.Application", "forgotpassword", Nil,"GET", """""", Routes.prefix + """forgot"""))
   }
}
        

// @LINE:52
case controllers_Application_companyregistration30(params) => {
   call { 
        invokeHandler(controllers.Application.companyregistration(), HandlerDef(this, "controllers.Application", "companyregistration", Nil,"GET", """Company Registration""", Routes.prefix + """register"""))
   }
}
        

// @LINE:53
case controllers_Application_companycreateAccount31(params) => {
   call { 
        invokeHandler(controllers.Application.companycreateAccount(), HandlerDef(this, "controllers.Application", "companycreateAccount", Nil,"GET", """""", Routes.prefix + """complete"""))
   }
}
        

// @LINE:54
case controllers_Application_companysearch32(params) => {
   call(params.fromQuery[String]("q", None)) { (q) =>
        invokeHandler(controllers.Application.companysearch(q), HandlerDef(this, "controllers.Application", "companysearch", Seq(classOf[String]),"GET", """""", Routes.prefix + """companysearch"""))
   }
}
        

// @LINE:55
case controllers_Application_checkCompanyCodeAvailability33(params) => {
   call { 
        invokeHandler(controllers.Application.checkCompanyCodeAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyCodeAvailability", Nil,"POST", """""", Routes.prefix + """checkCompanyCode"""))
   }
}
        

// @LINE:56
case controllers_Application_checkCompanyNameAvailability34(params) => {
   call { 
        invokeHandler(controllers.Application.checkCompanyNameAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyNameAvailability", Nil,"POST", """""", Routes.prefix + """checkCompanyName"""))
   }
}
        

// @LINE:59
case controllers_Users_search35(params) => {
   call { 
        invokeHandler(controllers.Users.search(), HandlerDef(this, "controllers.Users", "search", Nil,"GET", """User""", Routes.prefix + """userSearch"""))
   }
}
        

// @LINE:60
case controllers_Users_delete36(params) => {
   call { 
        invokeHandler(controllers.Users.delete(), HandlerDef(this, "controllers.Users", "delete", Nil,"GET", """""", Routes.prefix + """userDelete"""))
   }
}
        

// @LINE:61
case controllers_Users_create37(params) => {
   call { 
        invokeHandler(controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Nil,"POST", """""", Routes.prefix + """userCreate"""))
   }
}
        

// @LINE:62
case controllers_Users_edit38(params) => {
   call { 
        invokeHandler(controllers.Users.edit(), HandlerDef(this, "controllers.Users", "edit", Nil,"POST", """""", Routes.prefix + """userEdit"""))
   }
}
        

// @LINE:63
case controllers_Users_index39(params) => {
   call { 
        invokeHandler(controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Nil,"GET", """""", Routes.prefix + """userIndex"""))
   }
}
        

// @LINE:64
case controllers_Users_findHRUser40(params) => {
   call { 
        invokeHandler(controllers.Users.findHRUser(), HandlerDef(this, "controllers.Users", "findHRUser", Nil,"GET", """""", Routes.prefix + """findHRUser"""))
   }
}
        

// @LINE:65
case controllers_Users_getCompanyUser41(params) => {
   call { 
        invokeHandler(controllers.Users.getCompanyUser(), HandlerDef(this, "controllers.Users", "getCompanyUser", Nil,"GET", """""", Routes.prefix + """findcompanyuser"""))
   }
}
        

// @LINE:66
case controllers_Users_findManagerUser42(params) => {
   call { 
        invokeHandler(controllers.Users.findManagerUser(), HandlerDef(this, "controllers.Users", "findManagerUser", Nil,"GET", """""", Routes.prefix + """findManagerUser"""))
   }
}
        

// @LINE:67
case controllers_Users_findProjectManagers43(params) => {
   call { 
        invokeHandler(controllers.Users.findProjectManagers(), HandlerDef(this, "controllers.Users", "findProjectManagers", Nil,"GET", """""", Routes.prefix + """findPM"""))
   }
}
        

// @LINE:68
case controllers_Users_showEdit44(params) => {
   call { 
        invokeHandler(controllers.Users.showEdit(), HandlerDef(this, "controllers.Users", "showEdit", Nil,"GET", """""", Routes.prefix + """userShowEdit"""))
   }
}
        

// @LINE:69
case controllers_UserSearch_index45(params) => {
   call { 
        invokeHandler(controllers.UserSearch.index(), HandlerDef(this, "controllers.UserSearch", "index", Nil,"GET", """""", Routes.prefix + """userGenericSearchIndex"""))
   }
}
        

// @LINE:70
case controllers_UserSearch_search46(params) => {
   call { 
        invokeHandler(controllers.UserSearch.search(), HandlerDef(this, "controllers.UserSearch", "search", Nil,"GET", """""", Routes.prefix + """userGenericDoSearch"""))
   }
}
        

// @LINE:71
case controllers_Users_emailAvailability47(params) => {
   call { 
        invokeHandler(controllers.Users.emailAvailability(), HandlerDef(this, "controllers.Users", "emailAvailability", Nil,"POST", """""", Routes.prefix + """emailAvailability"""))
   }
}
        

// @LINE:72
case controllers_Users_idAvailability48(params) => {
   call { 
        invokeHandler(controllers.Users.idAvailability(), HandlerDef(this, "controllers.Users", "idAvailability", Nil,"POST", """""", Routes.prefix + """idAvailability"""))
   }
}
        

// @LINE:73
case controllers_Users_excelReport49(params) => {
   call { 
        invokeHandler(controllers.Users.excelReport(), HandlerDef(this, "controllers.Users", "excelReport", Nil,"GET", """""", Routes.prefix + """userExcelReport"""))
   }
}
        

// @LINE:74
case controllers_Users_findDelegateTos50(params) => {
   call { 
        invokeHandler(controllers.Users.findDelegateTos(), HandlerDef(this, "controllers.Users", "findDelegateTos", Nil,"GET", """""", Routes.prefix + """findDelegatedTo"""))
   }
}
        

// @LINE:77
case controllers_Projects_index51(params) => {
   call { 
        invokeHandler(controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Nil,"GET", """ Project """, Routes.prefix + """projectIndex"""))
   }
}
        

// @LINE:78
case controllers_Projects_search52(params) => {
   call { 
        invokeHandler(controllers.Projects.search(), HandlerDef(this, "controllers.Projects", "search", Nil,"GET", """""", Routes.prefix + """projectSearch"""))
   }
}
        

// @LINE:79
case controllers_Projects_delete53(params) => {
   call { 
        invokeHandler(controllers.Projects.delete(), HandlerDef(this, "controllers.Projects", "delete", Nil,"GET", """""", Routes.prefix + """projectDelete"""))
   }
}
        

// @LINE:80
case controllers_Projects_create54(params) => {
   call { 
        invokeHandler(controllers.Projects.create(), HandlerDef(this, "controllers.Projects", "create", Nil,"POST", """""", Routes.prefix + """projectCreate"""))
   }
}
        

// @LINE:81
case controllers_Projects_edit55(params) => {
   call { 
        invokeHandler(controllers.Projects.edit(), HandlerDef(this, "controllers.Projects", "edit", Nil,"POST", """""", Routes.prefix + """projectEdit"""))
   }
}
        

// @LINE:82
case controllers_Clients_findClients56(params) => {
   call { 
        invokeHandler(controllers.Clients.findClients(), HandlerDef(this, "controllers.Clients", "findClients", Nil,"GET", """""", Routes.prefix + """findClient"""))
   }
}
        

// @LINE:83
case controllers_Projects_showEdit57(params) => {
   call { 
        invokeHandler(controllers.Projects.showEdit(), HandlerDef(this, "controllers.Projects", "showEdit", Nil,"GET", """""", Routes.prefix + """projectShowEdit"""))
   }
}
        

// @LINE:84
case controllers_Projects_checkProjectCodeAvailability58(params) => {
   call { 
        invokeHandler(controllers.Projects.checkProjectCodeAvailability(), HandlerDef(this, "controllers.Projects", "checkProjectCodeAvailability", Nil,"POST", """""", Routes.prefix + """projectCodeAvailability"""))
   }
}
        

// @LINE:85
case controllers_Projects_excelReport59(params) => {
   call { 
        invokeHandler(controllers.Projects.excelReport(), HandlerDef(this, "controllers.Projects", "excelReport", Nil,"GET", """""", Routes.prefix + """projectExcelReport"""))
   }
}
        

// @LINE:88
case controllers_Tasks_index60(params) => {
   call { 
        invokeHandler(controllers.Tasks.index(), HandlerDef(this, "controllers.Tasks", "index", Nil,"GET", """ Task """, Routes.prefix + """taskIndex"""))
   }
}
        

// @LINE:89
case controllers_Tasks_search61(params) => {
   call { 
        invokeHandler(controllers.Tasks.search(), HandlerDef(this, "controllers.Tasks", "search", Nil,"GET", """""", Routes.prefix + """taskSearch"""))
   }
}
        

// @LINE:90
case controllers_Tasks_delete62(params) => {
   call { 
        invokeHandler(controllers.Tasks.delete(), HandlerDef(this, "controllers.Tasks", "delete", Nil,"GET", """""", Routes.prefix + """taskDelete"""))
   }
}
        

// @LINE:91
case controllers_Tasks_create63(params) => {
   call { 
        invokeHandler(controllers.Tasks.create(), HandlerDef(this, "controllers.Tasks", "create", Nil,"POST", """""", Routes.prefix + """taskCreate"""))
   }
}
        

// @LINE:92
case controllers_Tasks_edit64(params) => {
   call { 
        invokeHandler(controllers.Tasks.edit(), HandlerDef(this, "controllers.Tasks", "edit", Nil,"POST", """""", Routes.prefix + """taskEdit"""))
   }
}
        

// @LINE:93
case controllers_Tasks_findProjectByName65(params) => {
   call { 
        invokeHandler(controllers.Tasks.findProjectByName(), HandlerDef(this, "controllers.Tasks", "findProjectByName", Nil,"GET", """""", Routes.prefix + """projectByName"""))
   }
}
        

// @LINE:94
case controllers_Tasks_showEdit66(params) => {
   call { 
        invokeHandler(controllers.Tasks.showEdit(), HandlerDef(this, "controllers.Tasks", "showEdit", Nil,"GET", """""", Routes.prefix + """taskShowEdit"""))
   }
}
        

// @LINE:95
case controllers_Tasks_excelReport67(params) => {
   call { 
        invokeHandler(controllers.Tasks.excelReport(), HandlerDef(this, "controllers.Tasks", "excelReport", Nil,"GET", """""", Routes.prefix + """taskExcelReport"""))
   }
}
        

// @LINE:98
case controllers_Clients_index68(params) => {
   call { 
        invokeHandler(controllers.Clients.index(), HandlerDef(this, "controllers.Clients", "index", Nil,"GET", """ Client """, Routes.prefix + """clientIndex"""))
   }
}
        

// @LINE:99
case controllers_Clients_search69(params) => {
   call { 
        invokeHandler(controllers.Clients.search(), HandlerDef(this, "controllers.Clients", "search", Nil,"GET", """""", Routes.prefix + """clientSearch"""))
   }
}
        

// @LINE:100
case controllers_Clients_delete70(params) => {
   call { 
        invokeHandler(controllers.Clients.delete(), HandlerDef(this, "controllers.Clients", "delete", Nil,"GET", """""", Routes.prefix + """clientDelete"""))
   }
}
        

// @LINE:101
case controllers_Clients_create71(params) => {
   call { 
        invokeHandler(controllers.Clients.create(), HandlerDef(this, "controllers.Clients", "create", Nil,"POST", """""", Routes.prefix + """clientCreate"""))
   }
}
        

// @LINE:102
case controllers_Clients_edit72(params) => {
   call { 
        invokeHandler(controllers.Clients.edit(), HandlerDef(this, "controllers.Clients", "edit", Nil,"POST", """""", Routes.prefix + """clientEdit"""))
   }
}
        

// @LINE:103
case controllers_Clients_showEdit73(params) => {
   call { 
        invokeHandler(controllers.Clients.showEdit(), HandlerDef(this, "controllers.Clients", "showEdit", Nil,"GET", """""", Routes.prefix + """clientShowEdit"""))
   }
}
        

// @LINE:104
case controllers_Clients_excelReport74(params) => {
   call { 
        invokeHandler(controllers.Clients.excelReport(), HandlerDef(this, "controllers.Clients", "excelReport", Nil,"GET", """""", Routes.prefix + """clientExcelReport"""))
   }
}
        

// @LINE:107
case controllers_Timesheets_index75(params) => {
   call { 
        invokeHandler(controllers.Timesheets.index(), HandlerDef(this, "controllers.Timesheets", "index", Nil,"GET", """ Timesheet""", Routes.prefix + """timesheetIndex"""))
   }
}
        

// @LINE:108
case controllers_Timesheets_searchIndex76(params) => {
   call { 
        invokeHandler(controllers.Timesheets.searchIndex(), HandlerDef(this, "controllers.Timesheets", "searchIndex", Nil,"GET", """""", Routes.prefix + """timesheetSearchIndex"""))
   }
}
        

// @LINE:109
case controllers_Timesheets_create77(params) => {
   call { 
        invokeHandler(controllers.Timesheets.create(), HandlerDef(this, "controllers.Timesheets", "create", Nil,"POST", """""", Routes.prefix + """timesheetCreate"""))
   }
}
        

// @LINE:110
case controllers_Timesheets_cancel78(params) => {
   call { 
        invokeHandler(controllers.Timesheets.cancel(), HandlerDef(this, "controllers.Timesheets", "cancel", Nil,"POST", """""", Routes.prefix + """timesheetCancel"""))
   }
}
        

// @LINE:111
case controllers_Timesheets_getTaskCodes79(params) => {
   call(params.fromQuery[String]("_value", None)) { (_value) =>
        invokeHandler(controllers.Timesheets.getTaskCodes(_value), HandlerDef(this, "controllers.Timesheets", "getTaskCodes", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheet/getTaskCode"""))
   }
}
        

// @LINE:112
case controllers_Timesheets_getTimesheetTable80(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("week", None), params.fromQuery[String]("year", None)) { (id, week, year) =>
        invokeHandler(controllers.Timesheets.getTimesheetTable(id, week, year), HandlerDef(this, "controllers.Timesheets", "getTimesheetTable", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """timesheet/getTimesheetTable"""))
   }
}
        

// @LINE:113
case controllers_Timesheets_getLastWeekTimesheet81(params) => {
   call(params.fromQuery[Integer]("week", None), params.fromQuery[Integer]("year", None)) { (week, year) =>
        invokeHandler(controllers.Timesheets.getLastWeekTimesheet(week, year), HandlerDef(this, "controllers.Timesheets", "getLastWeekTimesheet", Seq(classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """timesheet/getLastWeekTimesheet"""))
   }
}
        

// @LINE:114
case controllers_Timesheets_search82(params) => {
   call { 
        invokeHandler(controllers.Timesheets.search(), HandlerDef(this, "controllers.Timesheets", "search", Nil,"GET", """""", Routes.prefix + """TimesheetSearch"""))
   }
}
        

// @LINE:115
case controllers_Timesheets_editTimesheet83(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Timesheets.editTimesheet(id), HandlerDef(this, "controllers.Timesheets", "editTimesheet", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheetEdit/$id<[^/]+>"""))
   }
}
        

// @LINE:116
case controllers_Timesheets_excelReport84(params) => {
   call { 
        invokeHandler(controllers.Timesheets.excelReport(), HandlerDef(this, "controllers.Timesheets", "excelReport", Nil,"GET", """""", Routes.prefix + """timesheetExcelReport"""))
   }
}
        

// @LINE:117
case controllers_Timesheets_retractTimesheet85(params) => {
   call { 
        invokeHandler(controllers.Timesheets.retractTimesheet(), HandlerDef(this, "controllers.Timesheets", "retractTimesheet", Nil,"GET", """""", Routes.prefix + """retractTimesheet"""))
   }
}
        

// @LINE:120
case controllers_TimesheetBuckets_index86(params) => {
   call { 
        invokeHandler(controllers.TimesheetBuckets.index(), HandlerDef(this, "controllers.TimesheetBuckets", "index", Nil,"GET", """ TimesheetBucket""", Routes.prefix + """timesheet/bucketIndex"""))
   }
}
        

// @LINE:121
case controllers_TimesheetBuckets_search87(params) => {
   call { 
        invokeHandler(controllers.TimesheetBuckets.search(), HandlerDef(this, "controllers.TimesheetBuckets", "search", Nil,"GET", """""", Routes.prefix + """timesheet/bucketSearch"""))
   }
}
        

// @LINE:122
case controllers_TimesheetBuckets_displaySelectedTimesheet88(params) => {
   call(params.fromQuery[String]("query", None)) { (query) =>
        invokeHandler(controllers.TimesheetBuckets.displaySelectedTimesheet(query), HandlerDef(this, "controllers.TimesheetBuckets", "displaySelectedTimesheet", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheet/displayTimesheet"""))
   }
}
        

// @LINE:123
case controllers_TimesheetBuckets_approveTimesheets89(params) => {
   call { 
        invokeHandler(controllers.TimesheetBuckets.approveTimesheets, HandlerDef(this, "controllers.TimesheetBuckets", "approveTimesheets", Nil,"GET", """""", Routes.prefix + """timesheet/approveTimesheets"""))
   }
}
        

// @LINE:124
case controllers_TimesheetBuckets_rejectTimesheets90(params) => {
   call { 
        invokeHandler(controllers.TimesheetBuckets.rejectTimesheets, HandlerDef(this, "controllers.TimesheetBuckets", "rejectTimesheets", Nil,"GET", """""", Routes.prefix + """timesheet/rejectTimesheets"""))
   }
}
        

// @LINE:125
case controllers_TimesheetBuckets_approveTimesheetsOk91(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.TimesheetBuckets.approveTimesheetsOk(id), HandlerDef(this, "controllers.TimesheetBuckets", "approveTimesheetsOk", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheet/approveTimesheetsOk"""))
   }
}
        

// @LINE:126
case controllers_TimesheetBuckets_rejectTimesheetsOk92(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.TimesheetBuckets.rejectTimesheetsOk(id), HandlerDef(this, "controllers.TimesheetBuckets", "rejectTimesheetsOk", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheet/rejectTimesheetsOk"""))
   }
}
        

// @LINE:127
case controllers_TimesheetBuckets_excelReport93(params) => {
   call { 
        invokeHandler(controllers.TimesheetBuckets.excelReport(), HandlerDef(this, "controllers.TimesheetBuckets", "excelReport", Nil,"GET", """""", Routes.prefix + """timesheetBucketExcelReport"""))
   }
}
        

// @LINE:128
case controllers_Timesheets_timeSheetApprovalViaMail94(params) => {
   call { 
        invokeHandler(controllers.Timesheets.timeSheetApprovalViaMail(), HandlerDef(this, "controllers.Timesheets", "timeSheetApprovalViaMail", Nil,"GET", """""", Routes.prefix + """timesheetApprovalViaMail"""))
   }
}
        

// @LINE:131
case controllers_Feedbacks_index95(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.index(), HandlerDef(this, "controllers.Feedbacks", "index", Nil,"GET", """ Feedback""", Routes.prefix + """feedback/view"""))
   }
}
        

// @LINE:132
case controllers_Feedbacks_customIndex96(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.customIndex(), HandlerDef(this, "controllers.Feedbacks", "customIndex", Nil,"GET", """""", Routes.prefix + """feedback/create"""))
   }
}
        

// @LINE:133
case controllers_Feedbacks_customSearchIndex97(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.customSearchIndex(), HandlerDef(this, "controllers.Feedbacks", "customSearchIndex", Nil,"GET", """""", Routes.prefix + """feedback/customSearchIndex"""))
   }
}
        

// @LINE:134
case controllers_Feedbacks_create98(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.create(), HandlerDef(this, "controllers.Feedbacks", "create", Nil,"GET", """""", Routes.prefix + """feedbackCreate"""))
   }
}
        

// @LINE:135
case controllers_Feedbacks_submit99(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.submit(), HandlerDef(this, "controllers.Feedbacks", "submit", Nil,"POST", """""", Routes.prefix + """submitFeedback"""))
   }
}
        

// @LINE:136
case controllers_Feedbacks_searchIndex100(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.searchIndex(), HandlerDef(this, "controllers.Feedbacks", "searchIndex", Nil,"GET", """""", Routes.prefix + """feedback/searchIndex"""))
   }
}
        

// @LINE:137
case controllers_Feedbacks_display101(params) => {
   call { 
        invokeHandler(controllers.Feedbacks.display(), HandlerDef(this, "controllers.Feedbacks", "display", Nil,"GET", """""", Routes.prefix + """feedbackDisplay"""))
   }
}
        

// @LINE:140
case controllers_UserPermissions_index102(params) => {
   call { 
        invokeHandler(controllers.UserPermissions.index(), HandlerDef(this, "controllers.UserPermissions", "index", Nil,"GET", """ User Permission""", Routes.prefix + """permissionIndex"""))
   }
}
        

// @LINE:141
case controllers_UserPermissions_getUserList103(params) => {
   call { 
        invokeHandler(controllers.UserPermissions.getUserList(), HandlerDef(this, "controllers.UserPermissions", "getUserList", Nil,"GET", """""", Routes.prefix + """permissionsearch"""))
   }
}
        

// @LINE:142
case controllers_UserPermissions_update104(params) => {
   call { 
        invokeHandler(controllers.UserPermissions.update(), HandlerDef(this, "controllers.UserPermissions", "update", Nil,"POST", """""", Routes.prefix + """permission/update"""))
   }
}
        

// @LINE:143
case controllers_UserPermissions_save105(params) => {
   call { 
        invokeHandler(controllers.UserPermissions.save(), HandlerDef(this, "controllers.UserPermissions", "save", Nil,"POST", """""", Routes.prefix + """permission/save"""))
   }
}
        

// @LINE:144
case controllers_RolePermissions_index106(params) => {
   call { 
        invokeHandler(controllers.RolePermissions.index(), HandlerDef(this, "controllers.RolePermissions", "index", Nil,"GET", """""", Routes.prefix + """rolepermissionIndex"""))
   }
}
        

// @LINE:145
case controllers_RolePermissions_getRoleList107(params) => {
   call { 
        invokeHandler(controllers.RolePermissions.getRoleList(), HandlerDef(this, "controllers.RolePermissions", "getRoleList", Nil,"GET", """""", Routes.prefix + """rolepermissionsearch"""))
   }
}
        

// @LINE:146
case controllers_RolePermissions_update108(params) => {
   call { 
        invokeHandler(controllers.RolePermissions.update(), HandlerDef(this, "controllers.RolePermissions", "update", Nil,"POST", """""", Routes.prefix + """rolepermission/update"""))
   }
}
        

// @LINE:147
case controllers_RolePermissions_save109(params) => {
   call { 
        invokeHandler(controllers.RolePermissions.save(), HandlerDef(this, "controllers.RolePermissions", "save", Nil,"POST", """""", Routes.prefix + """rolepermission/save"""))
   }
}
        

// @LINE:150
case controllers_Status_userIndex110(params) => {
   call { 
        invokeHandler(controllers.Status.userIndex(), HandlerDef(this, "controllers.Status", "userIndex", Nil,"GET", """ Status""", Routes.prefix + """userStatusIndex"""))
   }
}
        

// @LINE:151
case controllers_Status_userSearch111(params) => {
   call { 
        invokeHandler(controllers.Status.userSearch(), HandlerDef(this, "controllers.Status", "userSearch", Nil,"GET", """""", Routes.prefix + """userStatusSearch"""))
   }
}
        

// @LINE:152
case controllers_Status_approveUserStatus112(params) => {
   call(params.fromQuery[String]("query", None)) { (query) =>
        invokeHandler(controllers.Status.approveUserStatus(query), HandlerDef(this, "controllers.Status", "approveUserStatus", Seq(classOf[String]),"GET", """""", Routes.prefix + """userStatusApprove"""))
   }
}
        

// @LINE:153
case controllers_Status_disapproveUserStatus113(params) => {
   call(params.fromQuery[String]("query", None)) { (query) =>
        invokeHandler(controllers.Status.disapproveUserStatus(query), HandlerDef(this, "controllers.Status", "disapproveUserStatus", Seq(classOf[String]),"GET", """""", Routes.prefix + """userStatusdisapprove"""))
   }
}
        

// @LINE:154
case controllers_Status_excelReportUser114(params) => {
   call { 
        invokeHandler(controllers.Status.excelReportUser(), HandlerDef(this, "controllers.Status", "excelReportUser", Nil,"GET", """""", Routes.prefix + """userStatusExcelReport"""))
   }
}
        

// @LINE:155
case controllers_Status_companyIndex115(params) => {
   call { 
        invokeHandler(controllers.Status.companyIndex(), HandlerDef(this, "controllers.Status", "companyIndex", Nil,"GET", """""", Routes.prefix + """companyStatusIndex"""))
   }
}
        

// @LINE:156
case controllers_Status_companySearch116(params) => {
   call { 
        invokeHandler(controllers.Status.companySearch(), HandlerDef(this, "controllers.Status", "companySearch", Nil,"GET", """""", Routes.prefix + """companyStatusSearch"""))
   }
}
        

// @LINE:157
case controllers_Status_approveCompanyStatus117(params) => {
   call(params.fromQuery[String]("query", None)) { (query) =>
        invokeHandler(controllers.Status.approveCompanyStatus(query), HandlerDef(this, "controllers.Status", "approveCompanyStatus", Seq(classOf[String]),"GET", """""", Routes.prefix + """companyStatusApprove"""))
   }
}
        

// @LINE:158
case controllers_Status_disapproveCompanyStatus118(params) => {
   call(params.fromQuery[String]("query", None)) { (query) =>
        invokeHandler(controllers.Status.disapproveCompanyStatus(query), HandlerDef(this, "controllers.Status", "disapproveCompanyStatus", Seq(classOf[String]),"GET", """""", Routes.prefix + """companyStatusDisapprove"""))
   }
}
        

// @LINE:159
case controllers_Status_excelReportCompany119(params) => {
   call { 
        invokeHandler(controllers.Status.excelReportCompany(), HandlerDef(this, "controllers.Status", "excelReportCompany", Nil,"GET", """""", Routes.prefix + """companyStatusExcelReport"""))
   }
}
        

// @LINE:162
case controllers_Mail_index120(params) => {
   call { 
        invokeHandler(controllers.Mail.index(), HandlerDef(this, "controllers.Mail", "index", Nil,"GET", """Mail""", Routes.prefix + """mailIndex"""))
   }
}
        

// @LINE:163
case controllers_Mail_settingSave121(params) => {
   call { 
        invokeHandler(controllers.Mail.settingSave(), HandlerDef(this, "controllers.Mail", "settingSave", Nil,"POST", """""", Routes.prefix + """mailSave"""))
   }
}
        

// @LINE:166
case controllers_Notifications_index122(params) => {
   call { 
        invokeHandler(controllers.Notifications.index(), HandlerDef(this, "controllers.Notifications", "index", Nil,"GET", """Timesheet Notification""", Routes.prefix + """notificationIndex"""))
   }
}
        

// @LINE:167
case controllers_Notifications_save123(params) => {
   call { 
        invokeHandler(controllers.Notifications.save(), HandlerDef(this, "controllers.Notifications", "save", Nil,"POST", """""", Routes.prefix + """notificationSave"""))
   }
}
        

// @LINE:170
case controllers_Delegate_index124(params) => {
   call { 
        invokeHandler(controllers.Delegate.index(), HandlerDef(this, "controllers.Delegate", "index", Nil,"GET", """ Delegate""", Routes.prefix + """delegateIndex"""))
   }
}
        

// @LINE:171
case controllers_Delegate_save125(params) => {
   call { 
        invokeHandler(controllers.Delegate.save(), HandlerDef(this, "controllers.Delegate", "save", Nil,"GET", """""", Routes.prefix + """delagationSave"""))
   }
}
        

// @LINE:174
case controllers_Roles_index126(params) => {
   call { 
        invokeHandler(controllers.Roles.index(), HandlerDef(this, "controllers.Roles", "index", Nil,"GET", """ Role""", Routes.prefix + """roleIndex"""))
   }
}
        

// @LINE:175
case controllers_Roles_search127(params) => {
   call { 
        invokeHandler(controllers.Roles.search(), HandlerDef(this, "controllers.Roles", "search", Nil,"GET", """""", Routes.prefix + """roleSearch"""))
   }
}
        

// @LINE:176
case controllers_Roles_delete128(params) => {
   call { 
        invokeHandler(controllers.Roles.delete(), HandlerDef(this, "controllers.Roles", "delete", Nil,"GET", """""", Routes.prefix + """roleDelete"""))
   }
}
        

// @LINE:177
case controllers_Roles_create129(params) => {
   call { 
        invokeHandler(controllers.Roles.create(), HandlerDef(this, "controllers.Roles", "create", Nil,"POST", """""", Routes.prefix + """roleCreate"""))
   }
}
        

// @LINE:178
case controllers_Roles_edit130(params) => {
   call { 
        invokeHandler(controllers.Roles.edit(), HandlerDef(this, "controllers.Roles", "edit", Nil,"POST", """""", Routes.prefix + """roleEdit"""))
   }
}
        

// @LINE:179
case controllers_Roles_showEdit131(params) => {
   call { 
        invokeHandler(controllers.Roles.showEdit(), HandlerDef(this, "controllers.Roles", "showEdit", Nil,"GET", """""", Routes.prefix + """roleShowEdit"""))
   }
}
        

// @LINE:180
case controllers_Roles_defineRoles132(params) => {
   call { 
        invokeHandler(controllers.Roles.defineRoles(), HandlerDef(this, "controllers.Roles", "defineRoles", Nil,"GET", """""", Routes.prefix + """defineRoles"""))
   }
}
        

// @LINE:181
case controllers_Roles_showRoles133(params) => {
   call { 
        invokeHandler(controllers.Roles.showRoles(), HandlerDef(this, "controllers.Roles", "showRoles", Nil,"GET", """""", Routes.prefix + """showRoles"""))
   }
}
        

// @LINE:182
case controllers_Roles_saveRole134(params) => {
   call { 
        invokeHandler(controllers.Roles.saveRole(), HandlerDef(this, "controllers.Roles", "saveRole", Nil,"POST", """""", Routes.prefix + """saveRole"""))
   }
}
        

// @LINE:183
case controllers_Roles_saveRole135(params) => {
   call { 
        invokeHandler(controllers.Roles.saveRole(), HandlerDef(this, "controllers.Roles", "saveRole", Nil,"POST", """""", Routes.prefix + """saveOrg"""))
   }
}
        

// @LINE:186
case controllers_Reports_teamRateIndex136(params) => {
   call { 
        invokeHandler(controllers.Reports.teamRateIndex(), HandlerDef(this, "controllers.Reports", "teamRateIndex", Nil,"GET", """ Report""", Routes.prefix + """reportIndex"""))
   }
}
        

// @LINE:187
case controllers_Reports_teamRateSearch137(params) => {
   call { 
        invokeHandler(controllers.Reports.teamRateSearch(), HandlerDef(this, "controllers.Reports", "teamRateSearch", Nil,"GET", """""", Routes.prefix + """reportSearch"""))
   }
}
        

// @LINE:190
case controllers_ProjectReports_projectReportIndex138(params) => {
   call { 
        invokeHandler(controllers.ProjectReports.projectReportIndex(), HandlerDef(this, "controllers.ProjectReports", "projectReportIndex", Nil,"GET", """Project Report""", Routes.prefix + """projReportIndex"""))
   }
}
        

// @LINE:191
case controllers_ProjectReports_projectReportSearch139(params) => {
   call { 
        invokeHandler(controllers.ProjectReports.projectReportSearch(), HandlerDef(this, "controllers.ProjectReports", "projectReportSearch", Nil,"GET", """""", Routes.prefix + """projReportSearch"""))
   }
}
        

// @LINE:192
case controllers_ProjectReports_viewProjectDetails140(params) => {
   call { 
        invokeHandler(controllers.ProjectReports.viewProjectDetails(), HandlerDef(this, "controllers.ProjectReports", "viewProjectDetails", Nil,"GET", """""", Routes.prefix + """projViewDetails"""))
   }
}
        

// @LINE:193
case controllers_ProjectReports_viewGraph141(params) => {
   call { 
        invokeHandler(controllers.ProjectReports.viewGraph(), HandlerDef(this, "controllers.ProjectReports", "viewGraph", Nil,"GET", """""", Routes.prefix + """viewGraph"""))
   }
}
        

// @LINE:194
case controllers_ProjectReports_viewUsageByHrs142(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        invokeHandler(controllers.ProjectReports.viewUsageByHrs(id), HandlerDef(this, "controllers.ProjectReports", "viewUsageByHrs", Seq(classOf[String]),"GET", """""", Routes.prefix + """projViewGraphHrs"""))
   }
}
        

// @LINE:197
case controllers_ProjectSearch_index143(params) => {
   call { 
        invokeHandler(controllers.ProjectSearch.index(), HandlerDef(this, "controllers.ProjectSearch", "index", Nil,"GET", """Project Details""", Routes.prefix + """projDetailsIndex"""))
   }
}
        

// @LINE:198
case controllers_ProjectSearch_search144(params) => {
   call { 
        invokeHandler(controllers.ProjectSearch.search(), HandlerDef(this, "controllers.ProjectSearch", "search", Nil,"GET", """""", Routes.prefix + """projDetailsSearch"""))
   }
}
        

// @LINE:201
case controllers_Assets_at145(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        