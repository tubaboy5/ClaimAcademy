package Demos;

public class EvenOrOdd {

// Even or Odd Number
// Write an IF statement to determine if a number is even or odd. 
// INPUT:     242 
// RESULT:    Even 
	
	public static void main(String[] args) {

// Define the variables
		Integer number = 241;
		
// Run the program
		System.out.println("INPUT: " + number + "");
		if (number % 2 == 0) {
			System.out.println("That number is even.");
		}else {
				System.out.println("That number is odd");
			}
			
		}
}
