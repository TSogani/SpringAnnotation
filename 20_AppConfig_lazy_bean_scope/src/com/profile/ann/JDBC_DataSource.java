package com.profile.ann;

public class JDBC_DataSource implements DataSource{

	@Override
	public String ping() {
		return "sucess! JDBC data source";
	}
	
}
