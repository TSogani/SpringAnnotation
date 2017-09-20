package com.configuration.ann.without_stereotype_2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({DAOAppConfig.class,UtilAppConfig.class})  //whatever class we give to @Import annotation it will put these classes in IOC container.
public class RootAppConfig {
	
	@Bean(name="motor",autowire=Autowire.BY_TYPE)
	public Motor newMotor(){
		Motor motor = new Motor();
		return motor;
	}
}
