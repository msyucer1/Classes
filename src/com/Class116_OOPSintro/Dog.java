package com.Class116_OOPSintro;

public class Dog {

	String breed, hairColor,tail; 
	boolean longMouth;
	
	public static void main(String[] args) {
		Dog dg = new Dog () ;
		dg.breed = "Bulldog";
		dg.hairColor = "white";
		dg.tail = "short";
		dg.longMouth = true;
		
		System.out.println("This dogs breed is "+dg.breed+" it has "+dg.hairColor+ " hair color.");
		dg.bark();
		dg.cover();
		dg.walk();
		
	}
	void bark () {
		System.out.println("Dogs can bark");
	}
	void cover () {
		System.out.println("Dogs can cover");
	}
	void walk () {
		System.out.println("Dogs can walk");
	}
}
