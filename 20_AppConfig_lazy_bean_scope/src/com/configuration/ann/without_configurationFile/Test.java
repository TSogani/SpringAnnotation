package com.configuration.ann.without_configurationFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.configuration.ann.*");
		//Course course = context.getBean("newCourse", Course.class);//bydefault method name
		Course course = context.getBean("mca_course", Course.class);
		Course course1 = context.getBean("mca_course", Course.class);
		System.out.println(course);
		System.out.println("is singleton?"+(course==course1));
	}
}
