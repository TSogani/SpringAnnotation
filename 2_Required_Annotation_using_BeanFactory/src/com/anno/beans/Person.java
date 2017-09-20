package com.anno.beans;

import org.springframework.beans.factory.annotation.Required;

public class Person {
		
	private String ssn;
	private String name;
	
	
	@Required
	public void setSsn(String ssn) {
		System.out.println("ssn setter");
		this.ssn = ssn;
	}
	@Required
	public void setName(String name) {
		System.out.println("name setter");
		this.name = name;
	}
		
	
}
