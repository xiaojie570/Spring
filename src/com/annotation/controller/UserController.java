package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.annotation.service.UserService;

@Controller
public class UserController {
	
	
	private UserService userService;
	
	//@Autowired ���Զ�װ��ע��
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public void execute() {
		System.out.println("UserController's execute()");
		userService.add();
	}
}
