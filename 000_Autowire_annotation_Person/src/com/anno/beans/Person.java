package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	private Address address;
	private Passport passport;
	
	@Autowired(required=false)
	public Person(Address address) {
		System.out.println("from address");
		this.address = address;
	}
	
	@Autowired(required=false)
	public Person(@Qualifier("a1") Address address, @Qualifier("p1") Passport passport) {
		System.out.println(" from person constructor");
		this.address = address;
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}


}
