package com.mindtree.easybucks.service;

 
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.easybucks.dao.DaoImp.UserDaoImpl;
import com.mindtree.easybucks.entity.User;
import com.mindtree.easybucks.service.EasyService.UserService;
 
@Service
@Transactional
public class UserServiceImp implements UserService {
 
	@Autowired
	private UserDaoImpl userDaoImp;
	
	public boolean adduser(User user) {
		try{
			userDaoImp.adduser(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;		
	}

	public List<User> getUsers() {
		try{
			return userDaoImp.getUser();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
