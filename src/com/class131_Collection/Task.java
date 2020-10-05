package com.class131_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	/**
	 * 1.Create an arraylist of cars and retrieve all the values using 4 different
	 * ways.
	 * 
	 * 2.Create an arrayList of words. Remove every word that ends with “e”. Use
	 * iterator
	 * 
	 * 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace
	 * it with water.
	 * 
	 * 4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any
	 * number that is divisible by 5 from that arrayList.
	 */

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mustang");
		cars.add("Chevrolet");
		cars.add("Maserati");
		cars.add("Porche");
		cars.add("Crysler");

		System.out.println("--- using for loop ---");
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}

		System.out.println("\n--- using advanced for loop ---");
		for (String car : cars) {
			System.out.print(car + " ");
		}

		System.out.println("\n--- using iterator ---");
		Iterator<String> iter = cars.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		System.out.println("\n--- using while loop ---");
		int count = 0;
		while (cars.size() > count) {
			System.out.print(cars.get(count) + " ");
			count++;
		}

		System.out.println("\n\n------------------------TASK 2----------------------");
		ArrayList<String> words = new ArrayList<String>();
		words.add("Egg");
		words.add("Ellie");
		words.add("Sydney");
		words.add("Smile");
		words.add("John");
		words.add("Targaryen");

		System.out.print(words + " ");
		Iterator<String> wordss = words.iterator();
		while (wordss.hasNext()) {
			if (wordss.next().endsWith("e")) {
				wordss.remove();
			}
		}
		System.out.println("\n" + words);

		System.out.println("\n\n------------------------TASK 3----------------------");
		ArrayList<String> alist = new ArrayList<>();
		String[] drink = { "CocaCola", "Fanta", "Sprite", "Mineral Water", "Ginger", "Wine", };
		for (String a : drink) {
			alist.add(a);
		}

		for (int i = 0; i < alist.size(); i++) {
			String drinks = alist.get(i);
			if (drinks.contains("a") || drinks.contains("e")) {
				drinks = alist.set(i, "water");
			}
		}
		System.out.println(alist);

		System.out.println("\n\n------------------------TASK 4----------------------");
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 0; i <= 50; i += 2) {
			number.add(i);
		}
		System.out.print(number + " ");

//		for (int i = 0; i <= number.size(); i++) {
//			if (number.get(i) % 5 == 0) {
//				number.remove(i);
//			}
//		}
//		System.out.println();
//		System.out.println(number + " ");

		Iterator<Integer> it = number.iterator();
		while (it.hasNext()) {
			if (it.next() % 5 == 0) {
				it.remove();
			}
		}
		System.out.println("\n" + number + " ");
	}
}
