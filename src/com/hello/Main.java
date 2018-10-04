package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.Car;
import com.ioc.Person;

public class Main {
	public static void main(String[] args) {
		// 1. ���� Spring �� IOC ��������
		// ApplicationContext��һ���ӿڣ�ClassPathXmlApplicationContext�Ǹýӿڵ�ʵ���࣬����ʾ�����ļ��ڵ�ǰ��·���£������ļ���������Beans.xm
		// ApplicationContext����IOC����������Spring������
		ApplicationContext context = new ClassPathXmlApplicationContext("Test.xml");
		
		// 2. �� IOC �����л�ȡBeanʵ��
		// ��ʽһ����ȡBeanʵ��������xml�ļ��е�id��λ��IOC�����е�bean
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// ��ʽ�����������ͷ���IOC�����е�bean����Ҫ��IOC�����б���ֻ����һ�������͵�Bean
		//HelloWorld obj = context.getBean(HelloWorld.class);
		
		// 3. ����hello����
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
