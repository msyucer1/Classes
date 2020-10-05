package com.class126_Super_This;

public class SuperWithConstructor {
	public SuperWithConstructor() {
		System.out.println("I'm a parent class constructor.");
	}

	public SuperWithConstructor(String str) {
		System.out.println("I'm a parent class constructor with one parameter -->> " + str);
	}
}

class ChildOf_SuperWithConstructor extends SuperWithConstructor {
	public ChildOf_SuperWithConstructor() {
		// super(); compiler adds it by default
		System.out.println("I'm child of parent class");
	}

}
