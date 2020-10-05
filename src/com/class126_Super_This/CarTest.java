package com.class126_Super_This;

public class CarTest {

	public static void main(String[] args) {
		Car carObject;
		
		carObject = new BMW();
		carObject.drive();
		carObject = new Toyota();
		carObject.drive();
	}
}
