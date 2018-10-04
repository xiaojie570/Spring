package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public MyBeanFactoryPostProcessor() {
		System.out.println("�����MyBeanFactoryPostProcessorʵ���๹����������");
	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("BeanFactoryPostProcessor����postProcessBeanFactory����");
		/*BeanDefinition bd = arg0.getBeanDefinition("person");
		bd.getPropertyValues().addPropertyValue("phone","110");*/
	}

}
