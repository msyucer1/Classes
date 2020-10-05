package com.class119_LocalInstanceStatic;

public class LocInstanceStatic {

	String gender = "Male";
	static String eyeColor="Green";
	int height=6, weight=200;
	
	void speak () {
		String language = "English";
		System.out.println("Students can speak "+language);
	}
	
	void coding() {
		System.out.println("Students can code");
	}
	
	void print () {
		System.out.println(eyeColor);
	}
	
}
