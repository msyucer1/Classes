package com.Class117_Methods;

import java.util.Scanner;

public class TestClass {
	
//	Methods are 2 types:
//		Built-in:String/Scanner class,methods -->> limited and read only
//		User defined:we create them -->> unlimited & modifiable 

	public static void main(String[] args) {
		
		//Scanner class, String
		String str = new String ("Hello");
		str.isEmpty(); //built-in method that comes with String class
		
		TestClass obj = new TestClass();
		obj.askHowAreYou("Amina");
		System.out.println(obj.Scanner());
		
	}
	//dynamic codes
	void askHowAreYou(String name) {
		System.out.println("Hello "+name);
	}
	int Scanner() {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		return a;
	}
	
}
