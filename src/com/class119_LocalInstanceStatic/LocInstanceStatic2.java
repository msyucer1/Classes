package com.class119_LocalInstanceStatic;

public class LocInstanceStatic2 {

	// LOCAL VARIABLES are just usable in methods
	// INSTANCE VARIABLES are global. You can use them within every method.
	// you can change instance variables. But it doesn't affect original value.
	// Because it has copies and you are only changing copies
	// STATIC VARIABLES are also global. But it has only one original value.
	// if you change this value in anywhere it will affect original value.
	// Because it doesn't have copies
	
	
	
	public static void main(String[] args) {
		
		LocInstanceStatic person = new LocInstanceStatic();
		person.eyeColor = "red";
		
		System.out.println(person.eyeColor);
		System.out.println(person.gender);
		System.out.println(person.height);
		System.out.println(person.weight);
		person.print();
// -------------------------------------------------------------------------------------
		
		LocInstanceStatic person1 = new LocInstanceStatic();
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.gender);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		
		
		System.out.println(person.eyeColor);
		person1.eyeColor = "yellow";
		System.out.println(person.eyeColor);
	}
}
