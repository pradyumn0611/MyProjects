package com.yash.products1.service;
import java.util.List;

import com.yash.products1.model.*;

public interface ProductsService {
	/*
	 * Inteface to provide declation of methods which can be inplemanted in different classes.
	 */
	public void addProducts(Products products);
	
	public List <Products> listProducts();
	
	public void updateProducts(Products products);
	
	public void deleteProducts(Products products);

}
