package com.custom.helpers;

import models.role.RoleX;

import com.mnt.core.helper.SaveModel;

public class RoleSave extends SaveModel<RoleX> {

	public RoleSave() {
		ctx = RoleX.class;
	}

}
