package com.class122_Static_ConstructorTypes;

public class CallingStaticVsNonStaticClass {

	// if you want to access different class' informations you need to create obj.
	// if you want to access static variables you need to use class' name

	public static void main(String[] args) {

		StaticVsNonStatic obj1 = new StaticVsNonStatic();

		// accessing non static method
		obj1.getInfo();

		// accessing non static variable
		System.out.println(obj1.name);

		// accessing static variable
		System.out.println(StaticVsNonStatic.lastName);

		// accessing static method
		StaticVsNonStatic.getInfo1();
	}
}
