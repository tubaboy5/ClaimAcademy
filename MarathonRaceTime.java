package Demos;

public class MarathonRaceTime {
	
	public static void main(String[] args) {

	// Marathon Race Time 
	// In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in the men’s 26.2-mile marathon race. The official timer tracked his race at 7724 seconds. 
	// What is his time in hours, minutes, and seconds? 
	// RESULT:    2hrs:8mins:44secs 
	//  Bonus: What was his average pace per mile in minutes? 
	// RESULT:    Average pace: 4.885 minutes per mile

// Setting the variables
	Integer totalSeconds = 7724;
	Integer totalMinutes = totalSeconds / 60;
	Integer raceHours = totalMinutes / 60;
	Integer raceMinutes = totalMinutes - raceHours * 60;
	Integer raceSeconds = totalSeconds - raceHours * 3600 - raceMinutes * 60;
	Double secondsPerMile = totalSeconds / 26.2;
	Double minutesPerMile = secondsPerMile / 60;
	
	
// Running the program
	System.out.println("In 2016 Eliud Kipchonge ran the Olympic Marathon in " + raceHours + "hrs:" + raceMinutes + "mins:" + raceSeconds + "secs");
	System.out.println("His average pace was " + minutesPerMile + " miles per minute");
	
}}