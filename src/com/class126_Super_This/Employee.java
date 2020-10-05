package com.class126_Super_This;

public class Employee {

	String name, lastName;
	
	Employee () {
		System.out.println("I'm a parent class constructor");
	}
	
	Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		
	}
}

class Tester extends Employee {
	int salary;
	
	Tester(String name, String lastName,int salary){
		super(name, lastName);	
		this.salary = salary;
	}
	
	public void displayDetails () {
		System.out.println("Employee "+name+" "+lastName+" has a salary of "+salary);
	}
	
}