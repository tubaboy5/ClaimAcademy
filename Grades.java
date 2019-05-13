package week1;
/*
 * ask user to input score
0-60 = C
61-80 = B
80-100 = A
if score is not between 0-100 then display invalid score
 */

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What score did you get on the exam?");
		int score = sc.nextInt();
		
		System.out.println("If you got a : " + score );
		if (score < 0 || score > 100)
		{
			System.out.println("That isn't a valid grade");
		}
		/*
		 else if (score < 0)
		{
			System.out.println("That isn't a valid grade");
		}
		*/
		else if (score >= 80) 
		{
			System.out.println("Result: A");
		} 
		else if (score >= 60)
		{
			System.out.println("Result: B");
		}
		else if (score <= 59)
		{
			System.out.println("Result: C");
		}
	}

}
