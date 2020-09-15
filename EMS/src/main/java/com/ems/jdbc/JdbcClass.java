package com.ems.jdbc;


import java.sql.*;
public class JdbcClass
{
	public Connection getConnection() throws Exception
	{
		String url = "jdbc:postgresql://localhost/EMS?user=postgres&password=1234";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url);		
		return con;
	}

}
