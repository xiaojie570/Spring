package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Car;

public class Main {
	public static void main(String[] args) {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person1 = (Person) ctx.getBean("person1");
		System.out.println(person1);
		
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println(person2);
		
		Person person3 = (Person) ctx.getBean("person3");
		System.out.println(person3);*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car1 = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		System.out.println(car1 == car2);
	}
}
