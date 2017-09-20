package com.ann.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ann.beans.Bycle;

@Configuration
@Import(value={FirstAppConfig.class,SecondAppConfig_propertyfile.class})
public class RootConfig {

	@Bean(name="bycle",autowire=Autowire.BY_TYPE)
	public Bycle newBycle(){
		
		Bycle bycle = new Bycle();
		
		return bycle;
	}
}
