package com.aw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private int eno;
	private String name;

	private Address address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	
	public Person(@Qualifier(value = "address1")Address address) {
		super();
		this.address = address;
	}

	// Qualifier Target(value={ANNOTATION_TYPE, FIELD, METHOD, PARAMETER, TYPE})

	public void newAddress(Address address) {
		this.address = address;
	}

	/*public void setAddress(Address address) {
		this.address = address;
	}
*/
	public void setEno(int eno) {
		this.eno = eno;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [eno=" + eno + ", name=" + name + ", address=" + address
				+ "]";
	}

}
