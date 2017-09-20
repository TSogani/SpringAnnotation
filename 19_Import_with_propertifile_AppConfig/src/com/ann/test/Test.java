package com.ann.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ann.beans.Bycle;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ann.config","com.ann.beans");
		Bycle bycle = context.getBean("bycle", Bycle.class);
		System.out.println(bycle);
	}
}
