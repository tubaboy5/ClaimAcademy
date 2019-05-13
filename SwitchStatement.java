/*
 * Switch statement 
Ask user to enter 2 numbers and an operator ( +, -, or *)
Depending on the operator, display the output

Example 2 3 + output:5
2 3 * output: 6
2 3 - output: -1
 */
package week1;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input1 = sc.nextInt();
		
		System.out.println("Enter another number:");
		int input2 = sc.nextInt();
		
		System.out.println("Enter an operator:");
		System.out.println("(Only acceptable operators are +,-,*,/");
		char operator = sc.next().charAt(0); 
		
		        switch (operator) {
		            case '+':  
		            	System.out.println("The result of " +input1 +" + " +input2 +" is: " +(input1 + input2 +"."));
		                     break;
		            case '-':  
		            	System.out.println("The result of " +input1 +" - " +input2 +" is: " +(input1 - input2 +"."));
		                     break;
		            case '*':  
		            	System.out.println("The result of " +input1 +" * " +input2 +" is: " +(input1 * input2 +"."));
		                     break;
		            case '/':  
		            	System.out.println("The result of " +input1 +" / " +input2 +" is: " +(input1 / input2 +"."));
		                     break;         
		            default: 
		            	System.out.println("That is an invalid entry");
		                     break;
		        }
		    }
	}


