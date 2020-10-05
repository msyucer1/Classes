package com.classReview4;

public class Parent {

	String name, lastname, nation;
	
	Parent () {
		name= "mehmet";
		lastname= "Yucer";
		nation="Turkish";
		System.out.println("This is a constructor");
	}
	
	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println(obj.name+" "+obj.lastname+" "+obj.nation);
	}
}
