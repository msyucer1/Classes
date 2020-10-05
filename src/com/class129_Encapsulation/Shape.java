package com.class129_Encapsulation;

public interface Shape {

	/*
	 * 1. Create an Interface ‘Shape’ with undefined methods as calculateArea() and
	 * calculatePerimiter(). Create 2 child classes: Circle & Square that should
	 * have an implementation of area and perimeter calculation. Test your code.
	 */
	void calculateArea(double radiusOrWidth);

	void calculatePermiter(double radiusOrWidth);
}

class Circle implements Shape {
	@Override
	public void calculateArea(double radius) {
		System.out.println("The area of a Circle is " + (3.14 * (radius * radius)));

	}

	@Override
	public void calculatePermiter(double radius) {
		System.out.println("The perimiter of a Circle is " + (radius * (3.14 * 2)));

	}
}

class Square implements Shape {
	@Override
	public void calculateArea(double width) {
		System.out.println("The area of a Square is " + (width * width));

	}

	@Override
	public void calculatePermiter(double width) {
		System.out.println("The perimiter of a Square is " + (width * 4));

	}
}
