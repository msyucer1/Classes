package com.class133_SetReview_MAP;

import java.util.*;

public class RetrieveOneValueFromSet {

	public static void main(String[] args) {

		Set<String> cars = new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Volkswagen");
		cars.add("BMW");
		cars.add("Hyundai");

		// 1st way to convert to the ArrayList
		// We created our list from set collection
		List<String> list = new ArrayList<String>(cars);
		System.out.println("List Collection:"+list);
		System.out.println(list.get(2));
		
		List<String> list2 = new ArrayList<String>();
		list2.addAll(cars);
		System.out.println("List Collection:"+list2);
		
		// 2nd way to convert to the Array
		Object[] array = cars.toArray();
		System.out.println("1st index element of array is "+array[1]);
		
	}
}
