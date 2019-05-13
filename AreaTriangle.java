package week1;
/*
2. Write a program to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.
NOTE: Area of a triangle is: area = (height * base) / 2
 */
import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the width of the base of the triangle? ");
		double width = sc.nextDouble();
		System.out.println("What is the height of the triangle? ");
		double height = sc.nextDouble();
		
		// Finding the area
		double area = (width * height)/2;
		
		// Putting it all together
		System.out.println("If the base of the triangle is " +width +", and the height is " +height +", then the area of the triangle is: " +area +".");
	}

}
