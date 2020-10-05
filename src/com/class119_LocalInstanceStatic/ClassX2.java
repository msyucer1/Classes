package com.class119_LocalInstanceStatic;

public class ClassX2 {

	public static void main(String[] args) {
		
		ClassX x = new ClassX() ;
		
		System.out.println(x.i);
		
		x.methodOfX();
		
	}
}

// we can access different classes with writing nothing.
// here we just wrote different class name and we created object. 
// after that we access method i via object x
// after that we called method again.