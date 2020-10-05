package com.class123_inheritance_Overloading;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		System.out.println("I am Main method with String arguments array");
	}

	public static void main() {
		System.out.println("I am Main method with no parameters");
	}

	public static void main(String args) {
		System.out.println("I am Main method with 1 string parameter ");
	}
	
	public static void main(int args) {
		System.out.println("I am Main method with 1 int parameter ");
	}
}
