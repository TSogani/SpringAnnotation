package com.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Person;


public class Test {
	public static void main(String[] args) {		

		/*
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/anno/common/application-context.xml"));
		
		AutowiredAnnotationBeanPostProcessor bean2 = factory.getBean(AutowiredAnnotationBeanPostProcessor.class);
		QualifierAnnotationAutowireCandidateResolver bean3 = factory.getBean(QualifierAnnotationAutowireCandidateResolver.class);
		
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bean2);
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bean3);
		*/
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/anno/common/application-context.xml");
		
		Person bean = factory.getBean("person", Person.class);
		System.out.println(bean); 
	}
}
