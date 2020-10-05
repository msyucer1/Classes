package com.class126_Super_This;

public class Students {

	String fullName;
	int age;
	
	public Students(String fullNamee, int agee) {
		fullName = fullNamee;
		age = agee;
	}

	public void displayDetails() {
		System.out.println("Student full name is "+fullName+" and age is "+age);
	}
	
//------------------------------------------------------------------------------------------------
	
	//This is used to differentiate b/w local and instance variables.
	public Students( int age, String fullName) {
		this.age = age;
		this.fullName = fullName;
		System.out.println("Student full name is "+fullName+" and age is "+age);
	}
	
	public static void main(String[] args) {
		Students obj = new Students("Khalesii", 30);
		obj.displayDetails();
		Students obj1 = new Students(23, "Mehmet");
	}
	
}
