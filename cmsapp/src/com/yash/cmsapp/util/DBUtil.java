package com.yash.cmsapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * This class provides database utility for other classes.
 * @author pradyumn
 *
 */
public class DBUtil {
	public Connection connection=null;
	public PreparedStatement psmt=null;
	/**
	 * This method establishes connection.
	 * @return
	 */
	public Connection openConnection() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmdb","root","root");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return connection;
				
	}
	/*
	 * This class prepares data to be inserted in the database.
	 */
	public PreparedStatement getPrepareStatement(String sql)
	{
		try {
		psmt=openConnection().prepareStatement(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return psmt;
	}
	

}
