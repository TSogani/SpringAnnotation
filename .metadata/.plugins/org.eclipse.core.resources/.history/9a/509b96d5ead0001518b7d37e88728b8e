package com.configuration.ann.without_stereotype;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="receiver")
	public Receiver newReceiver(){
		Receiver receiver = new Receiver();
		return receiver;
	}
	
	@Bean(name="radio",autowire=Autowire.BY_TYPE)
	public Radio newRadio(){
		Radio radio = new Radio();
		return radio;
	}
}
