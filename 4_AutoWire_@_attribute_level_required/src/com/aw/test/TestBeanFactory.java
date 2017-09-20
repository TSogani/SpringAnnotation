package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Person;

public class TestBeanFactory {
	public static void main(String[] args) {
	
		BeanFactory context = new XmlBeanFactory(new ClassPathResource("com/aw/common/applicationContext.xml"));
		AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor = context.getBean("autowiredAnnotationBeanPostProcessor",AutowiredAnnotationBeanPostProcessor.class);
		((ConfigurableListableBeanFactory)context).addBeanPostProcessor(autowiredAnnotationBeanPostProcessor);
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}
}
