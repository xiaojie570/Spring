package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.controller.UserController;
import com.annotation.repository.UserRepositoryImpl;
import com.annotation.service.UserService;


public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		/*TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);*/
		
		UserController userController = (UserController) ctx.getBean("userController");
		userController.execute();
		
		/*UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		*/
		/*UserRepositoryImpl userRespository = (UserRepositoryImpl) ctx.getBean("userRepository");
		System.out.println(userRespository);*/
	}
}
