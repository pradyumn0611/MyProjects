package com.yash.nutrition_app.util;
import java.sql.*;
/**
 * This class will provide utilities for your WEightLog Module.
 * This class  deals with connection with database of users of weightLog Module. 
 * @author pradyumn
 *
 */
public class JDBCUtil {
	/**
	 * connection object which can only be used only here.
	 */
	private Connection con=null;
	/*
	 * Prepared statement object for default value.
	 */
	private  PreparedStatement pstm=null;

/**
 * connect method provides functionality for creating the proper connection with your app's database.
 */
	public Connection connect()
	{
		try {
			Class c=Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nutritionapp","root","root");

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		return con;
	}

/**
 * Works for fetching and processing data for your request for any operation.
 * user input querries it takes and give desired data. 
 */
	public  PreparedStatement getPreparedStatement(String sql) {

		try
		{
			pstm=connect().prepareStatement(sql);


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pstm;

	}


}
