package com.class122_Static_ConstructorTypes;

public class Car {

	public static String make = "Toyota";
	String model;
	String color;
	int doors;
	
	//Constructor can have access modifier but it can not have return type
	// We can write it as private Car();
	// But we can not create it like void Car();
	Car () { //Constructor with no parameters
		System.out.println("I'm a constructor.");
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.color);
		hello();
	}

	public static void hello() {
		//Before using local variables we have to initialize it
		String name= "John";
		System.out.println(name);
		System.out.println("I'm a static hello method");
	}
}