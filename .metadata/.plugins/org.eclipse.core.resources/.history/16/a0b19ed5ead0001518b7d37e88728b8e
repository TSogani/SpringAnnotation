package com.configuration.ann.without_configurationFile_withPropertyFile;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(name="bca_course")           //when we don't give any name then it will choose method name by default.
	//@Lazy(true)							//bydefault @Lazy(false)
	//@Scope("prototype")                //bydefault @Scope("singleton")
	public Course newCourse(){
		Course course = new Course();
		course.setName("remaining.....");
		return course;
	}
	@Bean(name="course_props")
	public Properties createCourseProperties() throws IOException{
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("course.properties"));
		return props;
	}
}
