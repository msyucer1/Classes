package com.class133_SetReview_MAP;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {

		/**
		 * Create a map of countries with its capital. 
		 * Print all keys and values from a country map using for each loop and iterator. 
		 * Print all values from a country map using for each loop and iterator.
		 */

		Map <Object,Object> countries = new HashMap<>();
		countries.put("Turkey", "Ankara");
		countries.put("Afghanistan", "Kabil");
		countries.put("Australia", "Sydney");
		countries.put("Kazakhistan", "Astana");
		countries.put("Russia", "Moscow");
		countries.put("Hungry", "Budapest");
		
		//retrieve all keys by for each loop
		Set<Object> keys = countries.keySet();
		System.out.println("----------------Using For Each Loop--------------");
		for (Object key : keys) {
			System.out.println(key+": "+countries.get(key));
		}
		
		//retrieve all keys by Iterator
		System.out.println("\n----------------Using iterator--------------");
		Iterator<Object> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			Object keyy = keysIt.next();
			System.out.println(keyy+": "+countries.get(keyy));
		}
		
		//retrieve all values by for each loop
		Collection<Object> Values = countries.values();
		System.out.println("\n----------------Using For Each Loop--------------");
		for (Object value : Values) {
			System.out.print(value+", ");
		}
		
		System.out.println("\n\n----------------Using iterator--------------");
		Iterator<Object> iteratorValues = Values.iterator();
		while(iteratorValues.hasNext()) {
			System.out.print(iteratorValues.next()+", ");
		}
		
	}
}
