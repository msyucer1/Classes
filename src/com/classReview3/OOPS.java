package com.classReview3;

public class OOPS {

	String eyes, hair, nose, shirt;
	
	public static void main(String[] args) {
		
		OOPS monkey = new OOPS();
		monkey.eyes = "hazal";
		monkey.hair = "black";
		monkey.nose = "blue";
		monkey.shirt = "grey";
	
		
		System.out.println("Weqas has "+monkey.eyes+" color eyes and "+ monkey.hair+ " hair"
				+ " he also has "+monkey.nose+" nose and he wears "+monkey.shirt+" shirt. ");
		monkey.scream();
		
		OOPS monkey1 = new OOPS ();
		monkey1.eyes = "red";
		System.out.println(monkey1.eyes);
		monkey1.donTreturn();
		monkey.humanEyes();
	}
	
	void scream () {
		System.out.println("He can scream.");
	}
	void sleep () {
		System.out.println("He can sleep.");
	}
	void escape () {
		System.out.println("He can escape.");
	}
	void humanEyes () {
		OOPS monkey = new OOPS();
		monkey.eyes = "yellow";
		System.out.println("My eyes is "+monkey.eyes+" already");
		
	}void donTreturn () {
		System.out.println("I don't have a return type");
	}
	
}
