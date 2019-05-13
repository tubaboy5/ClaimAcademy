package week1;
/*
 * 3. Write a program to count all the vowels in a string.
E.g Input: banana
Output:3

Methodology:
Have users input a string.
Check characters to see if they are a vowel (a,e,i,o,u)
Print number of vowels in word.

 */
import java.util.Scanner;
public class NumberOfVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check how many vowels it has: ");
		String vowels = sc.nextLine();
		int vowelTotal = 0;
		
		for(int i=0;i <vowels.length();i++)
		{
            if((vowels.charAt(i) == 'a') || 
                (vowels.charAt(i) == 'e')  ||
                (vowels.charAt(i) == 'i') || 
                (vowels.charAt(i) == 'o') ||
                (vowels.charAt(i) == 'u') ||
            	(vowels.charAt(i) == 'A') ||
            	(vowels.charAt(i) == 'E') ||
            	(vowels.charAt(i) == 'I') ||
            	(vowels.charAt(i) == 'O') ||
            	(vowels.charAt(i) == 'U'))
            {
                vowelTotal = vowelTotal + 1;    
            }

}
		System.out.println("The word \"" +vowels +"\" has " +vowelTotal +" vowels.");
	}
}
