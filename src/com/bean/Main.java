package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("=====================���ڿ�ʼ��ʼ��IOC����=====================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-beans.xml");
		System.out.println("=====================IOC������ʼ���ɹ�=====================");
		// �õ�Person, ��ʹ��
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		System.out.println("=====================���ڿ�ʼ�ر�����=====================");
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	}
}
