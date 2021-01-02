package com.yash.dto;
import com.yash.dao.*;

public class Tv {
	int pId;
	String pCompanyName,pModel,dateOfPurchase;
	double pPrice;
	public Tv(int pId,String pCompanyName, String pModel,String dateOfPuchase,double pPrice)
	{
		this.pId=pId;
		this.pCompanyName=pCompanyName;
		this.dateOfPurchase=dateOfPuchase;
		this.pModel=pModel;
		this.pPrice=pPrice;
	}

	public void productDetails()
	{
		Tv tv=new Tv(3,"SONY","Bravia","10/10/2020",50000.87);
		ProductUserInputs user=new ProductUserInputs();
		tv.pId=user.productUserIntInput();
		
		String[] arrayString=new String[3];
		arrayString=user.productUserStringInput();

		tv.pPrice=user.productUserDoubleInput();

		

		tv.pCompanyName=arrayString[0];
		tv.pModel=arrayString[1];
		tv.dateOfPurchase=arrayString[2];
	}


}
