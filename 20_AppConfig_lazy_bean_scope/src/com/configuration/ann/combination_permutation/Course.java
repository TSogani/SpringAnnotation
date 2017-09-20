package com.configuration.ann.combination_permutation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	public String name;
	
	public Course(){
		System.out.println("course object is created");
	}

	public String getName() {
		return name;
	}
	@Value(value="#{courseProps.Course_name}")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	
}
