package week1;
/*
 * 4. Display the average of numbers from 5 to 10
 * Method:  Add numbers between 5 - 10.  
 * 			Divide by number of integers (6)
 */
public class AverageNumbersBetween5And10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double sum = 0;
	
	    for(int i = 5; i <= 10; i++)
	    {
	            sum = sum + i;
	    		
	        }
	    double total = sum / 6;
	    System.out.println("Average of the numbers between 5 and 10 is: " +total +".");
	    }
	       
	}


