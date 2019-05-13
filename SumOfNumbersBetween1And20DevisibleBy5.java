/*
 * 2. Display sum of all numbers from 1 to 20 that are divisible by 5
 * NOTES: Numbers divisible by 5: 5, 10, 15, 20
 * NOTES: Sum of 5, 10, 15, 20 is 50
 */
package week1;

public class SumOfNumbersBetween1And20DevisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the variables		
	    int sum = 0;
	    for(int i = 1; i <= 20; i++)
	    {
	        if(i%5 == 0)
	        {
	            sum = sum + i;
	        }
	    }
	        System.out.println("Sum : " + sum);  
	}	
	}
	
