package week1;
/*
 * 1. Write a program to convert every odd position to upper case and every even position to lower case. 
 * eg input "Banana" output :"bAnAnA" 
 * input "StLouis" output:"sTlOuIs"
Hint: User toLowerCase() and toUpperCase() methods in String library.
 */
import java.util.Scanner;

public class UpperLowerEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) 
		{
		    char ch = str.charAt(i);
		    if (i % 2 == 0) 
		    {
		        System.out.print(Character.toLowerCase(ch));
		    } 
		    else 
		    {
		        System.out.print(Character.toUpperCase(ch));
		    }
}
}
}