package com.custom.workflow.vacation;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import models.leave.ApplyLeave;
import models.role.RoleLevel;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.custom.domain.LeaveStatus;
import com.mnt.workflow.timesheet.dto.MailWfObject;

public class VacationOnApprovalHandlerServiceTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

	Map<String, Object> map =new HashMap<String, Object>();
	String vacation_id = (String) execution.getVariable(VacationWorkflowUtils.VACATION_ID);
	System.out.println(vacation_id);
	ApplyLeave leave = ApplyLeave.find.where().eq("leaveGuid", vacation_id).findUnique();
	
	RoleLevel roleLevel = leave.user.role;
	MailWfObject mailWfObject = new MailWfObject();
		if(leave.pendingWith.designation.equals(roleLevel.final_approval)){
			//update uuid here on approval
			leave.leaveGuid = UUID.randomUUID().toString();
			leave.status = LeaveStatus.Approved;
			leave.pendingWith = leave.user;
			leave.update();
			vacation_id = leave.leaveGuid;
			//Create mail subject and body
			mailWfObject.to = leave.user.email;
			mailWfObject.subject =String.format("Leave Request Approve.") ;
			mailWfObject.body=String.format("Your leave request from  %s for %s has been Approved from all levels",
					leave.startDate,leave.noOfDays) ;
			map.put(VacationWorkflowUtils.VACATION_ID, vacation_id);
			map.put("isFinal", true);
			map.put("mailWfObject", mailWfObject);
			
		}else{
			//update uuid here on approval
			leave.leaveGuid = UUID.randomUUID().toString();
			leave.pendingWith = leave.pendingWith.manager;
			leave.update();
			vacation_id = leave.leaveGuid;
			//Create mail subject and body
			mailWfObject.to = leave.user.email;
			mailWfObject.subject = String.format("Leave Request Approval from %s",leave.user.firstName) ;
			mailWfObject.body = "Your leave request has approved from "+ leave.user.firstName + " from "+leave.startDate ;
			
			map.put(VacationWorkflowUtils.VACATION_ID, vacation_id);
			map.put("isFinal", false);
			map.put("mailWfObject", mailWfObject);
		}
	execution.setVariables(map);
	}

}
