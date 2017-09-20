package com.configuration.ann.combination_permutation;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.configuration.ann.combination_permutation")
public class CollegeAppConfig {
	
	@Bean(name="courseProps")
	public Properties newProperties() throws IOException{
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("course.properties"));
		return props;
	}
	
	@Bean(name="apex",autowire=Autowire.BY_TYPE,initMethod="init",destroyMethod="destroy")
	public College newCollege(){
		College college = new College();
		return college;
	}
	
}
