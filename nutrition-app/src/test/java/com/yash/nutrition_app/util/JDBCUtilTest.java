package com.yash.nutrition_app.util;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class JDBCUtilTest {
	private JDBCUtil jdbcUtil;
	
	@Before
	public void setUp() { jdbcUtil=new JDBCUtil(); }

	@Test
	public void test_JDBCUtil_Connect_ShouldReturnConnectionObject() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method method=JDBCUtil.class.getDeclaredMethod("connect");
		method.setAccessible(true);
		JDBCUtil jdbcUtil=new JDBCUtil();
		Connection con=(Connection)method.invoke(jdbcUtil);
		assertTrue(con!=null);
		
	}
	
	@Test
	public void test_JDBCUtilTest_PreparedStatement_ShouldReturnPreparedStatementObject()
	{
		LocalDate date= LocalDate.now();
		PreparedStatement pstm=jdbcUtil.getPreparedStatement("insert into weightlog values (1,45,date,date,2)");
		assertNotNull(pstm);
		
	}

}
