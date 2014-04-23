// @SOURCE:/Users/Secret/Technology/play-2.1.0/Time_Trotter/conf/routes
// @HASH:4dd6244e9ca3d3375b7182bcc19769f3618ca939
// @DATE:Mon Apr 21 14:16:17 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:201
// @LINE:198
// @LINE:197
// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
// @LINE:187
// @LINE:186
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:171
// @LINE:170
// @LINE:167
// @LINE:166
// @LINE:163
// @LINE:162
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:201
class ReverseAssets {
    

// @LINE:201
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:171
// @LINE:170
class ReverseDelegate {
    

// @LINE:171
def save(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delagationSave")
}
                                                

// @LINE:170
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delegateIndex")
}
                                                
    
}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseUsers {
    

// @LINE:71
def emailAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "emailAvailability")
}
                                                

// @LINE:62
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userEdit")
}
                                                

// @LINE:72
def idAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "idAvailability")
}
                                                

// @LINE:68
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userShowEdit")
}
                                                

// @LINE:60
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userDelete")
}
                                                

// @LINE:61
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "userCreate")
}
                                                

// @LINE:66
def findManagerUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findManagerUser")
}
                                                

// @LINE:65
def getCompanyUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findcompanyuser")
}
                                                

// @LINE:64
def findHRUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findHRUser")
}
                                                

// @LINE:63
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userIndex")
}
                                                

// @LINE:59
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userSearch")
}
                                                

// @LINE:73
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userExcelReport")
}
                                                

// @LINE:74
def findDelegateTos(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findDelegatedTo")
}
                                                

// @LINE:67
def findProjectManagers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findPM")
}
                                                
    
}
                          

// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseTimesheetBuckets {
    

// @LINE:126
def rejectTimesheetsOk(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/rejectTimesheetsOk" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:122
def displaySelectedTimesheet(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/displayTimesheet" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("query", query)))))
}
                                                

// @LINE:123
def approveTimesheets(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/approveTimesheets")
}
                                                

// @LINE:124
def rejectTimesheets(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/rejectTimesheets")
}
                                                

// @LINE:120
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/bucketIndex")
}
                                                

// @LINE:121
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/bucketSearch")
}
                                                

// @LINE:127
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetBucketExcelReport")
}
                                                

// @LINE:125
def approveTimesheetsOk(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/approveTimesheetsOk" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                
    
}
                          

// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseRolePermissions {
    

// @LINE:146
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "rolepermission/update")
}
                                                

// @LINE:147
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "rolepermission/save")
}
                                                

// @LINE:145
def getRoleList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rolepermissionsearch")
}
                                                

// @LINE:144
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rolepermissionIndex")
}
                                                
    
}
                          

// @LINE:163
// @LINE:162
class ReverseMail {
    

// @LINE:163
def settingSave(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "mailSave")
}
                                                

// @LINE:162
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mailIndex")
}
                                                
    
}
                          

// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
class ReverseFeedbacks {
    

// @LINE:137
def display(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedbackDisplay")
}
                                                

// @LINE:136
def searchIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback/searchIndex")
}
                                                

// @LINE:134
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedbackCreate")
}
                                                

// @LINE:132
def customIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback/create")
}
                                                

// @LINE:135
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "submitFeedback")
}
                                                

// @LINE:131
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback/view")
}
                                                

// @LINE:133
def customSearchIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feedback/customSearchIndex")
}
                                                
    
}
                          

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
class ReverseUserPermissions {
    

// @LINE:142
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "permission/update")
}
                                                

// @LINE:141
def getUserList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "permissionsearch")
}
                                                

// @LINE:143
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "permission/save")
}
                                                

// @LINE:140
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "permissionIndex")
}
                                                
    
}
                          

// @LINE:70
// @LINE:69
class ReverseUserSearch {
    

// @LINE:70
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userGenericDoSearch")
}
                                                

// @LINE:69
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userGenericSearchIndex")
}
                                                
    
}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
class ReverseTasks {
    

// @LINE:92
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "taskEdit")
}
                                                

// @LINE:94
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskShowEdit")
}
                                                

// @LINE:90
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskDelete")
}
                                                

// @LINE:91
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "taskCreate")
}
                                                

// @LINE:88
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskIndex")
}
                                                

// @LINE:89
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskSearch")
}
                                                

// @LINE:93
def findProjectByName(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectByName")
}
                                                

// @LINE:95
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taskExcelReport")
}
                                                
    
}
                          

// @LINE:187
// @LINE:186
class ReverseReports {
    

// @LINE:187
def teamRateSearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reportSearch")
}
                                                

// @LINE:186
def teamRateIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reportIndex")
}
                                                
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def deployment(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deploy")
}
                                                

// @LINE:8
def restrictedPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accessDeny")
}
                                                

// @LINE:54
def companysearch(q:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companysearch" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("q", q)))))
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:19
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registration")
}
                                                

// @LINE:52
def companyregistration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:23
def checkOldPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkOldPassword")
}
                                                

// @LINE:20
def createAccount(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registration")
}
                                                

// @LINE:16
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:24
def changePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "changePassword")
}
                                                

// @LINE:9
def setPassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "set")
}
                                                

// @LINE:55
def checkCompanyCodeAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkCompanyCode")
}
                                                

// @LINE:53
def companycreateAccount(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "complete")
}
                                                

// @LINE:56
def checkCompanyNameAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkCompanyName")
}
                                                

// @LINE:48
def finduser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "finduserid")
}
                                                

// @LINE:22
def checkPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkPassword")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:21
def checkUserEmailAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkUserEmail")
}
                                                

// @LINE:49
def forgotpassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forgot")
}
                                                

// @LINE:27
def checkCompanyEmailAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "checkCompanyEmail")
}
                                                

// @LINE:13
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:198
// @LINE:197
class ReverseProjectSearch {
    

// @LINE:198
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projDetailsSearch")
}
                                                

// @LINE:197
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projDetailsIndex")
}
                                                
    
}
                          

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:82
class ReverseClients {
    

// @LINE:102
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "clientEdit")
}
                                                

// @LINE:103
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientShowEdit")
}
                                                

// @LINE:100
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientDelete")
}
                                                

// @LINE:82
def findClients(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "findClient")
}
                                                

// @LINE:101
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "clientCreate")
}
                                                

// @LINE:98
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientIndex")
}
                                                

// @LINE:99
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientSearch")
}
                                                

// @LINE:104
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientExcelReport")
}
                                                
    
}
                          

// @LINE:167
// @LINE:166
class ReverseNotifications {
    

// @LINE:167
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "notificationSave")
}
                                                

// @LINE:166
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "notificationIndex")
}
                                                
    
}
                          

// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
class ReverseRoles {
    

// @LINE:178
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "roleEdit")
}
                                                

// @LINE:179
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "roleShowEdit")
}
                                                

// @LINE:181
def showRoles(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "showRoles")
}
                                                

// @LINE:176
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "roleDelete")
}
                                                

// @LINE:177
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "roleCreate")
}
                                                

// @LINE:180
def defineRoles(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "defineRoles")
}
                                                

// @LINE:174
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "roleIndex")
}
                                                

// @LINE:175
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "roleSearch")
}
                                                

// @LINE:183
// @LINE:182
def saveRole(): Call = {
   () match {
// @LINE:182
case () if true => Call("POST", _prefix + { _defaultPrefix } + "saveRole")
                                                        
// @LINE:183
case () if true => Call("POST", _prefix + { _defaultPrefix } + "saveOrg")
                                                        
   }
}
                                                
    
}
                          

// @LINE:128
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
class ReverseTimesheets {
    

// @LINE:128
def timeSheetApprovalViaMail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetApprovalViaMail")
}
                                                

// @LINE:115
def editTimesheet(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetEdit/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                

// @LINE:113
def getLastWeekTimesheet(week:Integer, year:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/getLastWeekTimesheet" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("week", week)), Some(implicitly[QueryStringBindable[Integer]].unbind("year", year)))))
}
                                                

// @LINE:110
def cancel(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetCancel")
}
                                                

// @LINE:108
def searchIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetSearchIndex")
}
                                                

// @LINE:109
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetCreate")
}
                                                

// @LINE:117
def retractTimesheet(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "retractTimesheet")
}
                                                

// @LINE:107
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetIndex")
}
                                                

// @LINE:114
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "TimesheetSearch")
}
                                                

// @LINE:116
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetExcelReport")
}
                                                

// @LINE:111
def getTaskCodes(_value:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/getTaskCode" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("_value", _value)))))
}
                                                

// @LINE:112
def getTimesheetTable(id:String, week:String, year:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheet/getTimesheetTable" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("week", week)), Some(implicitly[QueryStringBindable[String]].unbind("year", year)))))
}
                                                
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseLeaves {
    

// @LINE:34
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "leaveEdit")
}
                                                

// @LINE:42
def leaveSearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leave/bucketSearch")
}
                                                

// @LINE:35
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leavesShowEdit")
}
                                                

// @LINE:32
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveDelete")
}
                                                

// @LINE:30
def applyIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveIndex")
}
                                                

// @LINE:43
def approveLeave(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leave/approveLeave")
}
                                                

// @LINE:33
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "leaveCreate")
}
                                                

// @LINE:41
def bucketIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leave/bucketIndex")
}
                                                

// @LINE:38
def excelApplyReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveApplyExcelReport")
}
                                                

// @LINE:45
def retractLeave(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leave/retractLeave")
}
                                                

// @LINE:31
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveSearch")
}
                                                

// @LINE:37
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveExcelReport")
}
                                                

// @LINE:36
def leaveApprovalViaMail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leaveApprovalViaMail")
}
                                                

// @LINE:44
def rejectLeave(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "leave/rejectLeave")
}
                                                
    
}
                          

// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
class ReverseProjectReports {
    

// @LINE:192
def viewProjectDetails(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projViewDetails")
}
                                                

// @LINE:194
def viewUsageByHrs(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projViewGraphHrs" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                                                

// @LINE:193
def viewGraph(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "viewGraph")
}
                                                

// @LINE:190
def projectReportIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projReportIndex")
}
                                                

// @LINE:191
def projectReportSearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projReportSearch")
}
                                                
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseProjects {
    

// @LINE:81
def edit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projectEdit")
}
                                                

// @LINE:83
def showEdit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectShowEdit")
}
                                                

// @LINE:79
def delete(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectDelete")
}
                                                

// @LINE:84
def checkProjectCodeAvailability(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projectCodeAvailability")
}
                                                

// @LINE:80
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "projectCreate")
}
                                                

// @LINE:77
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectIndex")
}
                                                

// @LINE:78
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectSearch")
}
                                                

// @LINE:85
def excelReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "projectExcelReport")
}
                                                
    
}
                          

// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
class ReverseStatus {
    

// @LINE:156
def companySearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companyStatusSearch")
}
                                                

// @LINE:153
def disapproveUserStatus(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userStatusdisapprove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("query", query)))))
}
                                                

// @LINE:155
def companyIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companyStatusIndex")
}
                                                

// @LINE:150
def userIndex(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userStatusIndex")
}
                                                

// @LINE:158
def disapproveCompanyStatus(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companyStatusDisapprove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("query", query)))))
}
                                                

// @LINE:151
def userSearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userStatusSearch")
}
                                                

// @LINE:159
def excelReportCompany(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companyStatusExcelReport")
}
                                                

// @LINE:154
def excelReportUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userStatusExcelReport")
}
                                                

// @LINE:157
def approveCompanyStatus(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companyStatusApprove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("query", query)))))
}
                                                

// @LINE:152
def approveUserStatus(query:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "userStatusApprove" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("query", query)))))
}
                                                
    
}
                          
}
                  


// @LINE:201
// @LINE:198
// @LINE:197
// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
// @LINE:187
// @LINE:186
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:171
// @LINE:170
// @LINE:167
// @LINE:166
// @LINE:163
// @LINE:162
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:201
class ReverseAssets {
    

// @LINE:201
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:171
// @LINE:170
class ReverseDelegate {
    

// @LINE:171
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Delegate.save",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delagationSave"})
      }
   """
)
                        

// @LINE:170
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Delegate.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delegateIndex"})
      }
   """
)
                        
    
}
              

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseUsers {
    

// @LINE:71
def emailAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.emailAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "emailAvailability"})
      }
   """
)
                        

// @LINE:62
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userEdit"})
      }
   """
)
                        

// @LINE:72
def idAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.idAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "idAvailability"})
      }
   """
)
                        

// @LINE:68
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userShowEdit"})
      }
   """
)
                        

// @LINE:60
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userDelete"})
      }
   """
)
                        

// @LINE:61
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userCreate"})
      }
   """
)
                        

// @LINE:66
def findManagerUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findManagerUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findManagerUser"})
      }
   """
)
                        

// @LINE:65
def getCompanyUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.getCompanyUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findcompanyuser"})
      }
   """
)
                        

// @LINE:64
def findHRUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findHRUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findHRUser"})
      }
   """
)
                        

// @LINE:63
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userIndex"})
      }
   """
)
                        

// @LINE:59
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userSearch"})
      }
   """
)
                        

// @LINE:73
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userExcelReport"})
      }
   """
)
                        

// @LINE:74
def findDelegateTos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findDelegateTos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findDelegatedTo"})
      }
   """
)
                        

// @LINE:67
def findProjectManagers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findProjectManagers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findPM"})
      }
   """
)
                        
    
}
              

// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseTimesheetBuckets {
    

// @LINE:126
def rejectTimesheetsOk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.rejectTimesheetsOk",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/rejectTimesheetsOk" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:122
def displaySelectedTimesheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.displaySelectedTimesheet",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/displayTimesheet" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("query", query)])})
      }
   """
)
                        

// @LINE:123
def approveTimesheets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.approveTimesheets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/approveTimesheets"})
      }
   """
)
                        

// @LINE:124
def rejectTimesheets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.rejectTimesheets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/rejectTimesheets"})
      }
   """
)
                        

// @LINE:120
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/bucketIndex"})
      }
   """
)
                        

// @LINE:121
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/bucketSearch"})
      }
   """
)
                        

// @LINE:127
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetBucketExcelReport"})
      }
   """
)
                        

// @LINE:125
def approveTimesheetsOk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TimesheetBuckets.approveTimesheetsOk",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/approveTimesheetsOk" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              

// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseRolePermissions {
    

// @LINE:146
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RolePermissions.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rolepermission/update"})
      }
   """
)
                        

// @LINE:147
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RolePermissions.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rolepermission/save"})
      }
   """
)
                        

// @LINE:145
def getRoleList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RolePermissions.getRoleList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rolepermissionsearch"})
      }
   """
)
                        

// @LINE:144
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RolePermissions.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rolepermissionIndex"})
      }
   """
)
                        
    
}
              

// @LINE:163
// @LINE:162
class ReverseMail {
    

// @LINE:163
def settingSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mail.settingSave",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mailSave"})
      }
   """
)
                        

// @LINE:162
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Mail.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mailIndex"})
      }
   """
)
                        
    
}
              

// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
class ReverseFeedbacks {
    

// @LINE:137
def display : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.display",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackDisplay"})
      }
   """
)
                        

// @LINE:136
def searchIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.searchIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback/searchIndex"})
      }
   """
)
                        

// @LINE:134
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedbackCreate"})
      }
   """
)
                        

// @LINE:132
def customIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.customIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback/create"})
      }
   """
)
                        

// @LINE:135
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitFeedback"})
      }
   """
)
                        

// @LINE:131
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback/view"})
      }
   """
)
                        

// @LINE:133
def customSearchIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Feedbacks.customSearchIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback/customSearchIndex"})
      }
   """
)
                        
    
}
              

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
class ReverseUserPermissions {
    

// @LINE:142
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserPermissions.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "permission/update"})
      }
   """
)
                        

// @LINE:141
def getUserList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserPermissions.getUserList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "permissionsearch"})
      }
   """
)
                        

// @LINE:143
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserPermissions.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "permission/save"})
      }
   """
)
                        

// @LINE:140
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserPermissions.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "permissionIndex"})
      }
   """
)
                        
    
}
              

// @LINE:70
// @LINE:69
class ReverseUserSearch {
    

// @LINE:70
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserSearch.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userGenericDoSearch"})
      }
   """
)
                        

// @LINE:69
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserSearch.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userGenericSearchIndex"})
      }
   """
)
                        
    
}
              

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
class ReverseTasks {
    

// @LINE:92
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "taskEdit"})
      }
   """
)
                        

// @LINE:94
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskShowEdit"})
      }
   """
)
                        

// @LINE:90
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskDelete"})
      }
   """
)
                        

// @LINE:91
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "taskCreate"})
      }
   """
)
                        

// @LINE:88
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskIndex"})
      }
   """
)
                        

// @LINE:89
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskSearch"})
      }
   """
)
                        

// @LINE:93
def findProjectByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.findProjectByName",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectByName"})
      }
   """
)
                        

// @LINE:95
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tasks.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taskExcelReport"})
      }
   """
)
                        
    
}
              

// @LINE:187
// @LINE:186
class ReverseReports {
    

// @LINE:187
def teamRateSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.teamRateSearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reportSearch"})
      }
   """
)
                        

// @LINE:186
def teamRateIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.teamRateIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reportIndex"})
      }
   """
)
                        
    
}
              

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def deployment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deployment",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deploy"})
      }
   """
)
                        

// @LINE:8
def restrictedPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.restrictedPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessDeny"})
      }
   """
)
                        

// @LINE:54
def companysearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.companysearch",
   """
      function(q) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companysearch" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("q", q)])})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:19
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
      }
   """
)
                        

// @LINE:52
def companyregistration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.companyregistration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:23
def checkOldPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkOldPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkOldPassword"})
      }
   """
)
                        

// @LINE:20
def createAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createAccount",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
      }
   """
)
                        

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:24
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.changePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "changePassword"})
      }
   """
)
                        

// @LINE:9
def setPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setPassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "set"})
      }
   """
)
                        

// @LINE:55
def checkCompanyCodeAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkCompanyCodeAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkCompanyCode"})
      }
   """
)
                        

// @LINE:53
def companycreateAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.companycreateAccount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "complete"})
      }
   """
)
                        

// @LINE:56
def checkCompanyNameAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkCompanyNameAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkCompanyName"})
      }
   """
)
                        

// @LINE:48
def finduser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.finduser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduserid"})
      }
   """
)
                        

// @LINE:22
def checkPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkPassword"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:21
def checkUserEmailAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkUserEmailAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkUserEmail"})
      }
   """
)
                        

// @LINE:49
def forgotpassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.forgotpassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgot"})
      }
   """
)
                        

// @LINE:27
def checkCompanyEmailAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkCompanyEmailAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkCompanyEmail"})
      }
   """
)
                        

// @LINE:13
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:198
// @LINE:197
class ReverseProjectSearch {
    

// @LINE:198
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectSearch.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projDetailsSearch"})
      }
   """
)
                        

// @LINE:197
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectSearch.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projDetailsIndex"})
      }
   """
)
                        
    
}
              

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:82
class ReverseClients {
    

// @LINE:102
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientEdit"})
      }
   """
)
                        

// @LINE:103
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientShowEdit"})
      }
   """
)
                        

// @LINE:100
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientDelete"})
      }
   """
)
                        

// @LINE:82
def findClients : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.findClients",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findClient"})
      }
   """
)
                        

// @LINE:101
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientCreate"})
      }
   """
)
                        

// @LINE:98
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientIndex"})
      }
   """
)
                        

// @LINE:99
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientSearch"})
      }
   """
)
                        

// @LINE:104
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Clients.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientExcelReport"})
      }
   """
)
                        
    
}
              

// @LINE:167
// @LINE:166
class ReverseNotifications {
    

// @LINE:167
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Notifications.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notificationSave"})
      }
   """
)
                        

// @LINE:166
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Notifications.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notificationIndex"})
      }
   """
)
                        
    
}
              

// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
class ReverseRoles {
    

// @LINE:178
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "roleEdit"})
      }
   """
)
                        

// @LINE:179
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roleShowEdit"})
      }
   """
)
                        

// @LINE:181
def showRoles : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.showRoles",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showRoles"})
      }
   """
)
                        

// @LINE:176
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roleDelete"})
      }
   """
)
                        

// @LINE:177
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "roleCreate"})
      }
   """
)
                        

// @LINE:180
def defineRoles : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.defineRoles",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "defineRoles"})
      }
   """
)
                        

// @LINE:174
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roleIndex"})
      }
   """
)
                        

// @LINE:175
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roleSearch"})
      }
   """
)
                        

// @LINE:183
// @LINE:182
def saveRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.saveRole",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveRole"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveOrg"})
      }
      }
   """
)
                        
    
}
              

// @LINE:128
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
class ReverseTimesheets {
    

// @LINE:128
def timeSheetApprovalViaMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.timeSheetApprovalViaMail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetApprovalViaMail"})
      }
   """
)
                        

// @LINE:115
def editTimesheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.editTimesheet",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetEdit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:113
def getLastWeekTimesheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getLastWeekTimesheet",
   """
      function(week,year) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/getLastWeekTimesheet" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("week", week), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("year", year)])})
      }
   """
)
                        

// @LINE:110
def cancel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.cancel",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetCancel"})
      }
   """
)
                        

// @LINE:108
def searchIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.searchIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetSearchIndex"})
      }
   """
)
                        

// @LINE:109
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetCreate"})
      }
   """
)
                        

// @LINE:117
def retractTimesheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.retractTimesheet",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retractTimesheet"})
      }
   """
)
                        

// @LINE:107
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetIndex"})
      }
   """
)
                        

// @LINE:114
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "TimesheetSearch"})
      }
   """
)
                        

// @LINE:116
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetExcelReport"})
      }
   """
)
                        

// @LINE:111
def getTaskCodes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getTaskCodes",
   """
      function(_value) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/getTaskCode" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("_value", _value)])})
      }
   """
)
                        

// @LINE:112
def getTimesheetTable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getTimesheetTable",
   """
      function(id,week,year) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheet/getTimesheetTable" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("week", week), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("year", year)])})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseLeaves {
    

// @LINE:34
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveEdit"})
      }
   """
)
                        

// @LINE:42
def leaveSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.leaveSearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leave/bucketSearch"})
      }
   """
)
                        

// @LINE:35
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leavesShowEdit"})
      }
   """
)
                        

// @LINE:32
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveDelete"})
      }
   """
)
                        

// @LINE:30
def applyIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.applyIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveIndex"})
      }
   """
)
                        

// @LINE:43
def approveLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.approveLeave",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leave/approveLeave"})
      }
   """
)
                        

// @LINE:33
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveCreate"})
      }
   """
)
                        

// @LINE:41
def bucketIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.bucketIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leave/bucketIndex"})
      }
   """
)
                        

// @LINE:38
def excelApplyReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.excelApplyReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveApplyExcelReport"})
      }
   """
)
                        

// @LINE:45
def retractLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.retractLeave",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leave/retractLeave"})
      }
   """
)
                        

// @LINE:31
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveSearch"})
      }
   """
)
                        

// @LINE:37
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveExcelReport"})
      }
   """
)
                        

// @LINE:36
def leaveApprovalViaMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.leaveApprovalViaMail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leaveApprovalViaMail"})
      }
   """
)
                        

// @LINE:44
def rejectLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Leaves.rejectLeave",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "leave/rejectLeave"})
      }
   """
)
                        
    
}
              

// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
class ReverseProjectReports {
    

// @LINE:192
def viewProjectDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectReports.viewProjectDetails",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projViewDetails"})
      }
   """
)
                        

// @LINE:194
def viewUsageByHrs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectReports.viewUsageByHrs",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projViewGraphHrs" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:193
def viewGraph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectReports.viewGraph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewGraph"})
      }
   """
)
                        

// @LINE:190
def projectReportIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectReports.projectReportIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projReportIndex"})
      }
   """
)
                        

// @LINE:191
def projectReportSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectReports.projectReportSearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projReportSearch"})
      }
   """
)
                        
    
}
              

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseProjects {
    

// @LINE:81
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.edit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projectEdit"})
      }
   """
)
                        

// @LINE:83
def showEdit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.showEdit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectShowEdit"})
      }
   """
)
                        

// @LINE:79
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.delete",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectDelete"})
      }
   """
)
                        

// @LINE:84
def checkProjectCodeAvailability : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.checkProjectCodeAvailability",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projectCodeAvailability"})
      }
   """
)
                        

// @LINE:80
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "projectCreate"})
      }
   """
)
                        

// @LINE:77
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectIndex"})
      }
   """
)
                        

// @LINE:78
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectSearch"})
      }
   """
)
                        

// @LINE:85
def excelReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Projects.excelReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projectExcelReport"})
      }
   """
)
                        
    
}
              

// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
class ReverseStatus {
    

// @LINE:156
def companySearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.companySearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companyStatusSearch"})
      }
   """
)
                        

// @LINE:153
def disapproveUserStatus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.disapproveUserStatus",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userStatusdisapprove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("query", query)])})
      }
   """
)
                        

// @LINE:155
def companyIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.companyIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companyStatusIndex"})
      }
   """
)
                        

// @LINE:150
def userIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.userIndex",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userStatusIndex"})
      }
   """
)
                        

// @LINE:158
def disapproveCompanyStatus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.disapproveCompanyStatus",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companyStatusDisapprove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("query", query)])})
      }
   """
)
                        

// @LINE:151
def userSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.userSearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userStatusSearch"})
      }
   """
)
                        

// @LINE:159
def excelReportCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.excelReportCompany",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companyStatusExcelReport"})
      }
   """
)
                        

// @LINE:154
def excelReportUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.excelReportUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userStatusExcelReport"})
      }
   """
)
                        

// @LINE:157
def approveCompanyStatus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.approveCompanyStatus",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companyStatusApprove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("query", query)])})
      }
   """
)
                        

// @LINE:152
def approveUserStatus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Status.approveUserStatus",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userStatusApprove" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("query", query)])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:201
// @LINE:198
// @LINE:197
// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
// @LINE:187
// @LINE:186
// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
// @LINE:171
// @LINE:170
// @LINE:167
// @LINE:166
// @LINE:163
// @LINE:162
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:201
class ReverseAssets {
    

// @LINE:201
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:171
// @LINE:170
class ReverseDelegate {
    

// @LINE:171
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Delegate.save(), HandlerDef(this, "controllers.Delegate", "save", Seq(), "GET", """""", _prefix + """delagationSave""")
)
                      

// @LINE:170
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Delegate.index(), HandlerDef(this, "controllers.Delegate", "index", Seq(), "GET", """ Delegate""", _prefix + """delegateIndex""")
)
                      
    
}
                          

// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseUsers {
    

// @LINE:71
def emailAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.emailAvailability(), HandlerDef(this, "controllers.Users", "emailAvailability", Seq(), "POST", """""", _prefix + """emailAvailability""")
)
                      

// @LINE:62
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(), HandlerDef(this, "controllers.Users", "edit", Seq(), "POST", """""", _prefix + """userEdit""")
)
                      

// @LINE:72
def idAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.idAvailability(), HandlerDef(this, "controllers.Users", "idAvailability", Seq(), "POST", """""", _prefix + """idAvailability""")
)
                      

// @LINE:68
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.showEdit(), HandlerDef(this, "controllers.Users", "showEdit", Seq(), "GET", """""", _prefix + """userShowEdit""")
)
                      

// @LINE:60
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(), HandlerDef(this, "controllers.Users", "delete", Seq(), "GET", """""", _prefix + """userDelete""")
)
                      

// @LINE:61
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "POST", """""", _prefix + """userCreate""")
)
                      

// @LINE:66
def findManagerUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.findManagerUser(), HandlerDef(this, "controllers.Users", "findManagerUser", Seq(), "GET", """""", _prefix + """findManagerUser""")
)
                      

// @LINE:65
def getCompanyUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.getCompanyUser(), HandlerDef(this, "controllers.Users", "getCompanyUser", Seq(), "GET", """""", _prefix + """findcompanyuser""")
)
                      

// @LINE:64
def findHRUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.findHRUser(), HandlerDef(this, "controllers.Users", "findHRUser", Seq(), "GET", """""", _prefix + """findHRUser""")
)
                      

// @LINE:63
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Seq(), "GET", """""", _prefix + """userIndex""")
)
                      

// @LINE:59
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.search(), HandlerDef(this, "controllers.Users", "search", Seq(), "GET", """User""", _prefix + """userSearch""")
)
                      

// @LINE:73
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.excelReport(), HandlerDef(this, "controllers.Users", "excelReport", Seq(), "GET", """""", _prefix + """userExcelReport""")
)
                      

// @LINE:74
def findDelegateTos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.findDelegateTos(), HandlerDef(this, "controllers.Users", "findDelegateTos", Seq(), "GET", """""", _prefix + """findDelegatedTo""")
)
                      

// @LINE:67
def findProjectManagers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.findProjectManagers(), HandlerDef(this, "controllers.Users", "findProjectManagers", Seq(), "GET", """""", _prefix + """findPM""")
)
                      
    
}
                          

// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:123
// @LINE:122
// @LINE:121
// @LINE:120
class ReverseTimesheetBuckets {
    

// @LINE:126
def rejectTimesheetsOk(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.rejectTimesheetsOk(id), HandlerDef(this, "controllers.TimesheetBuckets", "rejectTimesheetsOk", Seq(classOf[String]), "GET", """""", _prefix + """timesheet/rejectTimesheetsOk""")
)
                      

// @LINE:122
def displaySelectedTimesheet(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.displaySelectedTimesheet(query), HandlerDef(this, "controllers.TimesheetBuckets", "displaySelectedTimesheet", Seq(classOf[String]), "GET", """""", _prefix + """timesheet/displayTimesheet""")
)
                      

// @LINE:123
def approveTimesheets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.approveTimesheets(), HandlerDef(this, "controllers.TimesheetBuckets", "approveTimesheets", Seq(), "GET", """""", _prefix + """timesheet/approveTimesheets""")
)
                      

// @LINE:124
def rejectTimesheets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.rejectTimesheets(), HandlerDef(this, "controllers.TimesheetBuckets", "rejectTimesheets", Seq(), "GET", """""", _prefix + """timesheet/rejectTimesheets""")
)
                      

// @LINE:120
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.index(), HandlerDef(this, "controllers.TimesheetBuckets", "index", Seq(), "GET", """ TimesheetBucket""", _prefix + """timesheet/bucketIndex""")
)
                      

// @LINE:121
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.search(), HandlerDef(this, "controllers.TimesheetBuckets", "search", Seq(), "GET", """""", _prefix + """timesheet/bucketSearch""")
)
                      

// @LINE:127
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.excelReport(), HandlerDef(this, "controllers.TimesheetBuckets", "excelReport", Seq(), "GET", """""", _prefix + """timesheetBucketExcelReport""")
)
                      

// @LINE:125
def approveTimesheetsOk(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TimesheetBuckets.approveTimesheetsOk(id), HandlerDef(this, "controllers.TimesheetBuckets", "approveTimesheetsOk", Seq(classOf[String]), "GET", """""", _prefix + """timesheet/approveTimesheetsOk""")
)
                      
    
}
                          

// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseRolePermissions {
    

// @LINE:146
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RolePermissions.update(), HandlerDef(this, "controllers.RolePermissions", "update", Seq(), "POST", """""", _prefix + """rolepermission/update""")
)
                      

// @LINE:147
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RolePermissions.save(), HandlerDef(this, "controllers.RolePermissions", "save", Seq(), "POST", """""", _prefix + """rolepermission/save""")
)
                      

// @LINE:145
def getRoleList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RolePermissions.getRoleList(), HandlerDef(this, "controllers.RolePermissions", "getRoleList", Seq(), "GET", """""", _prefix + """rolepermissionsearch""")
)
                      

// @LINE:144
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RolePermissions.index(), HandlerDef(this, "controllers.RolePermissions", "index", Seq(), "GET", """""", _prefix + """rolepermissionIndex""")
)
                      
    
}
                          

// @LINE:163
// @LINE:162
class ReverseMail {
    

// @LINE:163
def settingSave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mail.settingSave(), HandlerDef(this, "controllers.Mail", "settingSave", Seq(), "POST", """""", _prefix + """mailSave""")
)
                      

// @LINE:162
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Mail.index(), HandlerDef(this, "controllers.Mail", "index", Seq(), "GET", """Mail""", _prefix + """mailIndex""")
)
                      
    
}
                          

// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
class ReverseFeedbacks {
    

// @LINE:137
def display(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.display(), HandlerDef(this, "controllers.Feedbacks", "display", Seq(), "GET", """""", _prefix + """feedbackDisplay""")
)
                      

// @LINE:136
def searchIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.searchIndex(), HandlerDef(this, "controllers.Feedbacks", "searchIndex", Seq(), "GET", """""", _prefix + """feedback/searchIndex""")
)
                      

// @LINE:134
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.create(), HandlerDef(this, "controllers.Feedbacks", "create", Seq(), "GET", """""", _prefix + """feedbackCreate""")
)
                      

// @LINE:132
def customIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.customIndex(), HandlerDef(this, "controllers.Feedbacks", "customIndex", Seq(), "GET", """""", _prefix + """feedback/create""")
)
                      

// @LINE:135
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.submit(), HandlerDef(this, "controllers.Feedbacks", "submit", Seq(), "POST", """""", _prefix + """submitFeedback""")
)
                      

// @LINE:131
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.index(), HandlerDef(this, "controllers.Feedbacks", "index", Seq(), "GET", """ Feedback""", _prefix + """feedback/view""")
)
                      

// @LINE:133
def customSearchIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Feedbacks.customSearchIndex(), HandlerDef(this, "controllers.Feedbacks", "customSearchIndex", Seq(), "GET", """""", _prefix + """feedback/customSearchIndex""")
)
                      
    
}
                          

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
class ReverseUserPermissions {
    

// @LINE:142
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserPermissions.update(), HandlerDef(this, "controllers.UserPermissions", "update", Seq(), "POST", """""", _prefix + """permission/update""")
)
                      

// @LINE:141
def getUserList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserPermissions.getUserList(), HandlerDef(this, "controllers.UserPermissions", "getUserList", Seq(), "GET", """""", _prefix + """permissionsearch""")
)
                      

// @LINE:143
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserPermissions.save(), HandlerDef(this, "controllers.UserPermissions", "save", Seq(), "POST", """""", _prefix + """permission/save""")
)
                      

// @LINE:140
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserPermissions.index(), HandlerDef(this, "controllers.UserPermissions", "index", Seq(), "GET", """ User Permission""", _prefix + """permissionIndex""")
)
                      
    
}
                          

// @LINE:70
// @LINE:69
class ReverseUserSearch {
    

// @LINE:70
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserSearch.search(), HandlerDef(this, "controllers.UserSearch", "search", Seq(), "GET", """""", _prefix + """userGenericDoSearch""")
)
                      

// @LINE:69
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserSearch.index(), HandlerDef(this, "controllers.UserSearch", "index", Seq(), "GET", """""", _prefix + """userGenericSearchIndex""")
)
                      
    
}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:88
class ReverseTasks {
    

// @LINE:92
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.edit(), HandlerDef(this, "controllers.Tasks", "edit", Seq(), "POST", """""", _prefix + """taskEdit""")
)
                      

// @LINE:94
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.showEdit(), HandlerDef(this, "controllers.Tasks", "showEdit", Seq(), "GET", """""", _prefix + """taskShowEdit""")
)
                      

// @LINE:90
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.delete(), HandlerDef(this, "controllers.Tasks", "delete", Seq(), "GET", """""", _prefix + """taskDelete""")
)
                      

// @LINE:91
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.create(), HandlerDef(this, "controllers.Tasks", "create", Seq(), "POST", """""", _prefix + """taskCreate""")
)
                      

// @LINE:88
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.index(), HandlerDef(this, "controllers.Tasks", "index", Seq(), "GET", """ Task """, _prefix + """taskIndex""")
)
                      

// @LINE:89
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.search(), HandlerDef(this, "controllers.Tasks", "search", Seq(), "GET", """""", _prefix + """taskSearch""")
)
                      

// @LINE:93
def findProjectByName(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.findProjectByName(), HandlerDef(this, "controllers.Tasks", "findProjectByName", Seq(), "GET", """""", _prefix + """projectByName""")
)
                      

// @LINE:95
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tasks.excelReport(), HandlerDef(this, "controllers.Tasks", "excelReport", Seq(), "GET", """""", _prefix + """taskExcelReport""")
)
                      
    
}
                          

// @LINE:187
// @LINE:186
class ReverseReports {
    

// @LINE:187
def teamRateSearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.teamRateSearch(), HandlerDef(this, "controllers.Reports", "teamRateSearch", Seq(), "GET", """""", _prefix + """reportSearch""")
)
                      

// @LINE:186
def teamRateIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.teamRateIndex(), HandlerDef(this, "controllers.Reports", "teamRateIndex", Seq(), "GET", """ Report""", _prefix + """reportIndex""")
)
                      
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def deployment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deployment(), HandlerDef(this, "controllers.Application", "deployment", Seq(), "GET", """""", _prefix + """deploy""")
)
                      

// @LINE:8
def restrictedPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.restrictedPage(), HandlerDef(this, "controllers.Application", "restrictedPage", Seq(), "GET", """""", _prefix + """accessDeny""")
)
                      

// @LINE:54
def companysearch(q:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.companysearch(q), HandlerDef(this, "controllers.Application", "companysearch", Seq(classOf[String]), "GET", """""", _prefix + """companysearch""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """Login Module""", _prefix + """login""")
)
                      

// @LINE:19
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registration(), HandlerDef(this, "controllers.Application", "registration", Seq(), "GET", """User Registration""", _prefix + """registration""")
)
                      

// @LINE:52
def companyregistration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.companyregistration(), HandlerDef(this, "controllers.Application", "companyregistration", Seq(), "GET", """Company Registration""", _prefix + """register""")
)
                      

// @LINE:23
def checkOldPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkOldPassword(), HandlerDef(this, "controllers.Application", "checkOldPassword", Seq(), "POST", """""", _prefix + """checkOldPassword""")
)
                      

// @LINE:20
def createAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createAccount(), HandlerDef(this, "controllers.Application", "createAccount", Seq(), "POST", """""", _prefix + """registration""")
)
                      

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """Logout""", _prefix + """logout""")
)
                      

// @LINE:24
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.changePassword(), HandlerDef(this, "controllers.Application", "changePassword", Seq(), "POST", """""", _prefix + """changePassword""")
)
                      

// @LINE:9
def setPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setPassword(), HandlerDef(this, "controllers.Application", "setPassword", Seq(), "GET", """""", _prefix + """set""")
)
                      

// @LINE:55
def checkCompanyCodeAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkCompanyCodeAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyCodeAvailability", Seq(), "POST", """""", _prefix + """checkCompanyCode""")
)
                      

// @LINE:53
def companycreateAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.companycreateAccount(), HandlerDef(this, "controllers.Application", "companycreateAccount", Seq(), "GET", """""", _prefix + """complete""")
)
                      

// @LINE:56
def checkCompanyNameAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkCompanyNameAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyNameAvailability", Seq(), "POST", """""", _prefix + """checkCompanyName""")
)
                      

// @LINE:48
def finduser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.finduser(), HandlerDef(this, "controllers.Application", "finduser", Seq(), "GET", """Forgot Password""", _prefix + """finduserid""")
)
                      

// @LINE:22
def checkPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkPassword(), HandlerDef(this, "controllers.Application", "checkPassword", Seq(), "POST", """""", _prefix + """checkPassword""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:21
def checkUserEmailAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkUserEmailAvailability(), HandlerDef(this, "controllers.Application", "checkUserEmailAvailability", Seq(), "POST", """""", _prefix + """checkUserEmail""")
)
                      

// @LINE:49
def forgotpassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.forgotpassword(), HandlerDef(this, "controllers.Application", "forgotpassword", Seq(), "GET", """""", _prefix + """forgot""")
)
                      

// @LINE:27
def checkCompanyEmailAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkCompanyEmailAvailability(), HandlerDef(this, "controllers.Application", "checkCompanyEmailAvailability", Seq(), "POST", """Company Registration""", _prefix + """checkCompanyEmail""")
)
                      

// @LINE:13
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:198
// @LINE:197
class ReverseProjectSearch {
    

// @LINE:198
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectSearch.search(), HandlerDef(this, "controllers.ProjectSearch", "search", Seq(), "GET", """""", _prefix + """projDetailsSearch""")
)
                      

// @LINE:197
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectSearch.index(), HandlerDef(this, "controllers.ProjectSearch", "index", Seq(), "GET", """Project Details""", _prefix + """projDetailsIndex""")
)
                      
    
}
                          

// @LINE:104
// @LINE:103
// @LINE:102
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:82
class ReverseClients {
    

// @LINE:102
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.edit(), HandlerDef(this, "controllers.Clients", "edit", Seq(), "POST", """""", _prefix + """clientEdit""")
)
                      

// @LINE:103
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.showEdit(), HandlerDef(this, "controllers.Clients", "showEdit", Seq(), "GET", """""", _prefix + """clientShowEdit""")
)
                      

// @LINE:100
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.delete(), HandlerDef(this, "controllers.Clients", "delete", Seq(), "GET", """""", _prefix + """clientDelete""")
)
                      

// @LINE:82
def findClients(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.findClients(), HandlerDef(this, "controllers.Clients", "findClients", Seq(), "GET", """""", _prefix + """findClient""")
)
                      

// @LINE:101
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.create(), HandlerDef(this, "controllers.Clients", "create", Seq(), "POST", """""", _prefix + """clientCreate""")
)
                      

// @LINE:98
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.index(), HandlerDef(this, "controllers.Clients", "index", Seq(), "GET", """ Client """, _prefix + """clientIndex""")
)
                      

// @LINE:99
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.search(), HandlerDef(this, "controllers.Clients", "search", Seq(), "GET", """""", _prefix + """clientSearch""")
)
                      

// @LINE:104
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Clients.excelReport(), HandlerDef(this, "controllers.Clients", "excelReport", Seq(), "GET", """""", _prefix + """clientExcelReport""")
)
                      
    
}
                          

// @LINE:167
// @LINE:166
class ReverseNotifications {
    

// @LINE:167
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Notifications.save(), HandlerDef(this, "controllers.Notifications", "save", Seq(), "POST", """""", _prefix + """notificationSave""")
)
                      

// @LINE:166
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Notifications.index(), HandlerDef(this, "controllers.Notifications", "index", Seq(), "GET", """Timesheet Notification""", _prefix + """notificationIndex""")
)
                      
    
}
                          

// @LINE:183
// @LINE:182
// @LINE:181
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:175
// @LINE:174
class ReverseRoles {
    

// @LINE:178
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.edit(), HandlerDef(this, "controllers.Roles", "edit", Seq(), "POST", """""", _prefix + """roleEdit""")
)
                      

// @LINE:179
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.showEdit(), HandlerDef(this, "controllers.Roles", "showEdit", Seq(), "GET", """""", _prefix + """roleShowEdit""")
)
                      

// @LINE:181
def showRoles(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.showRoles(), HandlerDef(this, "controllers.Roles", "showRoles", Seq(), "GET", """""", _prefix + """showRoles""")
)
                      

// @LINE:176
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.delete(), HandlerDef(this, "controllers.Roles", "delete", Seq(), "GET", """""", _prefix + """roleDelete""")
)
                      

// @LINE:177
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.create(), HandlerDef(this, "controllers.Roles", "create", Seq(), "POST", """""", _prefix + """roleCreate""")
)
                      

// @LINE:180
def defineRoles(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.defineRoles(), HandlerDef(this, "controllers.Roles", "defineRoles", Seq(), "GET", """""", _prefix + """defineRoles""")
)
                      

// @LINE:174
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.index(), HandlerDef(this, "controllers.Roles", "index", Seq(), "GET", """ Role""", _prefix + """roleIndex""")
)
                      

// @LINE:175
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.search(), HandlerDef(this, "controllers.Roles", "search", Seq(), "GET", """""", _prefix + """roleSearch""")
)
                      

// @LINE:182
def saveRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.saveRole(), HandlerDef(this, "controllers.Roles", "saveRole", Seq(), "POST", """""", _prefix + """saveRole""")
)
                      
    
}
                          

// @LINE:128
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
class ReverseTimesheets {
    

// @LINE:128
def timeSheetApprovalViaMail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.timeSheetApprovalViaMail(), HandlerDef(this, "controllers.Timesheets", "timeSheetApprovalViaMail", Seq(), "GET", """""", _prefix + """timesheetApprovalViaMail""")
)
                      

// @LINE:115
def editTimesheet(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.editTimesheet(id), HandlerDef(this, "controllers.Timesheets", "editTimesheet", Seq(classOf[String]), "GET", """""", _prefix + """timesheetEdit/$id<[^/]+>""")
)
                      

// @LINE:113
def getLastWeekTimesheet(week:Integer, year:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getLastWeekTimesheet(week, year), HandlerDef(this, "controllers.Timesheets", "getLastWeekTimesheet", Seq(classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """timesheet/getLastWeekTimesheet""")
)
                      

// @LINE:110
def cancel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.cancel(), HandlerDef(this, "controllers.Timesheets", "cancel", Seq(), "POST", """""", _prefix + """timesheetCancel""")
)
                      

// @LINE:108
def searchIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.searchIndex(), HandlerDef(this, "controllers.Timesheets", "searchIndex", Seq(), "GET", """""", _prefix + """timesheetSearchIndex""")
)
                      

// @LINE:109
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.create(), HandlerDef(this, "controllers.Timesheets", "create", Seq(), "POST", """""", _prefix + """timesheetCreate""")
)
                      

// @LINE:117
def retractTimesheet(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.retractTimesheet(), HandlerDef(this, "controllers.Timesheets", "retractTimesheet", Seq(), "GET", """""", _prefix + """retractTimesheet""")
)
                      

// @LINE:107
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.index(), HandlerDef(this, "controllers.Timesheets", "index", Seq(), "GET", """ Timesheet""", _prefix + """timesheetIndex""")
)
                      

// @LINE:114
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.search(), HandlerDef(this, "controllers.Timesheets", "search", Seq(), "GET", """""", _prefix + """TimesheetSearch""")
)
                      

// @LINE:116
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.excelReport(), HandlerDef(this, "controllers.Timesheets", "excelReport", Seq(), "GET", """""", _prefix + """timesheetExcelReport""")
)
                      

// @LINE:111
def getTaskCodes(_value:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getTaskCodes(_value), HandlerDef(this, "controllers.Timesheets", "getTaskCodes", Seq(classOf[String]), "GET", """""", _prefix + """timesheet/getTaskCode""")
)
                      

// @LINE:112
def getTimesheetTable(id:String, week:String, year:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getTimesheetTable(id, week, year), HandlerDef(this, "controllers.Timesheets", "getTimesheetTable", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """timesheet/getTimesheetTable""")
)
                      
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseLeaves {
    

// @LINE:34
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.edit(), HandlerDef(this, "controllers.Leaves", "edit", Seq(), "POST", """""", _prefix + """leaveEdit""")
)
                      

// @LINE:42
def leaveSearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.leaveSearch(), HandlerDef(this, "controllers.Leaves", "leaveSearch", Seq(), "GET", """""", _prefix + """leave/bucketSearch""")
)
                      

// @LINE:35
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.showEdit(), HandlerDef(this, "controllers.Leaves", "showEdit", Seq(), "GET", """""", _prefix + """leavesShowEdit""")
)
                      

// @LINE:32
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.delete(), HandlerDef(this, "controllers.Leaves", "delete", Seq(), "GET", """""", _prefix + """leaveDelete""")
)
                      

// @LINE:30
def applyIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.applyIndex(), HandlerDef(this, "controllers.Leaves", "applyIndex", Seq(), "GET", """ Leave Section""", _prefix + """leaveIndex""")
)
                      

// @LINE:43
def approveLeave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.approveLeave(), HandlerDef(this, "controllers.Leaves", "approveLeave", Seq(), "GET", """""", _prefix + """leave/approveLeave""")
)
                      

// @LINE:33
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.create(), HandlerDef(this, "controllers.Leaves", "create", Seq(), "POST", """""", _prefix + """leaveCreate""")
)
                      

// @LINE:41
def bucketIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.bucketIndex(), HandlerDef(this, "controllers.Leaves", "bucketIndex", Seq(), "GET", """ LeaveBucket""", _prefix + """leave/bucketIndex""")
)
                      

// @LINE:38
def excelApplyReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.excelApplyReport(), HandlerDef(this, "controllers.Leaves", "excelApplyReport", Seq(), "GET", """""", _prefix + """leaveApplyExcelReport""")
)
                      

// @LINE:45
def retractLeave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.retractLeave(), HandlerDef(this, "controllers.Leaves", "retractLeave", Seq(), "GET", """""", _prefix + """leave/retractLeave""")
)
                      

// @LINE:31
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.search(), HandlerDef(this, "controllers.Leaves", "search", Seq(), "GET", """""", _prefix + """leaveSearch""")
)
                      

// @LINE:37
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.excelReport(), HandlerDef(this, "controllers.Leaves", "excelReport", Seq(), "GET", """""", _prefix + """leaveExcelReport""")
)
                      

// @LINE:36
def leaveApprovalViaMail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.leaveApprovalViaMail(), HandlerDef(this, "controllers.Leaves", "leaveApprovalViaMail", Seq(), "GET", """""", _prefix + """leaveApprovalViaMail""")
)
                      

// @LINE:44
def rejectLeave(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Leaves.rejectLeave(), HandlerDef(this, "controllers.Leaves", "rejectLeave", Seq(), "GET", """""", _prefix + """leave/rejectLeave""")
)
                      
    
}
                          

// @LINE:194
// @LINE:193
// @LINE:192
// @LINE:191
// @LINE:190
class ReverseProjectReports {
    

// @LINE:192
def viewProjectDetails(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectReports.viewProjectDetails(), HandlerDef(this, "controllers.ProjectReports", "viewProjectDetails", Seq(), "GET", """""", _prefix + """projViewDetails""")
)
                      

// @LINE:194
def viewUsageByHrs(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectReports.viewUsageByHrs(id), HandlerDef(this, "controllers.ProjectReports", "viewUsageByHrs", Seq(classOf[String]), "GET", """""", _prefix + """projViewGraphHrs""")
)
                      

// @LINE:193
def viewGraph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectReports.viewGraph(), HandlerDef(this, "controllers.ProjectReports", "viewGraph", Seq(), "GET", """""", _prefix + """viewGraph""")
)
                      

// @LINE:190
def projectReportIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectReports.projectReportIndex(), HandlerDef(this, "controllers.ProjectReports", "projectReportIndex", Seq(), "GET", """Project Report""", _prefix + """projReportIndex""")
)
                      

// @LINE:191
def projectReportSearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectReports.projectReportSearch(), HandlerDef(this, "controllers.ProjectReports", "projectReportSearch", Seq(), "GET", """""", _prefix + """projReportSearch""")
)
                      
    
}
                          

// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
class ReverseProjects {
    

// @LINE:81
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.edit(), HandlerDef(this, "controllers.Projects", "edit", Seq(), "POST", """""", _prefix + """projectEdit""")
)
                      

// @LINE:83
def showEdit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.showEdit(), HandlerDef(this, "controllers.Projects", "showEdit", Seq(), "GET", """""", _prefix + """projectShowEdit""")
)
                      

// @LINE:79
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.delete(), HandlerDef(this, "controllers.Projects", "delete", Seq(), "GET", """""", _prefix + """projectDelete""")
)
                      

// @LINE:84
def checkProjectCodeAvailability(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.checkProjectCodeAvailability(), HandlerDef(this, "controllers.Projects", "checkProjectCodeAvailability", Seq(), "POST", """""", _prefix + """projectCodeAvailability""")
)
                      

// @LINE:80
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.create(), HandlerDef(this, "controllers.Projects", "create", Seq(), "POST", """""", _prefix + """projectCreate""")
)
                      

// @LINE:77
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Seq(), "GET", """ Project """, _prefix + """projectIndex""")
)
                      

// @LINE:78
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.search(), HandlerDef(this, "controllers.Projects", "search", Seq(), "GET", """""", _prefix + """projectSearch""")
)
                      

// @LINE:85
def excelReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Projects.excelReport(), HandlerDef(this, "controllers.Projects", "excelReport", Seq(), "GET", """""", _prefix + """projectExcelReport""")
)
                      
    
}
                          

// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:150
class ReverseStatus {
    

// @LINE:156
def companySearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.companySearch(), HandlerDef(this, "controllers.Status", "companySearch", Seq(), "GET", """""", _prefix + """companyStatusSearch""")
)
                      

// @LINE:153
def disapproveUserStatus(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.disapproveUserStatus(query), HandlerDef(this, "controllers.Status", "disapproveUserStatus", Seq(classOf[String]), "GET", """""", _prefix + """userStatusdisapprove""")
)
                      

// @LINE:155
def companyIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.companyIndex(), HandlerDef(this, "controllers.Status", "companyIndex", Seq(), "GET", """""", _prefix + """companyStatusIndex""")
)
                      

// @LINE:150
def userIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.userIndex(), HandlerDef(this, "controllers.Status", "userIndex", Seq(), "GET", """ Status""", _prefix + """userStatusIndex""")
)
                      

// @LINE:158
def disapproveCompanyStatus(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.disapproveCompanyStatus(query), HandlerDef(this, "controllers.Status", "disapproveCompanyStatus", Seq(classOf[String]), "GET", """""", _prefix + """companyStatusDisapprove""")
)
                      

// @LINE:151
def userSearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.userSearch(), HandlerDef(this, "controllers.Status", "userSearch", Seq(), "GET", """""", _prefix + """userStatusSearch""")
)
                      

// @LINE:159
def excelReportCompany(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.excelReportCompany(), HandlerDef(this, "controllers.Status", "excelReportCompany", Seq(), "GET", """""", _prefix + """companyStatusExcelReport""")
)
                      

// @LINE:154
def excelReportUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.excelReportUser(), HandlerDef(this, "controllers.Status", "excelReportUser", Seq(), "GET", """""", _prefix + """userStatusExcelReport""")
)
                      

// @LINE:157
def approveCompanyStatus(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.approveCompanyStatus(query), HandlerDef(this, "controllers.Status", "approveCompanyStatus", Seq(classOf[String]), "GET", """""", _prefix + """companyStatusApprove""")
)
                      

// @LINE:152
def approveUserStatus(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Status.approveUserStatus(query), HandlerDef(this, "controllers.Status", "approveUserStatus", Seq(classOf[String]), "GET", """""", _prefix + """userStatusApprove""")
)
                      
    
}
                          
}
                  
      