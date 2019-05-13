//Given a time in 12-hour AM/PM Format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//Function Description
//Complete the timeConversion function which takes 1 argument, a string s and returns a string denoting the 24-hr formatted time.
//Raw Input Format
//A single string s containing a time in 12-hour clock format (i.e.hh:mm:ssAM or hh:mm:ssPM ), where 01<= hh <= 12 and 00<=mm, ss<=59 .


package oldPrograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion 
{

	public static void main(String[] args) 
	{
		{
			System.out.println("Enter a time to conver to military time (Hours:Minutes AM/PM): ");
			Scanner input = new Scanner(System.in);
			 String inputTime = input.nextLine();
		      //Format of the date defined in the input String
		      DateFormat df = new SimpleDateFormat("hh:mm aa");
		      //Desired format: 24 hour format: Change the pattern as per the need
		      DateFormat outputformat = new SimpleDateFormat("HH:mm");
		      Date date = null;
		      String output = null;
		      try{
		         //Converting the input String to Date
		    	 date= df.parse(inputTime);
		         //Changing the format of date and storing it in String
		    	 output = outputformat.format(date);
		         //Displaying the date
		    	 System.out.println(output);
		      }catch(ParseException pe){
		         pe.printStackTrace();
		       }
		   }

	}

}
