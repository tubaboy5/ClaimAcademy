package Demos;

public class priceComparison {

	public static void main(String[] args) {
		
		// Create an application that compares prices of a specific item. 
		// Use appropriate variables for: Item, Price, Competitor 1 Name and Price, Competitor 2 Name and Price. 
		// *Bonus: Output a message show the amount of savings against the competitor price 
		// Example: 
		// Comparing Prices for Laptop 
		// Our Store: $499 
		// Best Buy: $579 
		// *Save $80 
		// Amazon: $529 
		// *Save $30 		
		
		//Create Variables
		String item = "Laptop";
		Integer ourPrice = 499;
		String comp1Name = "Best Buy";
		Integer comp1Price = 579;
		String comp2Name = "Amazon";
		Integer comp2Price = 529;
		Integer comp1 = comp1Price - ourPrice;
		Integer comp2 = comp2Price - ourPrice;
		
		
		// Printing the message
		System.out.println("Comparing Prices for " + item + "");
		System.out.println("Our Store: $" + ourPrice + "");
		System.out.println("" + comp1Name + ": $" + comp1Price + "");
		System.out.println("You save $" + comp1 + " by shopping with us compared to " + comp1Name + "");
		System.out.println("" + comp2Name + ": $" + comp2Price + "");
		System.out.println("You save $" + comp2 + " by shopping with us compared to " + comp2Name + "");
	}
}
