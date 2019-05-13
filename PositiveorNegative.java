package Demos;

public class PositiveorNegative {
	public static void main(String[] args) {
		
// Positive or Negative Number
// Write an IF statement to determine if a number is positive or negative. 
// INPUT:     -7 
// RESULT:    Negative 
	
		
//Define the variables
		Integer number = -7;
		
//Run the Program
		System.out.println("INPUT: " + number + "");
		if(number < 0) {
			System.out.println("Result: Negative");
		}
		else {
			System.out.println("Result: Positive");
		}
	
}
}