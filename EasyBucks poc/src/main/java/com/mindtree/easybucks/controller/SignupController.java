package com.mindtree.easybucks.controller;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.easybucks.entity.UserData;
import com.mindtree.easybucks.services.EasyServiceImp;
import com.mindtree.easybucks.services.EasyService.EasyService;
 

@Controller
public class SignupController {
	
	@RequestMapping(value="/signup")
	public String signup()
	{
		return "user";
	}
	@RequestMapping(value="/add")
	public void adduser(HttpServletRequest request,HttpServletRequest responds)
	{
		//System.out.println(1); 
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String role = request.getParameter("role");
		//System.out.println(role);
		UserData userdata=new UserData();
		userdata.setName(name);
		userdata.setPhone(phone);
		userdata.setEmail(email);
		userdata.setPassword(password);
		userdata.setConfirmpassword(confirmpassword);
		userdata.setRole(role);
        EasyService e=new EasyServiceImp();
        e.adduser(userdata);
        
	}
	
}
