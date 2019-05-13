package Demos;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Salary Calculator

//Find the annual income of a worker whose hourly rate is $37. You can assume that they work an average of 40 hours each week and take 3 weeks of vacation.

//Example:
//rate = 37
//Result: $72520

//annual salary = hourly salary * hours worked per week * number of weeks worked
		
//Define the Variables		
		double hourlyRate = 37;
		int hoursInWeek = 40;
		int weeksVacation = 3;
		int weeksInYear = 52;
		
//Perform calculations		
		int weeksWorked = weeksInYear - weeksVacation;
		double annualIncome = hourlyRate * hoursInWeek * weeksWorked;
		
// Execute the Program
		System.out.println("If you make $" + hourlyRate + " an hour and work " + weeksWorked + " weeks a year, then your annual salary will be $" + annualIncome + "");
	}

}
