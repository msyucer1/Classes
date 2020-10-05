package com.class133_SetReview_MAP;

import java.util.*;

public class RetrieveAllKeysAndValuesFromMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");

		System.out.println(map.keySet()); // gives you all keys
		System.out.println(map.values()); // gives you all values

		System.out.println("\n"+map);
		// How to get All KEYS
		// returns a Set of keys from the map
		
//		Set<Integer> keys = map.keySet();
		// how to print all keys?
		System.out.println("\nUsing for each loop--------------");
		for (Integer key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("\nUsing iterator--------------");
		Iterator<Integer> keysIt = map.keySet().iterator();
		while (keysIt.hasNext()) {
			Integer key = keysIt.next();
			System.out.println(key + ":" + map.get(key));
		}

		// How to get All Values
		// return collection of values from a map
//		Collection<String> valCol = map.values();
		System.out.println("\nUsing for each loop--------------");
		for (String value : map.values()) {
			System.out.print(value + ", ");
		}
		
		System.out.println("\n\nUsing iterator--------------");
		Iterator<String> itValues = map.values().iterator();
		while (itValues.hasNext()) {
			System.out.print(itValues.next() + ", ");
		}
	}
}
