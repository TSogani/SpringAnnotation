package com.configuration.ann.without_configurationFile_withPropertyFile;

import org.springframework.beans.factory.annotation.Value;

public class Course {
	private String name;
	
	public Course(){
		System.out.println("course object is created");
	}

	
	public String getName() {
		return name;
	}
	@Value(value="#{course_props.Course_name}")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
}
