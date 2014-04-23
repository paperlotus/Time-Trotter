package com.custom.helpers;

import models.timesheet.Timesheet;

import com.mnt.core.helper.SaveModel;

public class TimesheetSave extends SaveModel<Timesheet> {

	public TimesheetSave() {
		ctx = Timesheet.class;
	}

}
