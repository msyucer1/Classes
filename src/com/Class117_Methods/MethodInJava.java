package com.Class117_Methods;

public class MethodInJava {

	String str;
	int num;
	int a, b;

	public static void main(String[] args) {

		MethodInJava obj = new MethodInJava();
		// we calling a method bye and hello
		obj.hello();
		obj.bye();
		obj.findLargest();

		// Methods with parameters
		obj.findlarge(30, 20); // calling method and assigning 20 and 30 to as variables.
		obj.helloToInstructor("Asel");
	}

	public void hello() {
		System.out.println("Hello!");
		System.out.println("Hello Friends!!");
	}

	void bye() {
		System.out.println("Bye!");
	}

	void findLargest() {
		a = 10;
		b = 20;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
	}

	void helloToInstructor(String Name) {
		for (int i = 1; i < 10; i += 2) {
			System.out.println("Hello " + Name);
		}
	}

	void findlarge(int a, int b) { // (parameters)
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

	}
}
