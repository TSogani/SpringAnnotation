package com.ann.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@ComponentScan(basePackages={"com.ann.beans"})
@Configuration
//@Component
public class AppConfig {
	public Course course;
	// bean created by multiple id. level-annotation and method
@Bean(name={"course1","course2"})
@Scope(value="prototype")
	public Course newCourse(){
		course = new Course();
		return course;
	}
}
