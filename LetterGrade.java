package Demos;

public class LetterGrade {

	public static void main(String[] args) {
		
// Letter Grade
// Convert a numeric grade to a letter grade. Use the following scale: 
// A  90 - 100% 
// B  80 - 89% 
// C  72 - 79% 
// D  64 - 71% 
// F  0 - 63% 
		
// Make a provision for an invalid numeric grade 
// INPUT:     76 
// RESULT:    C 
	
// Define the variable
		Integer grade = 76;
		
// Run the program
		System.out.println("INPUT: " + grade + "");
		if (grade > 100)
		{
			System.out.println("That isn't a valid grade");
		}
		else if (grade < 0)
		{
			System.out.println("That isn't a valid grade");
		}
		else if (grade >= 90) 
		{
			System.out.println("Result: A");
		} 
		else if (grade >= 80)
		{
			System.out.println("Result: B");
		}
		else if (grade >= 72)
		{
			System.out.println("Result: C");
		}
		else if (grade >= 64)
		{
			System.out.println("Result: D");
		}
		else if (grade <= 63)
		{
			System.out.println("Result: F");
		}
		
	}
}
