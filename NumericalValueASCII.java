package week1;
/*
// * 3. Write a method to prompt the user for a letter of the alphabet and display it's numerical value(ASCII). Hint: Cast the char to int.
 */
import java.util.Scanner;
public class NumericalValueASCII {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Input character 		
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your letter? ");
		char input = reader.findInLine("[a-zA-Z]").charAt(0);


// ASCII codes
		int castAscii = (int) input;
		
		
// Output
		System.out.println("The character \"" +input +"\" is " +castAscii +" in ASCII.");
		}		

}
