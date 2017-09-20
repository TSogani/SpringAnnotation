package com.aw.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private int eno;
	private String name;
	private Passport passport; 
	private Address address;
	
	// one constructor execute at one time, 
	// if we are perform @autoWired multiple place its confuse. and throw exception 
	// so must we use required=false. 
	
	
	
	
	@Autowired(required=false)
	public Person(Passport passport) {
		super();
		this.passport = passport;
	}

	@Autowired(required=false)
	public Person(Address address) {
		super();
		this.address = address;
	}





	@Override
	public String toString() {
		return "Person [eno=" + eno + ", name=" + name + ", passport="
				+ passport + ", address=" + address + "]";
	}

}
