package com.Class116_OOPSintro;

public class car {
	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
	//className variableName = new className();  // SYNTAX
	
	car car1 = new car();
	car1.make = "Honda";
	car1.model = "Civic";
	car1.color = "black";
	car1.door = 4;
	car1.wheels = 4; 
	// car Honda has 4 wheels
	System.out.println("Car "+car1.make+ " has "+car1.wheels+" wheels");
	// define behaviors.
	car1.drive();
	car1.stop();
	car1.reverse();
	
	System.out.println("----------------------------------");
	car car2 = new car();
	car2.make = "Tesla";
	car2.model = "X";
	car2.color = "blue";
	car2.door = 4;
	car2.wheels = 4;
	System.out.println("Car "+car2.make+ " has "+car2.wheels+" wheels");
	}
	
	void drive () {
		System.out.println("Car can drive");
	}
	void reverse () {
		System.out.println("Car can reverse");
	}
	void stop () {
		System.out.println("Car can stop");
	}



}
