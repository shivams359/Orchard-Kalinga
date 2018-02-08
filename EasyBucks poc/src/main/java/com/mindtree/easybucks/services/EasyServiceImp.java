package com.mindtree.easybucks.services;

 
import com.mindtree.easybucks.dao.EasyDao;
import com.mindtree.easybucks.dao.DaoImp.EasyDaoImp;
import com.mindtree.easybucks.entity.UserData;
import com.mindtree.easybucks.services.EasyService.EasyService;
 

public class EasyServiceImp implements EasyService {
 
	public void adduser(UserData user) {
		 EasyDao easy=new EasyDaoImp();
		 easy.adduser(user);
		
	}

}
