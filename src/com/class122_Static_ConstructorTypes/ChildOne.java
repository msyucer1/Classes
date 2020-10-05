package com.class122_Static_ConstructorTypes;

public class ChildOne extends Parent {
	
	String hairType = "Curly";
	

	public static void main(String[] args) {

		ChildOne childObj = new ChildOne();
		childObj.sing();
		System.out.println("Child 1 eye color: "+childObj.eyeColor);
		System.out.println("Child 1 hair color: "+childObj.hairColor);
		System.out.println("Child 1 nose: "+childObj.nose);
		System.out.println("Child 1 hair type: "+childObj.hairType);
		childObj.playTennis();
		
		Parent obj1 = new Parent();
//		obj1.hairType; ==>> Parent can not access child's properties
	}
	
	public void playTennis() {
		System.out.println("Child 1 can play tennis");
	}
}
