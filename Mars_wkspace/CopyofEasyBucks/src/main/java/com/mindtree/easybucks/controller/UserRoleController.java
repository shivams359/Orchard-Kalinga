package com.mindtree.easybucks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.easybucks.entity.UserRole;
import com.mindtree.easybucks.service.UserRoleServiceImpl;

@RestController
public class UserRoleController {

	@Autowired
	private UserRoleServiceImpl userRoleService;

	public UserRoleServiceImpl getUserRoleService() {
		return userRoleService;
	}

	public void setUserRoleService(UserRoleServiceImpl userRoleService) {
		this.userRoleService = userRoleService;
	}

	@ResponseBody
	@RequestMapping(value = "/getuserrole", method = RequestMethod.GET)
	public List<UserRole> listUser() {
		List<UserRole> listUser = userRoleService.getUserRole();
		return listUser;
	}

	@RequestMapping(value = "/adduserrole", produces = "application/json", consumes = "application/json")
	public @ResponseBody boolean insertUserRole(@RequestBody UserRole userRole) {
		return userRoleService.adduserRole(userRole);
	}
}
