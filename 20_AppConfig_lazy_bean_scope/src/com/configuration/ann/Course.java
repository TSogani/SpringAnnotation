package com.configuration.ann;

public class Course {
	private String name;
	
	public Course(){
		System.out.println("course object is created");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
}
