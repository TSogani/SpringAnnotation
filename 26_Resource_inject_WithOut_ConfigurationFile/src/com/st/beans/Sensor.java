package com.st.beans;

import org.springframework.stereotype.Component;

@Component
public class Sensor {
	private int sid;
	private String type;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Sensor [sid=" + sid + ", type=" + type + "]";
	}
}
