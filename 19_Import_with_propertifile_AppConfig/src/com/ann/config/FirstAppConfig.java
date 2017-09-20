package com.ann.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ann.beans.Chain;

public class FirstAppConfig {
	
	@Bean(name="chain")
	public Chain newChain(){
		Chain chain = new Chain();
		return chain;
	}
}
