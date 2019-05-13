package week1;
/*
 * 6. Write a program which takes following input : 
a) Investment Amount
b) Yearly interest rate 
c) number of years
Calculate the simple interest.
Simple Interest is: Total Amount = Principal(1 + (rate of interest * time))
 */

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("How much do you have to invest?");
		double investment = sc.nextDouble();
		System.out.println("What is the interest rate?");
		double interestRate = sc.nextDouble();
		System.out.println("How long are you going to keep it invested?");
		double investmentTime = sc.nextDouble();
		
// Doing the math (remember interest rate needs to be divided by 100 since it's a percent)
		double total = investment * (1 + ((interestRate/100) * investmentTime));
		
//Putting it all together		
		System.out.println("If you currently have $" + investment + " to invest, at " + interestRate + "% interest, you will have $" + total + " in " +investmentTime + " years.");
		
	}
	
}
