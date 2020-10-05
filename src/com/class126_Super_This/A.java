package com.class126_Super_This;

public class A {

	public final void display () {
		System.out.println("This is final display method of parent class");
	}
	
	public final void display (String A) {
		System.out.println("This is final display method of "+A+" class");
	}
}


// YOU CAN NOT OVERRIDE FINAL METHOD!!!!!

//	class B extends A{
//		public final void display() {
//			System.out.println("This is final display method of child class");
//		}
//	}
