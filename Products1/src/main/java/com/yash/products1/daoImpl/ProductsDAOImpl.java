package com.yash.products1.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.products1.dao.ProductsDAO;
import com.yash.products1.model.Products;
import com.yash.products1.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ProductsDAOImpl extends JDBCUtil implements ProductsDAO {
	/**
	 * ProductsDAOImpl provides implementation to methods in ProductsDAO interface 
	 * and gets connection to jdbc via JDBCUtil class.
	 */
	@Override
	public void save(Products products) {

		try 
		{
		String url="jdbc:mysql://localhost:3306/products";
		Connection conn=JDBCUtil.getConnection(url);
		String sql="insert into products values (?,?,?)";
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setString(1,products.getId());
		preparedStatement.setString(2,products.getName());
		preparedStatement.setDouble(3,products.getPrice());
		int i=preparedStatement.executeUpdate();
		if(i!=0)
			System.out.println("Product Inserted Properly");
		else
			System.out.println("Product not inserted");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<Products> findAll() {
		List<Products> list=new ArrayList<Products>();
		try
		{String url="jdbc:mysql://localhost:3306/products";
		Connection conn=JDBCUtil.getConnection(url);
		String sql="select * from products ";
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		ResultSet rs=preparedStatement.executeQuery();
		while(rs.next())
		{
			list.add(new Products(rs.getString(1),rs.getString(2),rs.getInt(3)));
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	
	}

	@Override
	public void update(Products products) {
		try 
		{
		String url="jdbc:mysql://localhost:3306/products";
		Connection conn=JDBCUtil.getConnection(url);
		String sql="UPDATE products"
				+ " SET name = ?,price=? "
				+ "WHERE id = ?";
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setString(1,products.getName());
		preparedStatement.setDouble(2,products.getPrice());
		preparedStatement.setString(3,products.getId());
		int i=preparedStatement.executeUpdate();
		if(i!=0)
			System.out.println("Product updated");
		else
			System.out.println("Product not updated");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

	@Override
	public void delete(Products products) {
		try 
		{
		String url="jdbc:mysql://localhost:3306/products";
		Connection conn=JDBCUtil.getConnection(url);
		String sql="delete  from products "
				+ "where id=?";
		
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setString(1,products.getId());
		int i=preparedStatement.executeUpdate();
		if(i!=0)
			System.out.println("Product deleted");
		else
			System.out.println("Product not deleted");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
		
	}

	
	

}
