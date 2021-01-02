package com.yash.products1.model;

public class Products {
	/*
	 * This products class is going to store data for product.
	 */
	String Id;
	String name;
	double price;
	public Products(String id, String name, double price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	

}
