package dao;

public interface IConstantsPizza {
	//constants for pizza name and size //they are by default public static final
		int DELUX_IDLI_VEG_REGULAR=235;
		int DELUX_IDLI_VEG_MEDIUM=450;
		int DELUX_IDLI_VEG_LARGE=695;
		int FARMHOUSE_MEXICAN_RAGULAR=215;
		int PEPPY_RAGULAR=335;
		int FARMHOUSE_MEXICAN_MEDIUM=395;
		int FARMHOUSE_MEXICAN_LARGE=595;
		//constants for pizza crusts
		int NEW_HAND_CLASSIC_CRUST=215;
		int CHEESE_CRUST=290;
		int FRESH_CRUST=245;
		int WHEAT_CRUST=500;
		int VEG_TOPPING=60;
		int NON_VEG_TOPPING=75;


		// constant array of all varieties of pizza
		String[] PIZZAS= {" ","delux veggie","veg extravaganza","idli tandoori paneer","farmhouse","peppy paneer","mexican green wave"};
		//constant array of all varieties of crusts
		 String[] CRUSTS= {" ","new hand tosted","cheese burst","fresh pan pizza","classic hand tosted","wheat thin crust"};
		//constant array of all varieties of veg toppings
		 String[] VEGTOPPINGS= {" ","jalapeno","black olives","onion","red peparenka","fresh tommato",
				"golden corn","crisp capsicum","paneer","grilled mashroom","paneer tikka"};
		//constant array of all varieities of non veg toppings
		 String[] NONVEGTOPPINGS= {" ","pepper barbeque chiken","peri peri chiken","grilled chiken rasher",
				"chicken sausage","chicken tikka","checken keema"};


}
