package com.configuration.ann.without_stereotype_2;

import org.springframework.beans.factory.annotation.Value;

public class Chain {
	private String name;
	private String size;
	
	public String getName() {
		return name;
	}
	@Value(value="#{propsVal.Chain_name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	@Value(value="#{propsVal.Chain_size}")
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Chain [name=" + name + ", size=" + size + "]";
	}
}
