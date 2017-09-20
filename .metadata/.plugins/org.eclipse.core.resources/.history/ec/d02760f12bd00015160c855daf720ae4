package com.st.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.st.beans.LoanCalculator;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				"com.st.beans");
		LoanCalculator loanCalculator = context2.getBean("loanCalculator", LoanCalculator.class);
		
	}
}
