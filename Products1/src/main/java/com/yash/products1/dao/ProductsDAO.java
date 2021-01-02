package com.yash.products1.dao;

import java.util.List;

import com.yash.products1.model.*;

public interface ProductsDAO {
	/*
	 * An interface of products is created to declare the methods. And we can provide implementation to these in different classes.
	 */
	public void save(Products products);
	
	public List<Products> findAll();
	
	public void update(Products products);
	
	public void delete(Products products);
	

}
