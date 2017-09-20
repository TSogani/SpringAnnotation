package com.ann.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ann.beans.Course;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ann/common/applicationContext.xml");
		Course bean = context.getBean("course", Course.class);
		Course bean1 = context.getBean("course1", Course.class);
		Course bean2 = context.getBean("course2", Course.class);
		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
	}
}
