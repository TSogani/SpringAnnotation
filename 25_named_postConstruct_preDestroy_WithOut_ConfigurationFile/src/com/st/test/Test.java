package com.st.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.st.beans.Processor;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				"com.st.beans");
		Processor processor = context2.getBean("processor", Processor.class);
				((AbstractApplicationContext)context2).close();
	//	((ConfigurableListableBeanFactory)processor).destroySingletons();
	}
}
