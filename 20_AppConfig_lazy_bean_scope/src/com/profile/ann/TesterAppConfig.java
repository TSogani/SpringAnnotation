package com.profile.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.configuration.ann.without_stereotype_2.MySql_DataSource;

@Configuration
@Profile("tester")
public class TesterAppConfig {
	
	@Bean(name="dataSource")
	public DataSource newDataSource(){
		System.out.println("from tester");
		DataSource dataSource = new JDBC_DataSource();
		return dataSource; 
	}
}
