package com.configuration.ann.without_stereotype_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootAppConfig.class);
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
