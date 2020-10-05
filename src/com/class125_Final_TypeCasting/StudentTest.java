package com.class125_Final_TypeCasting;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu = new StudentSyntax();
		stu.study();
		stu.doHomeWork();
		stu.attendClasses();
		// stu.doResearch(); // Private methods can not be part of inheritance.
	}
}
