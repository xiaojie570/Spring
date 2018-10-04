package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("����MyBeanPostProcessorʵ���๹����");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor�ӿڷ���postProcessBeforeInitialization���Զ����Խ��и��ģ�����");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor�ӿڷ���postProcessAfterInitialization���Զ����Խ��и��ģ�����");
		return bean;
	}

	

}
