package com.class122_Static_ConstructorTypes;

public class SyntaxStudentsTest {

	public static void main(String[] args) {
		
//		SyntaxStudents obj1 = new SyntaxStudents();
//		obj1.studentName = "Samir";
//		obj1.studentLastName = "Aziz";
//		obj1.getStudentDetails();
//		
//		SyntaxStudents obj2 = new SyntaxStudents();
//		obj1.studentName = "Mohammad";
//		obj1.studentLastName = "Ali";
//		obj1.getStudentDetails();
		
		// If you don't create constructor you have to repeat these steps for each students.
		// Instead of 10 lines for 2 students we are using 4 lines.
		SyntaxStudents student1 = new SyntaxStudents("Mustafa", "Ozturk");
		student1.getStudentDetails();
		SyntaxStudents student2 = new SyntaxStudents("Bekir", "Pekdemir");
		student2.getStudentDetails();
				
		
	}
	
	//CONSTRACTOR RULES ARE ASKING IN THE INTERVIEW!!
}
