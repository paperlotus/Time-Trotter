package com.custom.workflow.vacation;
import models.delegation.Delegate;
import models.leave.ApplyLeave;
import models.user.User;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.joda.time.DateTime;

import com.mnt.workflow.timesheet.dto.MailWfObject;


public class VacationHandlerServiceTask implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String vacation_id = (String) execution.getVariable(VacationWorkflowUtils.VACATION_ID);
		ApplyLeave leave = ApplyLeave.find.where().eq("leaveGuid", vacation_id).findUnique();
		User manager = leave.pendingWith;
		MailWfObject mailWfObject = new MailWfObject();  
		
		if(manager !=null){
			leave.pendingWith = manager;
			leave.level++;
			mailWfObject = createMailObject(leave, manager);
			leave.processInstanceId = execution.getProcessInstanceId();
			leave.update();
		}
		
		execution.setVariable("mailWfObject", mailWfObject);
	}
	
	public MailWfObject createMailObject(ApplyLeave leave,User manager){
		
		Delegate delegate = Delegate.find.where().eq("delegator_id", manager.id).findUnique();
		
		DateTime today = new DateTime();
		
		MailWfObject mailWfObject = new MailWfObject();
		
		mailWfObject.to =  manager.email + ",";
		
		if(delegate != null && (today.isAfter(delegate.fromDate.getTime()) && today.isBefore(delegate.toDate.getTime()))){
			mailWfObject.to += delegate.delegatedTo.email ;
		}
		
		mailWfObject.subject = String.format("You got Leave Request  from %s",leave.user.firstName) ;
		//leave.startDate,leave.endDate,
		
		mailWfObject.body = "You have received Leave Request from "+ leave.user.firstName + " from "+leave.startDate;
		
		mailWfObject.body = mailWfObject.body +" \r\n "+ "To Approve click on below link ";
		mailWfObject.body = mailWfObject.body + "\r\n http://time.mnt.cloudbees.net/leaveApprovalViaMail?q=yes&id="+leave.leaveGuid;
		mailWfObject.body = mailWfObject.body + " \r\n "+ "To Reject click on below link ";
		mailWfObject.body = mailWfObject.body + "\r\n  http://time.mnt.cloudbees.net/leaveApprovalViaMail?q=no&id="+leave.leaveGuid;
		mailWfObject.body = String.format(mailWfObject.body);
		return mailWfObject;
	}

}
