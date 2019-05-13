/*
Tip Recommender
Write a function that returns the recommended tip based on the amount of the tab 
and the service performed. 
Use the following table to calculate the tip: 
Service Quality - Tip Percent 
Poor            - 16% 
Good            - 22% 
Great           - 26% 

computeTip(33.57, "Great")
RESULT:    8.7282 
 */

package Demos;

public class TipRecommender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double checkTotal = 33.57;
		String serviceQuality = "great";
		
	
		// Call the tipTotal function
		tip(checkTotal, serviceQuality);
	
	}
	//Parameters: checkTotal, serviceQuality
	private static void tip(double checkTotal, String serviceQuality) {
		System.out.println("Your bill was $" + checkTotal + ", and your service was " + serviceQuality + ".");
		
		//Define the variables
		double poorService = .16;
		double goodService = .22;
		double greatService = .26;
		double tipTotal;
		
		// Determine service level
		if (serviceQuality == "great") {
			tipTotal = checkTotal * greatService;
			System.out.println("That means you should leave a $"+ tipTotal + " tip");
		}
		else if (serviceQuality == "good") {
			tipTotal = checkTotal * goodService;
			System.out.println("That means you should leave a $"+ tipTotal + " tip");
		}
		else if (serviceQuality == "poor") {
			tipTotal = checkTotal * poorService;
			System.out.println("That means you should leave a $"+ tipTotal + " tip");
		}
		else {
			System.out.println("That isn't a recognized level of service");
		}
		// Calculate the tip
	
	}
}

