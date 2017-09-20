package com.configuration.ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/ann/application-context.xml");
		//Course course = context.getBean("newCourse", Course.class);//bydefault method name
		Course course = context.getBean("mca_course", Course.class);
		Course course1 = context.getBean("mca_course", Course.class);
		System.out.println(course);
		System.out.println("is singleton?"+(course==course1));
	}
}
