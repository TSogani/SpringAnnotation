package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person1 {

	@Autowired(required = false)
	// @Qualifier(value="address1")
	@Qualifier(value = "indian")
	// ramove harcoding that value name is specified in the address with the
	// qualifire tag. with indian value.
	private Address address;

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

}
