package com.class120_returnKeyword;

public class Task {
	
	/*
	  	 * Create a method createEmail().
         * Based on provided users name, lastName and email type,
         * your method should return complete email Address;
         * johnsnow@gmail.com
         * johnsnow@yahoo.com
	 */
	
	public static void main(String[] args) {
		
		Task obj = new Task ();
		System.out.println(obj.createEmail("Haydari", "Coskun","gmail"));
	//-------------------------------------------------------------------------// TASK 2
		
		Task2Student obj1 = new Task2Student();
		System.out.println("Your grade is "+obj1.getGrade(71));
		
		
	}
	
	String createEmail(String name, String lastname, String EmailType) {
		
		String Email = (name+lastname+"@"+EmailType+".com").toLowerCase();
		return Email;
	}

	
	
	
	
	
	
}
