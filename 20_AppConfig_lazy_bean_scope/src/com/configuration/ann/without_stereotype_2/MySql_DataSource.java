package com.configuration.ann.without_stereotype_2;

import com.profile.ann.DataSource;

public class MySql_DataSource implements DataSource{

	@Override
	public String ping() {
		
		return "sucess! mysql dataSource";
	}
	
}
