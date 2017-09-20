package com.ann.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Course {
	private String name;

	public Course() {
		System.out.println("course created..");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
