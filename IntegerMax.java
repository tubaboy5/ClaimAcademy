package oldPrograms;

import java.util.Scanner;

public class IntegerMax 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		maxNumber(a, b, c);
	}

	public static void maxNumber (int a, int b, int c)
	{
		if(a > b && a > c)
			System.out.println(a +" is the max number.");
		else if(b > a && b > c)
			System.out.println(b + " is the max number.");
		else
			System.out.print(c +" is the max number");
		
	}
}
