/*
 * 1. Display the sum of all numbers from 1 to 10
 */
package week1;

public class SumTo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaring the variables		
		int sum = 0; 
		
//For statement		
		for (int i = 1; i <= 10; i++) {
			sum  = sum + i;
		}
//Wrapping it up
		System.out.println("The total is: " +sum);

		}
}
