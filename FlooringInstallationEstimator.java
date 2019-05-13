/*
Floor Installation Estimator

You are part of a flooring & installation company. They have developed a simple formula to determine the cost of installation based on the square footage of the room and the type of flooring installed (carped, hardwood, laminate, etc).

The cost breakdown is as follows:

Base Rate: $3.00 per sq ft
Carpet: + $.50 per sq ft
Hardwood: +$1.50 per sq ft and $100 hardware fee
If the square feet is over 1500, then apply a 10% discount

As the developer, you need to write a function that received the square feet and floor type as a parameter and then perform your calculation with those inputs.  Then your program would return a quote that you could display to your customer.

Example:

squareFeet = 645
flooringType = "hardwood"

Result: 3002.5	
*/

package Demos;

public class FlooringInstallationEstimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int squareFeet = 2000;
		String floorType = "Hardwood";
		
	// Call the getQoute function	
		double quote = getQuote(squareFeet, floorType);	
		System.out.println("Your qoute is: $" + quote);
		
	}

	// Define the qoute funtcion
	// Parameters: square feet, floor type
	private static double getQuote(int squareFeet, String floorType) {
		System.out.println("QOUTE FUNCTION: ");
		System.out.println("Square Feet: " + squareFeet);
		System.out.println("Flooring Type: " + floorType);
		
	// Define the Variables
		double baseRate = 3;
		double carpetRate = .5;
		double hardwoodRate = 1.5;
		double hardwoodHardwareFee = 100;
		double totalRate = 0;
		double totalCost = 0;
		
	// Determine the floor type and rate
		if (floorType == "Carpet") {
			totalRate = baseRate + carpetRate;
		}
		else if (floorType == "Hardwood") {
			totalRate = baseRate + hardwoodRate;
			totalCost = totalCost + hardwoodHardwareFee;
		}
		else {
			System.out.println("ERROR: That isn't a recognized floor type.");
		}
		
	// Calculate the total cost
		System.out.println("Total Rate: " + totalRate);
		totalCost = totalCost + totalRate * squareFeet;
	
		
	// Apply any discounts
		if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			totalCost = totalCost - discount;
			System.out.println("DISCOUNT: $" + discount);
		}
		System.out.println("The total cost will be: $" + totalCost);
		
	// Add return statement
		return totalCost; 
	}
	}
	

