
package com.st.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.st.beans.Toy;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/st/common/applicationContext.xml");
		Toy toy = context.getBean("abc",Toy.class);
		toy.play();
	}
}
