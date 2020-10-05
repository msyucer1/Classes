package com.class127_Abstraction;

public abstract class AbstractClass {

	public void test() {
		System.out.println("I am non-static test method");
	}
	
	public abstract void hello(); 
	// It doesn't give you compile error because:
	// Java says this is one behavior that programmers add implementation(block of code) later.
	
	
	
}
