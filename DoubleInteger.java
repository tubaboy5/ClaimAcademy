package week1;
/*
4. Write a method to prompt the user for a double then display the value as a whole number. 
Example: user enter "15.8" result is:  "You entered 15.8, the new value is 16".
Example: user enter "15.4" result is:  "You entered 15.4, the new value is 15".

Hint: Use Math round() method.
 */
import java.util.Scanner;
public class DoubleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter any decimal number: ");
		double input = userInput.nextDouble();
		System.out.println("You entered \"" +input +"\", the new value is " +Math.round(input) +".");
	}
	

}
