package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
	private String name;
	private String address;
	private int phone;
	
	private BeanFactory beanFactory;
	private String beanName;
	
	public Person() {
		System.out.println("��������������Person�Ĺ�����ʵ����");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("��ע�����ԡ�ע������name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("��ע�����ԡ�ע������address");
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		System.out.println("��ע�����ԡ�ע������phone");
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", beanFactory=" + beanFactory
				+ ", beanName=" + beanName + "]";
	}
	
	// ͨ��<bean>��init-method����ָ����ʼ������
	public void myInit() {
		System.out.println("��init-method������<bean>��init-method����ָ���ĳ�ʼ������");
	}
	
	// ͨ��<bean>��destroy-method����ָ����ʼ������
	public void myDestroy() {
		System.out.println("��destroy-method������<bean>��destroy-method����ָ�������ٷ���");
	}
	
	// ����BeanFactoryAware�ӿڷ���
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("��BeanFactoryAware�ӿڡ�����BeanFactoryAware.setBeanFactory()");
		this.beanFactory = arg0;
	}

	// ����BeanNameAware�ӿڷ���
	@Override
	public void setBeanName(String arg0) {
		System.out.println("��BeanNameAware�ӿڡ�����BeanNameAware.setBeanName()");
		this.beanName = arg0;
	}

	// ����InitializingBean�ӿڷ���
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("��InitializingBean�ӿڡ�����InitializingBean.afterPropertiesSet����");
	}

	// ����DisposibleBean�ӿڷ���
	@Override
	public void destroy() throws Exception {
		System.out.println("��DisposibleBean�ӿڡ�����DisposibleBean.destroy()");
	}
}
