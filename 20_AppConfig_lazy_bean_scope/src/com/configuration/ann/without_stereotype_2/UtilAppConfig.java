package com.configuration.ann.without_stereotype_2;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;

public class UtilAppConfig{
	
	@Bean(name="propsVal")
	public Properties newProperties() throws IOException{
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("chain.properties"));
		return props;
	}
}
