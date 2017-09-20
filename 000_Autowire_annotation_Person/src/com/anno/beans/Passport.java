package com.anno.beans;

public class Passport {

	private String ssn;
	private String name;
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Passport [ssn=" + ssn + ", name=" + name + "]";
	}
	
}
