package com.yash.smsapp.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.cmsapp.util.DBUtil;

public class DBUtilTest {
	/**
	 * This class does testing for DBUtil.
	 * @param args
	 */
	public static void main(String args[])
	{
		DBUtil dbUtil=new DBUtil();
		Connection con=dbUtil.openConnection();
		System.out.println(con);
		
		String sql="INSERT INTO users (NAME,contact,loginname,PASSWORD) VALUES(?,?,?,?);";
		PreparedStatement pstmt=dbUtil.getPrepareStatement(sql);
		try
		{
			pstmt.setString(1,"pradyumn");
			
			pstmt.setString(2,"1234567");
			
			pstmt.setString(3,"123");
			
			pstmt.setString(4,"pradyumn");
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		}

}
