package com.class121_VariableTypes;

public class InterviewQuesStudent {

	/*
	 * 2. Create a Class called Students
		Create three  variables  studentName , studentID  and  numberOfStudents
		Create three objects of the Students Class
		Set the value for  studentName , studentID and increment the numberOfStudents for each object
		Print out total number of students
	 */
	
	String studentName;
	String studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {

		InterviewQuesStudent obj1 = new InterviewQuesStudent();
		InterviewQuesStudent obj2 = new InterviewQuesStudent();
		InterviewQuesStudent obj3 = new InterviewQuesStudent();
		
		obj1.studentName = "Bekir";
		obj1.studentID = "1542463";
		numberOfStudents++;
		
		obj2.studentName = "Omer";
		obj2.studentID = "1565463";
		numberOfStudents++;
	
		obj3.studentName = "Ken";
		obj3.studentID = "9887663";
		numberOfStudents++;
		
		System.out.println("We have "+numberOfStudents+" students in this class");
	}
}
