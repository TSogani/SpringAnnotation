package com.configuration.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(name="mca_course")           //when we don't give any name then it will choose method name by default.
	@Lazy(true)							//bydefault @Lazy(false)
	@Scope("prototype")                //bydefault @Scope("singleton")
	public Course newCourse(){
		Course course = new Course();
		course.setName("mca");
		course.setName("remaining.....");
		return course;
	}
}
