package com.yash.products1.util;
import java.util.Scanner;
import java.util.function.IntConsumer;
import com.yash.products1.daoImpl.*;
import com.yash.products1.model.Products;

public class MenuUtil {
	/*
	 * class for getting choice of operation user wants to perform.
	 */

	
	
		public void start()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choice 1.SAVE 2.DISPLAY 3.UPDATE 4.delete 5.EXIT");
			int choice= sc.nextInt();
			MenuUtilImpl menuUtilImpl=new MenuUtilImpl();
			switch(choice)
			{ 
			case 1:
				menuUtilImpl.case1();
				break;
				
			case 2:
				menuUtilImpl.case2();
				break;
			
			case 3:
				menuUtilImpl.case3();
				break;
				
			case 4:
				menuUtilImpl.case4();
				break;
			case 5:
				System.exit(0);
			}
		}
}
