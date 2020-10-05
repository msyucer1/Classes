package com.class119_LocalInstanceStatic;

public class Animal1 {

	String breed = "Labrador";
	static String name = "duke";
	int weight = 75, age = 3;
	
	void canBark() {
		System.out.println(breed + " can bark");
	}
	
	void isWild() {
		System.out.println("Animal is wild");
	}
}
