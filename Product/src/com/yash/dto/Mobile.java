package com.yash.dto;
import com.yash.dao.*;

public class Mobile implements IProducts {
	int pId;
	String pCompanyName,pModel,pMfd;
	double pPrice;
	public Mobile(int pId,String pCompanyName, String pModel,String dateOfPuchase,double pPrice)
	{
		this.pId=pId;
		this.pCompanyName=pCompanyName;
		this.pMfd=dateOfPuchase;
		this.pModel=pModel;
		this.pPrice=pPrice;
	}
	
	public void productDetails()
	{
		Mobile mobile=new Mobile(1,"Xiomi","Redmi note 7 pro","01/01/2020",13999.0);
		ProductUserInputs user=new ProductUserInputs();
		
	
	}
	
}
