package com.st.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value=false)
// in case of annotaion @lazy bydefault is true. mean bean not created. 
public class Bycle {
public Bycle() {
	System.out.println("bycle created");
}
	public void run(){
		
		System.out.println("running......");
	}
}
