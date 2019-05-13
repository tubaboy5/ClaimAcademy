package week1;
	/*
	 * 5. Display the average of numbers from 5 to 10
	 * Method:  Add numbers between 5 - 10.  
	 * 			Divide by number of integers (6)
	 * 			Take that number and print out the numbers that are higher
	 */
public class AboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double sum = 0;
	
	    for(int i = 5; i <= 10; i++)
	    {
	            sum = sum + i;
	    		
	        }
	    double total = sum / 6;
	    
	    System.out.println("Average of the numbers between 5 and 10 is: " +total +".");
	    System.out.print("The only numbers above the average are: ");
	    for(double i = total; i <= 10; i++)
	    
	    	System.out.print(Math.round(i) +" ");
	    System.out.print(".");

	    }
	
	       
	}


