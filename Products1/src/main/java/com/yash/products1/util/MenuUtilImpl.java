package com.yash.products1.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.products1.model.Products;
import com.yash.products1.service.ProductsService;
import com.yash.products1.serviceImpl.ProductsServiceImpl;


public class MenuUtilImpl {
	/*
	 * Its a helper class between entering choices and taking user input according to that and proving values to 
	 * model layer Product class.
	 */



	Scanner scanner=new Scanner(System.in);
	Products products;
	ProductsService productsService=new ProductsServiceImpl();
	MenuUtil menu=new MenuUtil();
	public void case1()
	{
		
		String id; 
		String name;
		double price;
		System.out.println("Enter Product Details to be saved");

		System.out.println("Enter id : ");
		id=scanner.next();
		System.out.println(" Enter name :");
		name=scanner.next();
		System.out.println("Enter price : ");
		price=scanner.nextInt();
		products=new Products(id,name,price);
		productsService.addProducts(products);
		menu.start();
	}
	
    public void case2()
    {
    	List<Products> list=new ArrayList<Products>();
		list=productsService.listProducts();
		for(Products p:list) {
			System.out.println(p);
		}
		menu.start();
    	
    }
    
    public void case3()
    {
    	String id; 
    	String name;
    	double price;
		System.out.println("Enter Product Details to be Updated");

		System.out.println("Enter id : ");
		id=scanner.next();
		System.out.println(" Enter name :");
		name=scanner.next();
		System.out.println("Enter price : ");
		price=scanner.nextInt();
		products=new Products(id,name,price);
		productsService.updateProducts(products);
		menu.start();
    }
    public void case4()
    {
    	String id; 
	
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter Product id where value will be deleted");
    	System.out.println("Enter id : ");
    	id=scanner.next();
    	products=new Products(id,null,0);
		productsService.deleteProducts(products);
    	menu.start();
    }
    
}
