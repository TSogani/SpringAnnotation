package com.aw.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int eno;
	private String name;
	
	private Address address;

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Person [eno=" + eno + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	
	
}
