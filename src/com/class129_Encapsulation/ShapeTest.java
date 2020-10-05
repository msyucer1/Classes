package com.class129_Encapsulation;

public class ShapeTest {

	public static void main(String[] args) {

		Shape obj = new Circle();
		obj.calculateArea(5.0);
		obj.calculatePermiter(5.0);

		Shape obj1 = new Square();
		obj1.calculateArea(6);
		obj1.calculatePermiter(6);
	}

}
