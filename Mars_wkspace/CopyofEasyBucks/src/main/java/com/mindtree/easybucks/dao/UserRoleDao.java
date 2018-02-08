package com.mindtree.easybucks.dao;

import java.util.List;

import com.mindtree.easybucks.entity.UserRole;

public interface UserRoleDao {
	public boolean addUserRole(UserRole userRole);
	public List<UserRole> getUserRole();

}
