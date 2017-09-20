package com.aw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aw.beans.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aw/common/applicationContext.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}
}
