package com.mindtree.easybucks.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.easybucks.dao.DaoImp.UserRoleDaoImpl;
import com.mindtree.easybucks.entity.UserRole;
import com.mindtree.easybucks.service.EasyService.UserRoleService;
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
	
	@Autowired
	private UserRoleDaoImpl userRoleDao;

	public UserRoleDaoImpl getUserRoleDao() {
		return userRoleDao;
	}

	public void setUserRoleDao(UserRoleDaoImpl userRoleDao) {
		this.userRoleDao = userRoleDao;
	}

	public boolean adduserRole(UserRole userRole) {
		try{
			userRoleDao.addUserRole(userRole);
;			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public List<UserRole> getUserRole() {
		try{
			return userRoleDao.getUserRole();
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}

}
