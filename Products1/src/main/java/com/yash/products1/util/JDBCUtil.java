package com.yash.products1.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JDBCUtil {
	/*
	 * Load the driver and get the connection and use to do both in different classes.
	 */
	
	public static  Connection getConnection(String url)
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,"root","root");
			
			return conn;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}

}
