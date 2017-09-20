package com.st.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;


@Named
public class Processor {
	public Processor() {
		System.out.println("processor loading...");
	}
	
	@PostConstruct
	public void start(){
		
		System.out.println("processor running...");
	}
	@PreDestroy
	public void shutDown(){
		System.out.println("process ended..!!");
	}
}
