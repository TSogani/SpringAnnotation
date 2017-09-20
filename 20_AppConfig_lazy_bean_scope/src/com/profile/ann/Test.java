package com.profile.ann;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev"); //only change here...No-need to chage huge amount of code.
		context.scan("com.profile.ann");
		context.refresh();
		JDBC_DataSource jdbcDataSource = context.getBean("dataSource", JDBC_DataSource.class);
		String ping = jdbcDataSource.ping();
		System.out.println(ping);
	
	}
}
