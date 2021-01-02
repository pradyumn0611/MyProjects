package com.yash.smsapp.test;

import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

public class UserserviceImpl_UserRegistrationOperationTest {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl() ;
		User user=new User("a","a","a","a",1,1,"a","a");
		
		userService.ragisterUser(user);
		
	}

}
