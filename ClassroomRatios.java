package Demos;

public class ClassroomRatios {

	public static void main(String[] args) {
	
// Classroom Ratios
// There are 11 boys and 16 girls in a class with one teacher and a teacher’s assistant. 
// What percent of the students are girls? What is the student-teacher ratio? 
// RESULT:    59.259% of the class are girls 
// The Student-Teacher ratio is 13
	
//Define the variable
	int boy = 11;
	int girl = 16;
	int teacher = 2;
	int totalStudents = boy + girl;
	Double percentGirls = (double)girl / totalStudents * 100;
	Double percentBoys = (double)boy / totalStudents * 100;
	Double teacherRatio = (double)totalStudents / teacher;
	
//Run the Program
	System.out.println("There are " + percentGirls + "% girls in the classroom, and " + percentBoys + "% in the classroom.");
	System.out.println("With a student to teacher ratio of " + teacherRatio + ":1");
}
}