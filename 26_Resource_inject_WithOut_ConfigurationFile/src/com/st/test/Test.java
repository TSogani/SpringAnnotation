package com.st.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.st.beans.Toy;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				"com.st.beans");
		Toy toy = context2.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}
