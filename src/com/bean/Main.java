package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("=====================现在开始初始化IOC容器=====================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-beans.xml");
		System.out.println("=====================IOC容器初始化成功=====================");
		// 得到Person, 并使用
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		System.out.println("=====================现在开始关闭容器=====================");
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	}
}
