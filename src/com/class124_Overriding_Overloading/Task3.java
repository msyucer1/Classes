package com.class124_Overriding_Overloading;

public class Task3 {

	/*
	 * Create 1 class with a private method that has 3 overloaded forms. Then call
	 * each overloaded method with specific arguments and observe result.
	 */
	
	private void method1 () {
		System.out.println("Private method with 0 parameter");
	}
	
	private void method1 (String name) {
		System.out.println("Private method with 1 parameter "+ name);
	}
	
	private void method1 (String name, int age) {
		System.out.println("Private method with 2 parameter "+name+" "+age);
	}
	
	public static void main(String[] args) {
		Task3 obj = new Task3();
		obj.method1();
		obj.method1("Haydar");
		obj.method1("Haydar", 32);
	}
}
