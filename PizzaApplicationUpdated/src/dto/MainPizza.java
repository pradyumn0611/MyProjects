package dto;
import dao.*;


import java.util.Scanner;

public class MainPizza {
	
	//main method
	
	public static void main(String args[])
	{ 
		int pizzaPrice=0;
		Scanner sc=new Scanner(System.in);
	
	System.out.println(" ------------------------------------------");
	System.out.println("||||||||||:)WELCOME TO YASH PIZZA :)||||||||");
	System.out.println("||BEST PIZZA MAKERS IN THE TOWN SINCE 1996||)");
	System.out.println(" -------------------------------------------");
	System.out.print("Our Speciality : |Delux Veggie||Veg extravaganza||Idli Tandoori Paneer||Farmhouse||Peppy Paneer||Mexican Green Wave|");



	System.out.println("\n Enter No of Pizzas You wanna order =");
	int numOfOrders=sc.nextInt();


	for(int i=0;i<numOfOrders;i++)
	{		
		//array for return values form order pizza
		int pizzaArray[]=new int[3];
	
		//calling pizza order method for pizza details
	ProcessPizzaOrder ppo=new ProcessPizzaOrder();
	pizzaArray=ppo.pizzaOrder();
	
		



		//returned array values
		int pizzaNumber=pizzaArray[0];
		int pizzaSize=pizzaArray[1];
		int pizzaCrust=pizzaArray[2];


	//	velidating details with validSelections method
		ppo.validSelections(pizzaNumber,pizzaSize,pizzaCrust);


		//default toppings
		ppo.defaultOptions();


		//change toppings if you need
		ppo.customiseOptions();

		//selection of topping type
		System.out.println("Press (D :Default toppings/C :Customise)");
		String toppingType=sc.next();

		//getting pizzaToppingPrice that you chose
		int pizzaToppingPrice=ppo.pizzaToppingType(toppingType);

		int pizzaNameSizePrice=ppo.pizzaNameSize(pizzaNumber,pizzaSize);
		int crustPrice=ppo.crust(pizzaCrust);
		pizzaPrice=pizzaPrice+ppo.bill(pizzaNameSizePrice, crustPrice, pizzaToppingPrice);
	}
	

	System.out.println("You Order Ammount is  Rs."+pizzaPrice+" \\-");
	}
	//method for pizza order details filled by the user
}