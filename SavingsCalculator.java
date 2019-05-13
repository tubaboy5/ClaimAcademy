/*
Savings Calculator

Write a function that returns the anticipated future value based on an account’s 
present value, interest rate, and time. 
The formula for simple future value is: FV = PV * [1 + (rate x time) ] 
(Note that rate is given in %; you will need to covert to the 
decimal). 

savings(20000, 4.5, 15)
RESULT:    33500 
 */

package Demos;

public class SavingsCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Define the variables
		double presentValue = 20000;
		double interestRate = .045;
		double interestPercent = interestRate * 100;
		double time = 15;
		
	//Run the math
		double futureValue = presentValue * (1 + (interestRate * time));
		
	//Run the program
		System.out.println("If you currently have $" + presentValue + " in savings, at " + interestPercent + "% interest, you will have $" + futureValue + " in " + time + " months.");
	}

}
