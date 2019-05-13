package week1;
import java.util.Scanner;
public class DisplayEvenCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i+=2)
		{
			System.out.println(str.charAt(i) +" has index " +i);
		}

	}

}
