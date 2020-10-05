package com.class130_Collection_ArrayList;

import java.util.ArrayList;

public class CollectionConcept {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		int c = 30;
//		
//		//CREATING ARRAY AND ASSIGNING VALUES
//		int[] array = { 10, 20, 30, 40 };
//
//		//CREATING ARRAY AND ASSIGNING VALUES
//		int[] intArray = new int[3];
//		intArray[0] = 10;
//		intArray[1] = 20;
//		intArray[2] = 30;
//		// intArray[3] = 40; ArrayIndexOutOfBoundException ERROR
//
//		int num = intArray[2];
//		System.out.println(num);
//
//		//FOR LOOP TO ACCESS ARRAY ELEMENTS
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
//		
//		//ENHANCED LOOP TO ACCESS ARRAY ELEMENTS
//		for (int num1 : intArray) {
//			System.out.println(num1);
//		}

		/**
		 * COLLECTION > QUEUE > SET > LIST > ARRAYLIST ---- most used one > LINKEDLIST >
		 * VECTOR
		 */

		System.out.println("---CREATING STRING ARRAYLIST---");
		// CREATING ARRAYLIST WHICH STORES STRING OBJECTS
		ArrayList <String>greetings = new ArrayList<String>();

		// OBJ.ADD = ADDS STRINGS TO LIST
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Bye");
		greetings.add("Hi");

		System.out.println(greetings.get(1));
		System.out.println(greetings.size()); // 4

		// collections - growable in size
		greetings.add("How are you?");
		greetings.add("Ne war you?");
		greetings.add("How are you?");
		greetings.add("Ne war you?");
		System.out.println(greetings.size()); // 8

		System.out.println("---For Loop---");
		for (int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		System.out.println("---Foreach Loop---");
		for (String greetWords : greetings) {
			System.out.println(greetWords);
		}

		System.out.println("---Integer ARRAYLIST---");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(300);
		numbers.add(20);
		numbers.add(10);

		numbers.set(2, 333); // 20 -->> 333

		for (int num : numbers) {
			System.out.println(num);
		}
		
//		Create a generic ArrayList that will store 5 names into it.
//		Find out whether the given ArrayList is empty or not?
//		Check whether the specific name is present in an ArrayList or not?
//		Find the size of your arrayList and print all values from that
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mehmet");
		names.add("Ahmet");
		names.add("Siyar");
		names.add("Tetiana");
		names.add("Myahri");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Mehmet"));
		System.out.println(names.size());
		for (String name : names) {
			System.out.println(name);
		}
		
		}
	}

