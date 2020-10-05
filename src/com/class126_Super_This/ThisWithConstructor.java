package com.class126_Super_This;

public class ThisWithConstructor {

	//CONSTRUCTOR CHAINING
	
	public ThisWithConstructor() {
		System.out.println("This constructor has no parameter.");
	}
	
	public ThisWithConstructor(String str) {
		this();
		System.out.println("This constructor has one String parameter. -->> "+str);
	}
	
	public ThisWithConstructor(String str, String str2) {
		this(str);
		System.out.println("This constructor has one String parameter. -->> "+str+" / "+str2);
	}
	
	public static void main(String[] args) {
//		ThisWithConstructor obj = new ThisWithConstructor();
//		ThisWithConstructor obj1 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj2 = new ThisWithConstructor("Bye","Ciaos Amigos");
	}
}
