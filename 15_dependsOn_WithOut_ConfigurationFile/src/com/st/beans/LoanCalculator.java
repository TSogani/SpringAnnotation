package com.st.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("cacheManager")
public class LoanCalculator {
public LoanCalculator() {
	System.out.println("loan Calculator created..");
}	
}
