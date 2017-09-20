package com.ann.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;

public class SecondAppConfig_propertyfile {

	@Bean(name="propsVal") // if not give any name it use method name 
	public Properties newProperties() throws IOException{
		
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("chain.properties"));
		return props;
	}
}
