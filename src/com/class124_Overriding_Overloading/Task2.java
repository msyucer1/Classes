package com.class124_Overriding_Overloading;

public class Task2 {

	/** Create 1 class with as static method that has 3 overloaded forms. 
	 *	Then call each overloaded method with specific arguments and observe result. 
	 */

	static void method1() {
		System.out.println("I love programming (No parameter)");
	}

	static void method1(String name) {
		System.out.println(name + " loves programming (One String parameter)");
	}

	static void method1(String name, int age) {
		System.out.println(name +"("+age+") loves programming (one string one int parameters)");
	}
	
	public static void main(String[] args) {
		method1();
		method1("Cafer");
		method1("Haydar", 32);
	}
	
	
}
