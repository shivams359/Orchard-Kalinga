package com.mindtree.easybucks.service.EasyService;

import java.util.List;

import com.mindtree.easybucks.entity.UserRole;

public interface UserRoleService {
	public boolean adduserRole(UserRole user);
	public List<UserRole> getUserRole();
}
