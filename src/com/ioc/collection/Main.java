package com.ioc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.properties.DataSource;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		/*Person person = (Person) ctx.getBean("person2");
		System.out.println(person);
		
		PersonMap person2 = (PersonMap) ctx.getBean("person3");
		System.out.println(person2);
		*/
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getProperties());
		
		Person person4 = (Person) ctx.getBean("person4");
		System.out.println(person4);
	}
}
