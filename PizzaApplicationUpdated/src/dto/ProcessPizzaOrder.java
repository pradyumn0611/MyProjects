package dto;
import dao.*;
import java.util.Scanner;

public class ProcessPizzaOrder implements IConstantsPizza {
	Scanner sc=new Scanner(System.in);

		
			ProcessPizzaOrder ppo=new ProcessPizzaOrder();
					public  int[] pizzaOrder()

			{ 
				int pizzaOrderArray[]=new int[3];
				
				System.out.println("PIZZAS AVAILABLE FOR ORDER :"); 
				System.out.print("1.delux veggie  2.veg extravaganza  3.idli tandoori paneer  4.farmhouse  5.peppy paneer  6.mexican green wave  ");
				System.out.println("Enter Pizza  for order: (reply in numbers)");
				int pizzaNumber=sc.nextInt();


				System.out.println("Enter pizza size: 1.Regular 2.Medium 3,Large");
				System.out.println("\nEnter Pizza SizeNumber for order:(reply in numbers) ");
				System.out.println("Enter size of pizza : ");
				int pizzaSize=sc.nextInt();

				System.out.println("1.new hand tosted 2.cheese burst 3.fresh pan pizza 4.classic hand tosted 5.wheat thin crust");
				System.out.println("\nEnter Pizza Crust Number for order: (reply in numbers)");
				System.out.println("Enter the crust:");
				int pizzaCrust=sc.nextInt();
				pizzaOrderArray[0]=pizzaNumber;
				pizzaOrderArray[1]=pizzaSize;
				pizzaOrderArray[2]=pizzaCrust;
				return pizzaOrderArray;
			}

			
			public  void defaultOptions() {
				System.out.println(" ---------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n\nDefault Toppings : \n\nDelux Vegie          : |  Onion  |  Capsicum  |  Grilled Mushroom  |  Corn  |  Paneer  |                                    |");
				System.out.println("\nVeg Extravaganza     : |  Black Olives  |  Capsicum  |  Onions  |  Grilled Mushroom  |  Corn  |"
						+ "  \n Tommato  |  Jalapeno  |  Extra Cheese  |");
				System.out.println("\nIdli Tandoori Paneer : |  Capsicum  |  red pepranda  |  mint mayo  |    ");
				System.out.println("\nFarmhouse            : |  Onion  | Capsicum | Tommato | Grilled Mushroom  |  ");
				System.out.println("\nPeppy Paneer         : | Juicy Paneer | Crisp Capsicum | Spicy Red Peprenka |  ");
				System.out.println("\nMexican Green Wave   : |Mexican herbs|Onion|Capsicum|  Tommato | Jalapeno | ");
				System.out.println(" ------------------------------------------------------------------------------------------------------------------");
			}

			//customise topping options
			
			public  void customiseOptions()
			{	System.out.println(" ------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n\n VEG TOPPINGS = \n\n|jalapeno | black olives | onion |red peparenka |fresh tommato|golden corn|"
					+ "\n|crisp capsicum|paneer|grilled mashroom|paneer tikkka");
			System.out.println(" ------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n\n NON VEGTOPPINGS= \n\npepper barbeque chiken|peri peri chiken|grilled  |chicken rasher|"
					+ "\n|chicken sausage|chicken tikka|checken keema\n\n");
			System.out.println(" ------------------------------------------------------------------------------------------------------------------");
			}

			
			public void validSelections(int pizzaNumber,int pizzaSize,int pizzaCrust)
			{
				if(pizzaNumber<1||pizzaNumber>6||pizzaSize<1||pizzaSize>3||pizzaCrust<1||pizzaCrust>5)
				{ 
					System.out.println("Invalid pizza , size  , crust or topping type. Please try again");
					System.exit(0);
				}
				if((pizzaNumber==5 && pizzaSize==2)||(pizzaNumber==5 && pizzaSize==3))
				{
					System.out.println("Selected Pizza Unavailable . Please Try Again");
					System.exit(0);
				}
			}

			//method to show user the default pizza toppings 


			//type : default or custom topping
			
			public int pizzaToppingType(char type)
			{int pizzaToppingPrice=0;
				if(type!='D'||type !='C')
				{
					System.out.println("INVALID SELECTION OF TOPPING TYPE. TRY AGAIN");
					System.exit(0);
				}
				else if(type=='C')
				{
					ppo.pizzaCustomiseToppings();
					return pizzaToppingPrice;
				}
				return pizzaToppingPrice;
				
			}

			//custom selection of order
			
			public int pizzaCustomiseToppings()
			{
				
				System.out.println("press(V/N) for (veg/non veg)Toppings");
				String vegNonVeg=sc.next();
				int pizzaToppingPrice=0;
				if(vegNonVeg.equalsIgnoreCase("V"))
				{
					pizzaToppingPrice=ppo.pizzaCustomiseVegToppings();
					
				}
				else if(vegNonVeg.equalsIgnoreCase("N"))
				{	
					pizzaToppingPrice=ppo.pizzaCustomiseNonVegToppings();
					
				}
				else
				{
					System.out.println("Invalid Selection.Please TRy again");
					System.exit(0);
				}
				return pizzaToppingPrice;
			}

			//method for customised pizza toppings
			
			public int pizzaCustomiseVegToppings()
			{
				Scanner sc= new Scanner(System.in);
				int pizzaToppingPrice=0;
				System.out.println("Veg Toppings : @ Rs.60 each & at max 3 selections");
				System.out.println("Enter no of toppings you need");
				
				int vegToppingNum=sc.nextInt();
				
				String[] toppingsArray=new String[vegToppingNum];
				
				if(vegToppingNum>0 && vegToppingNum<=3)
				{
					for(int i=0;i<vegToppingNum;i++)
					{
						System.out.println("1.Jalapeno 2.Black olives 3.onion 4.Fresh tommato 5.Red pepranka"
								+ "\n 6.Golden corn 7.crisp capsicum 8.paneer 9.Grilled masheroom 10.paneer tikka");
						System.out.println("Enter topping number: ");
						toppingsArray[i]=sc.next();

					}
					pizzaToppingPrice=vegToppingNum*60;
				}
				return pizzaToppingPrice;

			}

			//method for non veg custom pizzas
			
			public int pizzaCustomiseNonVegToppings()
			{	int pizzaToppingPrice=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Veg Toppings : @ Rs.75 each & at max 3 selections");

				System.out.println("Enter no of toppings you need");
				int nonVegToppingNum=sc.nextInt();

				String[] toppingsArray=new String[nonVegToppingNum];
				if(nonVegToppingNum>0 && nonVegToppingNum<=3)
				{for(int i=0;i<nonVegToppingNum;i++)
				{

					System.out.println("Enter 1.panner barbeque 2.chicken 3.peri peri chiken 4.grilled chiken rasher"
							+ "\n 5.chicken sausage 6.chikken tikka 7.chicken peparoni 8.chicken keema");
					System.out.println("Enter topping number: ");

					toppingsArray[i]=sc.next();

				}
				pizzaToppingPrice=nonVegToppingNum*75;

				}
				return pizzaToppingPrice;

			}
			//method returns bill price per iteration
			public int bill(int basePrice,int crustPrice,int toppingPrice)
			{
				return basePrice+crustPrice+toppingPrice;	
			}


			//method for getting price of perticulat name size of pizza
			
			public int pizzaNameSize(int pizzaNumber,int pizzaSize)
			{
				int priceNameSize=0;
				if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==1))
				{
					priceNameSize=DELUX_IDLI_VEG_REGULAR;

				}
				else if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==2)) 
				{
					priceNameSize=DELUX_IDLI_VEG_MEDIUM;
				}
				else if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==3)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==3)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==3))
				{

					priceNameSize=DELUX_IDLI_VEG_LARGE;


				}

				else if(
						(PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==1))//215
				{
					priceNameSize=FARMHOUSE_MEXICAN_RAGULAR;

				}
				else if((PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==2))//395
				{
					priceNameSize= FARMHOUSE_MEXICAN_MEDIUM;

				}
				else if(
						(PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==3)||
						(PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==3))
				{
					priceNameSize=FARMHOUSE_MEXICAN_LARGE;
				}//595
				else if(
						(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==1))//335
				{
					priceNameSize= PEPPY_RAGULAR;
				}
				return priceNameSize;
			}


			//method for getting price of a particular crust

			
			public int crust(int pizzaCrust)
			{
				int crustPrice=0;
				if( CRUSTS[pizzaCrust].equalsIgnoreCase("new hand tosted") || CRUSTS[pizzaCrust].equalsIgnoreCase("classic hand tosted") )
				{
					crustPrice=NEW_HAND_CLASSIC_CRUST;
				}
				if(CRUSTS[pizzaCrust].equalsIgnoreCase("cheese brust"))
				{
					crustPrice=CHEESE_CRUST;
				}

				if(CRUSTS[pizzaCrust].equalsIgnoreCase("fresh pain pizza"))
				{
					crustPrice=FRESH_CRUST;
				}
				if(CRUSTS[pizzaCrust].equalsIgnoreCase("wheat thin crust"))
				{
					crustPrice=WHEAT_CRUST;
				}
				return crustPrice;


			}



	}



