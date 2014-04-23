package com.custom.workflow;

import models.company.Company;
import models.mail.MailSetting;
import models.timesheet.Timesheet;
import models.user.User;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.avaje.ebean.Expr;
import com.custom.emails.Email;
import com.custom.workflow.timesheet.TimesheetWorkflowUtils;
import com.mnt.workflow.timesheet.dto.MailWfObject;

public class MailTask  implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		MailWfObject mailWfObject = (MailWfObject) execution.getVariable("mailWfObject");
		
		String timesheet_id = (String) execution.getVariable(TimesheetWorkflowUtils.TIMESHEET_ID);
		Timesheet ts = Timesheet.find.where().eq("tid", timesheet_id).findUnique();
		User user = ts.timesheetWith;
		Company company = user.companyobject;
		
		MailSetting mailSetting = MailSetting.find.where().eq("companyObject", company).findUnique();
		System.out.println(mailSetting.hostName);
		System.out.println(mailWfObject.to);
		System.out.println(mailWfObject.body);
		
		Email.sendOnlyMail(mailSetting, mailWfObject.to, mailWfObject.subject, mailWfObject.body);
	}

}
