/*
 * you have to give someone change 
what coins do you give that person? 

Requirements: 
takes user input 
displays the change breakdown as output

2. Determine Input and Output 

Typed input by user: amount of change requested (an integer between 1 and 99) 

Printed output:  

Number of quarters given  

Number of dimes given  

Number of nickels given  

Number of pennies given

CONDITIONS: input is cents (1-99)

 */
package week1;
import java.util.Scanner;
public class ChangeGiven {

 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount of change (in cents): "); 
		int amount = input.nextInt();
		int remainingAmount = (amount);
			
		// Find the number of quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
			
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
			
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
			
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
			
		// Display results
		System.out.println("Your change of " + amount + " cents consists of: ");
		System.out.println(numberOfQuarters +" quarters");
		System.out.println(numberOfDimes +" dimes");
		System.out.println(numberOfNickels +" nickels");
		System.out.println(numberOfPennies +" pennies");
				
		
	}
}