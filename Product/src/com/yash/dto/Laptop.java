package com.yash.dto;
import com.yash.dao.*;


public class Laptop {
	
	int pId;
	String pCompanyName,pModel,dateOfPurchase;
	double pPrice;
	public Laptop(int pId,String pCompanyName, String pModel,String dateOfPuchase,double pPrice)
	{
		this.pId=pId;
		this.pCompanyName=pCompanyName;
		this.dateOfPurchase=dateOfPuchase;
		this.pModel=pModel;
		this.pPrice=pPrice;
	}
	
	
	
	public void productDetails()
	{
		Laptop laptop=new Laptop(2,"HP","Notebook","01/01/2017",40000.0);
		
		ProductUserInputs user=new ProductUserInputs();
		laptop.pId=user.productUserIntInput();
		
		String[] arrayString=new String[3];
		arrayString=user.productUserStringInput();
		
		laptop.pPrice=user.productUserDoubleInput();
		
		
		
	 laptop.pCompanyName=arrayString[0];
	laptop.pModel=arrayString[1];
	laptop.dateOfPurchase=arrayString[2];
	}
	

}
