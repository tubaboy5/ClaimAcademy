package week1;
/*
 * 4. Write a program to remove a given character from a string. 
 * E.g. remove all 'a' from Averange should return vernge
 * */
import java.util.Scanner;
public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input word and character to remove
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String inputWord = sc.nextLine();
		System.out.println("Enter a letter you would like to remove: ");
		char inputChar = sc.findInLine(".").charAt(0);
		
		
		String Output = inputWord.toLowerCase().replace(Character.toString(inputChar).toLowerCase(), "");
		
		//Outputting the final answer
		System.out.println("The word \"" +inputWord +"\" with the letter \"" +inputChar +"\" missing is: " +Output +".");
	}

}
