package com.class126_Super_This;

public class StudentTask2 {

	/**
	 * 2. Write program as a student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student by the displayInfo method.
	 */
	String name;
	String address;
	
	public StudentTask2(String name, String address) {
		this.name=name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println(name+"'s address is "+address);
	}
	
	public static void main(String[] args) {
		StudentTask2 obj = new StudentTask2("Mehmet", "Fairfax VA");
		obj.displayInfo();
	}
}
