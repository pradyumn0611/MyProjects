package com.yash.main;
import com.yash.dto.*;
import com.yash.exceptions.InvalidNumberException;
import com.yash.exceptions.NotIntegerException;
import com.yash.dao.*;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Product Details 1.Mobile 2.Laptop 3.Tv");
try
	{
	int num=sc.nextInt();
	if(num!=1||num!=2||num!=3)
		{
			throw new InvalidNumberException();
		}
		

		switch(num)
		
			{
			case 1:
				
				Mobile mobile=new Mobile();
				mobile.productDetails();
				break;
				
			case 2:
				Laptop laptop=new Laptop();
				laptop.productDetails();
				break;
				
			case 3:
				Tv tv=new Tv();
				tv.productDetails();
				
			default:
				System.out.println("THank you");
			
			}
	}
	catch(InvalidNumberException e)
	{
		System.out.println(e.getMessage());
	}
		
		


}
}