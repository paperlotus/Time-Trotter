package com.custom.workflow.timesheet;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import models.timesheet.Timesheet;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.custom.domain.TimesheetStatus;
import com.mnt.workflow.timesheet.dto.MailWfObject;


public class TimeSheetOnRejectionHandlerServiceTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Map<String, Object> map =new HashMap<String, Object>();
		String timesheet_id = (String)execution.getVariable(TimesheetWorkflowUtils.TIMESHEET_ID);
		Timesheet ts = Timesheet.find.where().eq("tid", timesheet_id).findUnique();
		MailWfObject mailWfObject = new MailWfObject();
		
		//update uuid here on approval
		ts.tid = UUID.randomUUID().toString();
		timesheet_id = ts.tid;
		
		mailWfObject.to = ts.user.email;
		mailWfObject.subject = "Your Time Sheet for Week"+ts.weekOfYear+ " has been rejected by  "+ts.timesheetWith.firstName;
		mailWfObject.body = "Your Time Sheet for Week"+ts.weekOfYear+ " has been rejected by  "+ts.timesheetWith.firstName;
//		mailWfObject.to=timeSheetWFObj.user;
//		mailWfObject.subject = "Your Time Sheet for Week {?} has been rejected by  " + timeSheetWFObj.statusWith;
		ts.status = TimesheetStatus.Rejected;
		ts.level = 0;
		ts.timesheetWith = ts.user;
		ts.update();
		
		map.put(TimesheetWorkflowUtils.TIMESHEET_ID, timesheet_id);
		map.put("mailWfObject", mailWfObject);
		
		execution.setVariables(map);
	}
	
	

}
