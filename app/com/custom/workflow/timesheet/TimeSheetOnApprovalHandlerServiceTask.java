package com.custom.workflow.timesheet;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import models.role.RoleLevel;
import models.role.RoleX;
import models.timesheet.Timesheet;
import models.user.User;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Expr;
import com.custom.domain.TimesheetStatus;
import com.mnt.workflow.timesheet.dto.MailWfObject;

public class TimeSheetOnApprovalHandlerServiceTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

	Map<String, Object> map =new HashMap<String, Object>();
	String timesheet_id = (String) execution.getVariable(TimesheetWorkflowUtils.TIMESHEET_ID);
	Timesheet ts = Timesheet.find.where().eq("tid", timesheet_id).findUnique();
	
	RoleLevel roleLevel = ts.user.role;
	MailWfObject mailWfObject = new MailWfObject();
	if(!"Admin".equals(ts.timesheetWith.designation)){
		if(ts.timesheetWith.role.role_name.equals(roleLevel.final_approval)){
			//update uuid here on approval
			ts.tid = UUID.randomUUID().toString();
			ts.status = TimesheetStatus.Approved;
			ts.update();
			timesheet_id = ts.tid;
			System.out.println("in if::"+timesheet_id);
			//Create mail subject and body
			mailWfObject.to = ts.user.email;
			mailWfObject.subject =String.format("You got Approval For Time Sheet for Week %s from %s has been Approved from all levels",
						ts.weekOfYear,ts.user.firstName) ;
			mailWfObject.body=String.format("You got Approval For Time Sheet for Week %s from %s has been Approved from all levels",
					ts.weekOfYear,ts.user.firstName) ;
			map.put(TimesheetWorkflowUtils.TIMESHEET_ID, timesheet_id);
			map.put("isFinal", true);
			map.put("mailWfObject", mailWfObject);
		}else{
			//update uuid here on approval
			ts.tid = UUID.randomUUID().toString();
			ts.timesheetWith = ts.timesheetWith.manager;
			ts.update();
			timesheet_id = ts.tid;
			//Create mail subject and body
			mailWfObject.to = ts.user.email;
			mailWfObject.subject = String.format("You got Approval For Time Sheet for Week %s from %s",ts.weekOfYear,ts.user.firstName);
			mailWfObject.body=String.format("You got Approval For Time Sheet for Week %s from %s",ts.weekOfYear,ts.user.firstName);;
			map.put(TimesheetWorkflowUtils.TIMESHEET_ID, timesheet_id);
			map.put("isFinal", false);
			map.put("mailWfObject", mailWfObject);
			
		}
	}else{
		ts.tid = UUID.randomUUID().toString();
		ts.status = TimesheetStatus.Approved;
		ts.timesheetWith = ts.user;
		ts.update();
		timesheet_id = ts.tid;
		System.out.println("in if::"+timesheet_id);
		//Create mail subject and body
		mailWfObject.to = ts.user.email;
		mailWfObject.subject =String.format("You got Approval For Time Sheet for Week %s from %s has been Approved from all levels",
					ts.weekOfYear,ts.user.firstName) ;
		mailWfObject.body=String.format("You got Approval For Time Sheet for Week %s from %s has been Approved from all levels",
				ts.weekOfYear,ts.user.firstName) ;
		map.put(TimesheetWorkflowUtils.TIMESHEET_ID, timesheet_id);
		map.put("isFinal", true);
		map.put("mailWfObject", mailWfObject);
	}
	execution.setVariables(map);
	}
}
