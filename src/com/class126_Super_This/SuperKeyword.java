package com.class126_Super_This;

public class SuperKeyword {

	String name = "John";

	public SuperKeyword() {
		System.out.println("Parent name is " + name);
	}
}

class ChildOfSuperKeyword extends SuperKeyword {

	String name = "Michael";

	public ChildOfSuperKeyword() {
		System.out.println("Parent name is " + super.name); // trying to access parent name
		System.out.println("Child name is " + name);
	}

	public ChildOfSuperKeyword(String str) {
		super();
		
	}
}