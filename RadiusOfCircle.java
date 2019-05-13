package week1;
/*
 * 1.Write a program to prompt the user to enter the radius of the circle
 then calculate the area and circumference of the circle. 
 NOTE: Radius of circle is: circumference = 2 * pie * R
 NOTE: Area = pie * r * r
 */
import java.util.Scanner;

public class RadiusOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the radius of the circle? ");
		double radius = sc.nextDouble();
		double circumference = 2 * Math.PI * radius;
		//double area = Math.PI * radius * radius; - This also works
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("With a radius of " +radius +", then the circumference is " +circumference +" , and the area is " +area +".");
	}

}
