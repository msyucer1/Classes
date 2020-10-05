package com.class126_Super_This;

public class Car {

	public void drive() {
		System.out.println("Car drives");
	}
	
	public void drive(int speed) {
		System.out.println("Car maximum speed is "+speed);
	}
	
}

//overloading vs overriding?

class BMW extends Car {
	public void drive() {
		System.out.println("BMW drives fast.");
	}
}

class Toyota extends Car {
	public void drive() {
		System.out.println("Toyota drives safe.");
	}
}