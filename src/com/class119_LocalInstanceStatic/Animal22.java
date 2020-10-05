package com.class119_LocalInstanceStatic;

public class Animal22 {

	//   Create a class call Animal have properties like breed, weight, age, name and methods line canBark,isWild
	//	 make the name variable static
	//
	//	    Create another class called Application
	//	    from this application class create 3 different instances/objects of 
	//		it and print the properties and functions/methods

	    String breed = "Husky";
	    int weight = 100;
	    int age = 15;
	    static String name = "George";
	    
	    boolean canBark() {
	        return true;
	    }
	    
	    boolean isWild() {
	        return false;
	    }
}
