package com.class133_SetReview_MAP;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		/**
		 * How can you remove all duplicates from ArrayList?
		 */

		List<String> aList = new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		// NO ORDER
		Set<String> list= new HashSet<>(aList);
		System.out.println(list);

		// ORDER IN HOW YOU ADD
		Set<String> list1 = new LinkedHashSet<>(aList);
		System.out.println(list1);

		// ORDER IN VALUES (A-Z) AND (0-9)
		Set<String> list2 = new TreeSet<>(aList);
		System.out.println(list2);

	}
}
