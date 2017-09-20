package com.profile.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevAppConfig {
	
	@Bean(name="dataSource")
	public DataSource newDataSource(){
		System.out.println("from dev");
		DataSource dataSource = new JDBC_DataSource();
		return dataSource; 
	}
}
	