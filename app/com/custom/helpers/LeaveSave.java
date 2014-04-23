package com.custom.helpers;

import models.leave.ApplyLeave;

import com.mnt.core.helper.SaveModel;

public class LeaveSave extends SaveModel<ApplyLeave> {

	public LeaveSave() {
		ctx = ApplyLeave.class;
	}

}
