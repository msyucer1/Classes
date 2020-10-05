package com.class122_Static_ConstructorTypes;

public class ConstructorTypes {
	
	//OVERLOADING TO CONSTRUCTORS

	ConstructorTypes() { 
		System.out.println("Constructor with no parameters");
	}
	ConstructorTypes(String str) { 
		System.out.println("I am a constructor with one variable "+str);
	}
	ConstructorTypes(String str, int a) { 
		System.out.println("I am a constructor with two variables "+str+" "+a);
	}
	
	public static void main(String[] args) {
		
		ConstructorTypes obj0 = new ConstructorTypes();
		ConstructorTypes obj1 = new ConstructorTypes("Ahmet abi");
		ConstructorTypes obj2 = new ConstructorTypes("Ahmet abi",30);
	}
	
	
	
	
	}
