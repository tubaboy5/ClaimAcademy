package oldPrograms;

import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) 
	{
		int x;
		int y;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input your first number to be added: ");
		x = input.nextInt();
		System.out.println("Input your second number to be added: ");
		y = input.nextInt();
		int c = x + y;
		System.out.println("The addition of " +x +" and " +y +" is: " +c);
		input.close();
	}
	public static int solveMeFirst(int x, int y) {
		int c =  x + y;
		return c;
		
	}
}
