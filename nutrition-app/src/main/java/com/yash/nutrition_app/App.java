package com.yash.nutrition_app;


import com.yash.nutrition_app.util.MenuUtil;
/**
 * Its the Gateway for your NutritionApp's WeightLog Module.
 * Running of Weighlog Will Begin from here.
 * @author pradyumn
 *
 */
public class App 
{
	/**
	 * 
	 * Weighlog module's execution method is defined here.
	 */
    public static void main( String[] args ) 
    {
    	System.out.println("\n{ NUTRITION APP :  WEIGHTLOG }\n");
        MenuUtil menu=new MenuUtil();
        menu.start();
    }
}
