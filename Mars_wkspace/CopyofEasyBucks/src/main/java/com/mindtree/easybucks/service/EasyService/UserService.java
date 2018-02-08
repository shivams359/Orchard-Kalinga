package com.mindtree.easybucks.service.EasyService;

import java.util.List;

import com.mindtree.easybucks.entity.User;

public interface UserService {
	public boolean adduser(User user);
	public List<User> getUsers();

}
