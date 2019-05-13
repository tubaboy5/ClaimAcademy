package week1;
/*
 * 2. Write a program to determine if a string is a palindrome. 
 * (Palindromes are words which read the same forwards and backwards) 
 * Eg: radar, level, noon
 */
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a Palindrome: ");
		System.out.println("TIP: Palindromes are words which read the same forwards and backwards)");
		System.out.println("Example: radar, level, noon");
		String original = sc.nextLine();
		
		 int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      System.out.print("Your original word " +original +" is reversed to " +reverse +", so therefore it ");
		
	      if (original.equals(reverse))
	      {
		         System.out.print("is a palindrome.");
	      } else
	      {
		         System.out.print("isn't a palindrome.");
	
	      }
	}
}
