package com.class124_Overriding_Overloading;

public class ParentTest {

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.love();
		obj.work();
		
		System.out.println("----------------");
		Child obj1 = new Child();
		obj1.love();
		obj1.cry();
		
		System.out.println("----------------");
		//type casting
		Parent obj2 =new Child();
		obj2.love();
		obj2.work();
//		Child obj3 = new Parent(); // not possible because parent concludes child class.
		
	}
	
	
	
	
	
	
	
	
}
