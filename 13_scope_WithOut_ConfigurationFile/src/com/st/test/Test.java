package com.st.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.st.beans.Bycle;
import com.st.beans.Toy;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				"com.st.beans");
		System.out.println(context2);
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/st/common/applicationContext.xml");
		Toy toy1 = context2.getBean("abc", Toy.class);
		System.out.println("toy1"+toy1);
		Toy toy2 = context2.getBean("abc", Toy.class);
		System.out.println("toy2"+toy2);
		Bycle bycle  = context2.getBean("bycle", Bycle.class);
		toy1.play();
		toy2.play();
		bycle.run();
	}
}