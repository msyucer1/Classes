package com.class121_VariableTypes;

public class Employee {
	
	/*
	 * 	+Create a Class called Employee:
		+Create three  variables  eID , salary and set the CEO to “name”
		+Create two objects of the class Employee
		+Set the value of eID, salary for each of the objects
		+Print out the eID , salary and  CEO for each of the objects
	 */
	
	String eID;
	int salary;
	String CEO = "Mehmet";
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.eID = "cafer123";
		obj.salary = 200000;
		obj.CEO = "Cafer";
		
		Employee obj1 = new Employee();
		obj1.eID = "sulusulu123";
		obj1.salary = 150000;
		obj1.CEO = "Suluman";
		
		System.out.println(obj.eID+" earns $"+obj.salary+" and his CEO is "+obj.CEO);
		System.out.println(obj1.eID+" earns $"+obj1.salary+" and his CEO is "+obj1.CEO);
	}
	
}
