package com.class134_GetValue_getKey;

public class Person {

	/*
	 * Create a Person class with following private fields: name, lastName, age, salary.
	 * Variables should be initialized through constructor. 
	 * Inside the class also create a method to print user details. 
	 * In Test Class create a Map to store personId and a Person Object. 
	 * Print each object details.
	 */
	
	
	private String name, lastName;
	private int salary, age;

	public Person(String name, String lastName, int salary, int age) {
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}
	
	public void printPersonDetails() {
		System.out.println(name+ " "+ lastName +" is "+age+" years old and has $"+ salary+" salary");
		
	}

}
