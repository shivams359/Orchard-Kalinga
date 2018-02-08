package com.mindtree.easybucks.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.easybucks.entity.User;
import com.mindtree.easybucks.service.UserServiceImp;
 

@RestController
@RequestMapping(value="/signup")
public class SignupController {
	
	@Autowired
	private UserServiceImp easyServiceImp;
	
	@RequestMapping(value = "/adduser", produces = "application/json", consumes = "application/json")
	
	public @ResponseBody boolean insertUser(@RequestBody User user) {
		return easyServiceImp.adduser(user);
	}
	@ResponseBody
	@RequestMapping(value = "/getusers", method = RequestMethod.GET)
	public List<User> listUser()  {
		List<User> listUser = easyServiceImp.getUsers();
		return listUser; 
    }
		
}
