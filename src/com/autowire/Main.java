package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person1 = (Person) ctx.getBean("person1");
		System.out.println(person1);
		
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println(person2);
		
		Person person3 = (Person) ctx.getBean("person3");
		System.out.println(person3);*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		/*Address address1 = (Address) ctx.getBean("address1");
		System.out.println(address1);*/
		
		
		Address address3 = (Address) ctx.getBean("address3");
		System.out.println(address3);
		/*
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);*/
	}
}
