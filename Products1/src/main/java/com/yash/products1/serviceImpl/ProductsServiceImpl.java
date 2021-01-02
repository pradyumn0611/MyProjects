package com.yash.products1.serviceImpl;

import java.util.List;

import com.yash.products1.dao.ProductsDAO;
import com.yash.products1.daoImpl.ProductsDAOImpl;
import com.yash.products1.model.Products;
import com.yash.products1.service.ProductsService;

public class ProductsServiceImpl implements ProductsService {
	/*
	 * This class provides service to user operation.And provides implemetation to ProductsService interface.
	 */
	
	private ProductsDAO productsDAO;

	public ProductsServiceImpl() {
		productsDAO=new ProductsDAOImpl();
	}

	@Override
	public void addProducts(Products products) {
		productsDAO.save(products);	
	}

	@Override
	public List<Products> listProducts() {

		return productsDAO.findAll();
	}

	@Override
	public void updateProducts(Products products) {
     productsDAO.update(products);		
	}

	@Override
	public void deleteProducts(Products products) {
     productsDAO.delete(products);		
	}

}
