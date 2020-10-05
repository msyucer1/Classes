package com.class119_LocalInstanceStatic;

public class Animal2 {

public static void main(String[] args) {
	
	Animal1 X = new Animal1 ();
	
		System.out.println(X.breed);
		System.out.println(X.age);
		System.out.println(X.weight);
		System.out.println(X.name);
		X.canBark();
		X.isWild();
		System.out.println("----------------");
		
	Animal1 Y = new Animal1 ();
		Y.breed = "Bulldog";					// INSTANCE
		System.out.println("Breed Changed: "+Y.breed);
		
		System.out.println(Y.name);
		Y.name = "Coci";						// STATIC !!!
		System.out.println("Name Changed: "+Y.name);
		System.out.println("----------------");
	
	Animal1 Z = new Animal1 ();
		System.out.println("Breed turned back to: "+Z.breed);
		System.out.println("name still same: "+ Z.name);
	
}



}