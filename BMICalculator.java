package week1;
/*
 * 5. Take user input for height and weight and calculate his BMI
 * NOTE: BMI is weight (in kilograms) over your height squared (in centimeters).
 * Convert everything to pounds and inches
 * 1 kg = 2.205 lbs
 * 1 inch = 2.54 centimeters 
 */

import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("How much do you weigh (in pounds)?");
		double weightPounds = sc.nextDouble();
		System.out.println("How tall are you (in inches)?");
		double heightInches = sc.nextDouble();

//Converting to kilograms and centimeters		
		double weightKg = weightPounds/2.205;
		double heightCm = heightInches*2.54;
		
//Calculating BMI
		double BMI = (weightKg/(heightCm*heightCm)*10000);
		
		
		
//Putting it all together
		System.out.println("If you are " +weightPounds +" pounds, and are " +heightInches +" inches tall, then your BMI is: " +Math.round(BMI) +".");
		
		
		
		if (BMI < 18.5) {
			System.out.println("You are under weight");
		}
		else if (BMI <= 24.9) {
			System.out.println("You are within a normal weight range");
		}	
		else if (BMI <= 29.9) {
				System.out.println("You are over weight");	
		}
		else {
			System.out.println("You are obese.");
	}

}
}