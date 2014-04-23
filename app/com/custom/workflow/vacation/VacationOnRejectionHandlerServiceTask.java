package com.custom.workflow.vacation;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import models.leave.ApplyLeave;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.custom.domain.LeaveStatus;
import com.mnt.workflow.timesheet.dto.MailWfObject;


public class VacationOnRejectionHandlerServiceTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Map<String, Object> map =new HashMap<String, Object>();
		String vacation_id = (String)execution.getVariable(VacationWorkflowUtils.VACATION_ID);
		ApplyLeave leave = ApplyLeave.find.where().eq("leaveGuid", vacation_id).findUnique();
		MailWfObject mailWfObject = new MailWfObject();
		
		//update uuid here on approval
		leave.leaveGuid = UUID.randomUUID().toString();
		vacation_id = leave.leaveGuid;
		
		mailWfObject.to = leave.user.email;
		mailWfObject.subject = "Your Leave Request as been rejected";
		mailWfObject.body = "Your Leave Request as been rejected by has been rejected by  "+leave.pendingWith.firstName;
		
		leave.status = LeaveStatus.Rejected;
		leave.level = 0;
		leave.pendingWith = leave.user;
		leave.update();
		
		map.put(VacationWorkflowUtils.VACATION_ID, vacation_id);
		map.put("mailWfObject", mailWfObject);
		
		execution.setVariables(map);
	}
	
	

}
