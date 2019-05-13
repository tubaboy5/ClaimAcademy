package Demos;

public class WeatherWarningMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Weather Warning Message
//You are helping develop a Weather app that displays the current temperature and any appropriate warning message.

//The data comes to you in degrees C, and you need to convert to print in degrees F.  

//The conversion formula is: F = (C * 9/5) + 32

//If the temperature is below freezing (32F), print an additional message "WARNING: FREEZING TEMPERATURES"

//If the temperature is above 105, print an additional message "WARNING: HEAT ADVISORY"

//Example:
//c = -5
//RESULT: 23F
//WARNING: FREEZING TEMPURATURES
		

//Convert temperature from C to F
		double degreesC = 35;
		double degreesF = (degreesC * 9/5) + 32;

		
//Print the temperature in F
		System.out.println("The current temperature is: " + degreesF + "F");
		
//Display any warnings that may be necessary
		if (degreesF < 32) {
			System.out.println("WARNING: FREEZING TEMPERATURES");
		}
		else if (degreesF > 105) {
			System.out.println("WARNING: HEAT ADVISORY");
		}
		else {
			System.out.println("Looking good out there!");
		}
	}

}
