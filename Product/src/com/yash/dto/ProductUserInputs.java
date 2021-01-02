package com.yash.dto;
import java.util.Scanner;

public class ProductUserInputs {
	int pId;String pCompanyName; String pModel;String dateOfPurchase;double pPrice;
	
	Scanner scanner=new Scanner(System.in);
	
		public void  productUserInput()
		{
				ProductUserInputs p=new ProductUserInputs();
				System.out.println("Enter Product ID =");
				p.pId=scanner.nextInt();
				
				
				
				System.out.println("Enter Procduct price =");
				p.pPrice=scanner.nextDouble();
				
				
		
				System.out.println("Enter product company name = ");
				p.pCompanyName=scanner.next();
		
				System.out.println("Enter product model =");
				p.pModel=scanner.next();
		
				System.out.println("Enter manufacturing date =");
				p.dateOfPurchase=scanner.next();
		
				
	
		}

		
}
