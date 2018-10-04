package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.Car;
import com.ioc.Person;

public class Main {
	public static void main(String[] args) {
		// 1. 创建 Spring 的 IOC 容器对象
		// ApplicationContext是一个接口，ClassPathXmlApplicationContext是该接口的实现类，它表示配置文件在当前类路径下，配置文件的名字是Beans.xm
		// ApplicationContext代表IOC容器：面向Spring开发者
		ApplicationContext context = new ClassPathXmlApplicationContext("Test.xml");
		
		// 2. 从 IOC 容器中获取Bean实例
		// 方式一：获取Bean实例，利用xml文件中的id定位到IOC容器中的bean
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// 方式二：利用类型返回IOC容器中的bean，但要求IOC容器中必须只能有一个该类型的Bean
		//HelloWorld obj = context.getBean(HelloWorld.class);
		
		// 3. 调用hello方法
		obj.hello();
		
		Watch watch = (Watch) context.getBean("helloWatch");
		System.out.println(watch);
		/*System.out.println();
		
		Car car = (Car) context.getBean("car1");
		System.out.println(car);
		
		car = (Car) context.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		Car car4 = (Car) context.getBean("car4");
		System.out.println(car4);*/
	}
}
