package com.class133_SetReview_MAP;

import java.util.*;

public class LinkedHashSet1_TreeSet {

	public static void main(String[] args) throws InterruptedException {

		// LINKED HASHSET PUTS ALL ELEMENT IN ORDER AS HOW YOU ADD

		Set<String> classDay = new LinkedHashSet<>();
		classDay.add("Monday");
		classDay.add("Tuesday");
		classDay.add("Wednesday");
		classDay.add("Thursday");
		classDay.add("Friday");
		classDay.add("Saturday");
		classDay.add("Sunday");

		System.out.println(classDay);
		System.out.println("-----------------------------");
		for (Object days : classDay) {
			System.out.print(days + " ");
		}
		System.out.println("\n-----------------------------");
		Iterator<String> day = classDay.iterator();
		while (day.hasNext()) {
			System.out.print(day.next() + " ");
		}
		System.out.println("\n-----------------------------");

		
		// TREESET PUTS ELEMENTS IN ORDER AS HOW IS THE ALPHABET
		Set<String> classDay1 = new TreeSet<>();
		classDay1.add("Monday");
		classDay1.add("Tuesday");
		classDay1.add("Wednesday");
		classDay1.add("Thursday");
		classDay1.add("Friday");
		classDay1.add("Saturday");
		classDay1.add("Sunday");

		System.out.println("\n"+classDay1);
		System.out.println("-----------------------------");
		for (Object days1 : classDay1) {
			Thread.sleep(100);
			System.out.print(days1 + " ");
		}
		System.out.println("\n-----------------------------");
		Iterator<String> day1 = classDay1.iterator();
		while (day1.hasNext()) {
			System.out.print(day1.next() + " ");
		}
	}
}
