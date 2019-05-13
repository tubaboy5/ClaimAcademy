package Demos;

public class WeekDay {

	public static void main(String[] args) {
		
// Week Day
// Convert a numeric day of the week to the weekday, with the first day of the week being Sunday 
// Make a provision for an invalid weekday number. 
// INPUT:     5 
// RESULT:    Thursday 		
	
// Define the variable
		Integer number = 5;
		
// Run the program
		System.out.println("INPUT: " + number + "");
		if (number <=0)
		{
			System.out.print("Result: That is an invalid number.");
		}
		else if (number > 7)
		{
			System.out.print("Result: That is an invalid number.");
		}
		else if (number == 1)
		{
			System.out.print("Result: Sunday");
		}
		else if (number == 2)
		{
			System.out.print("Result: Monday");
		}
		else if (number == 3)
		{
			System.out.print("Result: Tuesday");
		}
		else if (number == 4)
		{
			System.out.print("Result: Wednesday");
		}
		else if (number == 5)
		{
			System.out.print("Result: Thursday");
		}
		else if (number == 6)
		{
			System.out.print("Result: Friday");
		}
		else if (number == 7)
		{
			System.out.print("Result: Saturday");
		}
	}
}
