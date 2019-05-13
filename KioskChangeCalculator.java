/*
Kiosk Change Calculator 
A retail store is building a kiosk to enter sales and handle transactions. When 
people use cash to pay for an item, the kiosk needs to tell the cashier how much 
change should be given back to the customer. 
You are developing a simple calculator that will compute the right amount and most 
efficient denominations of change for a specific purchase. 

returnChange(18, 17.18)
RESULT:    Quarters: 3 
  Dimes: 0 
  Nickels: 1 
  Pennies: 2
 */

package Demos;

public class KioskChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the variables
		double cashGiven = 18;
		double purchaseTotal = 17.56;
		
		change(cashGiven, purchaseTotal);
	}
	public static void change(double cashGiven, double purchaseTotal) {
		
		double quarter = .25;
		double dime = .10;
		double nickel = .05;
		double penny = .01;
		double changeRecieved = ((cashGiven * 100) - (purchaseTotal * 100));
		//double changeRecieved = Math.round((cashGiven * 100) - (purchaseTotal * 100));
		int changeInt = (int)changeRecieved;
		int numberQuarters = 0;
		int numberDimes = 0;
		int numberNickels = 0;
		int numberPennies = 0;
		System.out.println(+changeRecieved);
/*
82/25 = 3 quarters
82 - 3*25 = 7
7/10 = 0 
82 - 3*25 - 0*10 = 7
7/5 = 1
82 - 3*25 - 0*10 - 5*1 = 2
2 = pennies		
 */
		

		
	// Make change
		System.out.println("If you are given $" + cashGiven + " for at transaction total of $" + purchaseTotal + ", you will recieve " + changeInt + " cents back in change.");
		System.out.println("That will end up being:");
			numberQuarters = changeInt/25;
			System.out.println("Quarters: "+ numberQuarters);
			changeInt = changeInt % 25;
			
			numberDimes = changeInt / 10;
			System.out.println("Dimes: "+ numberDimes);
			changeInt = changeInt % 10;
			
			numberNickels = changeInt / 5;
			System.out.println("Nickels: " + numberNickels);
			changeInt = changeInt % 5;
			
			numberPennies = changeInt;
			System.out.println("Pennies " + numberPennies);
			
		}
			
		
	}

