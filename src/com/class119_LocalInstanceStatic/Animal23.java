package com.class119_LocalInstanceStatic;

public class Animal23 {

	public static void main(String[] args) {

		Animal22 anim = new Animal22();

		System.out.println("This is anim");
		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);

		anim.name = "Joe";
		anim.age = 40;
		System.out.println(anim.age);

		Animal22 anim2 = new Animal22();

		System.out.println("This is anim2");
		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);

		Animal22 anim3 = new Animal22();

		System.out.println("This is anim3");
		System.out.println(anim3.age);
		System.out.println(anim3.weight);
		System.out.println(anim3.breed);
		System.out.println(anim3.name);

		
	}
	
}
