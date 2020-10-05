package com.class122_Static_ConstructorTypes;

public class Student1 {

//	Write a java program of Class Students that takes students name and 3 subject grades. 
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
	
	String studentName;
	int sub1, sub2, sub3;
	
	static int calculate (int sub1, int sub2, int sub3) {
		int avrg = (sub1+sub2+sub3)/3;
		return avrg;
	}
	
	public Student1(String studentName,int sub1, int sub2, int sub3) {
		int a = sub1 , b = sub2 , c = sub3;
		System.out.println(studentName+ " has "+ calculate(a,b,c)+ "  average points");
	}
	
	public static void main(String[] args) {
		Student1 student1 = new Student1("Mehmet", 90, 100, 20);
		Student1 student2 = new Student1("Myahri", 75, 100, 35);
		Student1 student3 = new Student1("Bekir", 10, 0, 80);
		Student1 student4 = new Student1("Tetiana", 99, 99, 30);
		Student1 student5 = new Student1("Omer", 10, 100, 20);
	}
	

	
	
}
