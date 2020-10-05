package com.class122_Static_ConstructorTypes;

public class Task1_2_3 {

//	Write a program that will have a constructor: one with parameters and second without any parameters. 
//	Create a separate Test class where you will execute both of the constructors.
	
	public Task1_2_3() {
			System.out.println("I'm a constructor with no parameters");
	}
	
	public Task1_2_3(int age) {
		System.out.println("I am a constructor with one parameter which named with age");
	}

//	TASK 2
//	Write a program  that will have a private and default constructor class and create 2 objects of this class: 
//	1 - inside same class; 
//	2 - from outside the class.
	
	private Task1_2_3(String name) {
		System.out.println("I am an constructor and My name is "+name);
	}
	Task1_2_3(String Lname,  int age) {
		System.out.println("I am an constructor and My Last name is "+Lname+"("+age+")");
	}
	
	public static void main(String[] args) {
		Task1_2_3 obj = new Task1_2_3 ("Mehmet");
	}

	
//	TASK 3
//	Write program that have static constructor and observe result.
//=====	
//	We cannot make a constructor as static
//	When we make a private constructor, we can instantiate the class within itself, 
//	but won't be able to instantiate it in different classes

	
}
	// TASK 2 TEST
	// Task1_2_3 obj2 = new Task1_2_3 ("Mehmet", 23);
	// It gives an error because you can not create method or object outside the class.
