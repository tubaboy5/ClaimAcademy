package week1;
import java.util.Scanner;

/*
 * 5. Write a program to remove the middle character of a string. 
 * Eg input "stack" output:"stck" 
 * 
 * Methodology: Have the user input a word
 * Find the middle character in the string (if the number of characters is odd)
 * Delete that character and output the new string
 * 		If there isn't a middle character, don't delete anything and output that there isn't a middle character. (if the number of characters is even)
 */
public class RemoveMiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String initialWord = sc.nextLine();
	
		
		int length = initialWord.length(); 
		
		//System.out.println(initialWord);  CHECK ON INITIAL WORD 
		//System.out.println(length); CHECK ON LENGTH
		
		if (length % 2 == 0) 
		{
			System.out.println("Your word \"" +initialWord +"\" has an even number of letters so therefore it doesn't have a middle letter.");
		}
		else 
		{
			int middle = length/2;
			//System.out.println(middle); PRINT THE MIDDLE NUMBER
			for(int i = 0; i < middle; i++)
			{
				System.out.print(initialWord.charAt(i));
			}
			for(int i = middle+1; i < length; i++)
			{
				System.out.print(initialWord.charAt(i));
			}
}
}
}