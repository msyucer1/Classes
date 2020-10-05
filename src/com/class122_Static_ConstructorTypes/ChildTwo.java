package com.class122_Static_ConstructorTypes;

public class ChildTwo extends Parent{

	String hairCut = "Short";
	
	public static void main(String[] args) {
		
		ChildTwo ChildTwoObj = new ChildTwo();
		System.out.println("Child 2 eye color: "+ChildTwoObj.eyeColor);
		System.out.println("Child 2 hair cut: "+ChildTwoObj.hairCut);
		System.out.println("Child 2 nose: "+ChildTwoObj.nose);
		ChildTwoObj.swim();
		
	}
	
	public void swim () {
		System.out.println("Child 2 can swim");
	}
}
