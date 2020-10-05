package com.class122_Static_ConstructorTypes;

public class Student2 {
	
	public String studentName;
	int grade1, grade2, grade3;
  
	public Student2() {
	calculateGrades("Tanya",100,100,100);
	calculateGrades("Ali",75,90,100);
	calculateGrades("David",20,49,33);
	calculateGrades("Mehmet",98,90,30);
	calculateGrades("Ahmet", 90, 80, 30);
	}
	
	public static void calculateGrades(String studentName, int grade1, int grade2, int grade3) {
		int avrg = (grade1 + grade2 + grade3) / 3;
		System.out.println("Student " + studentName + " has an average grade of " + avrg);
	}
	
	public static void main(String[] args) {
		Student2 st1 = new Student2();
	}
}
