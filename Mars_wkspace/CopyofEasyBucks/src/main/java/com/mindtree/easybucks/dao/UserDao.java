package com.mindtree.easybucks.dao;

import java.util.List;

import com.mindtree.easybucks.entity.User;

public interface UserDao {
	public boolean adduser(User user);
	public List<User> getUser();
	
}
