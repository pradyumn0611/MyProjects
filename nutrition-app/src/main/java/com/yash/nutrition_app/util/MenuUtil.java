package com.yash.nutrition_app.util;

import java.util.Scanner;

import com.yash.nutrition_app.helper.WeightLogCases;
/*
 * This the Menu section of your weightlog module.
 * Depending on user choice Save , Display , Delete ,Update functionalities are provided.
 * Provided Utility of Menu of WeightLog Module.
 */

public class MenuUtil {
	/**
	 * Start Method : This Method will get  User to the Menu for your console based application.
	 */
	public void start() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter Choice :\n 1.SAVE 2.DISPLAY 3.UPDATE 4.delete 5.EXIT");
		int choice= sc.nextInt();
		WeightLogCases helper=new WeightLogCases();
		/**
		 * switch will give user to take any of the given values.
		 * And which let user do the many different things. 
		 */
		switch(choice)
		{ 
		case 1:
			helper.case1();
			break;
			
		case 2:
			helper.case2();
			break;
		
		case 3:
			helper.case3();
			break;
			
		case 4:
			helper.case4();
			break;
		case 5:
			System.out.println(" Thank You For Using WeightLog");
			System.exit(0);
		
		}
		System.out.println("1. continue  2.exit");
		int num=sc.nextInt();
		if( num==1)
		{
			start();
		}
		else
		{
			System.exit(0);
		}
	}

}
