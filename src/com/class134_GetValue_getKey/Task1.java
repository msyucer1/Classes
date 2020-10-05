package com.class134_GetValue_getKey;

import java.util.*;

public class Task1 {

	/*
	 * 1.Create a Map from array of cities that will sort keys in alphabetical
	 * order. As a key store the name of the city and as a value store the length of
	 * the city name (Example: Paris=5, Moscow =6 etc..). If any city name is more
	 * than 7 characters remove that city ( use entrySet with Iterator ).
	 */
	
	public static void main(String[] args) {

		String[] city = { "Paris", "Moscow", "Ankara", "Budapest", "Athens", "Berlin", "Toronto" };

		Map<String, Integer> cities = new TreeMap<>();

		for (String cityy : city) {
			cities.put(cityy, cityy.length());
		}
		System.out.println(cities);

		Iterator<Map.Entry<String, Integer>> CityIt = cities.entrySet().iterator();
		while (CityIt.hasNext()) {
			if (CityIt.next().getValue() > 7) {
				CityIt.remove();
			}
		}
		System.out.println(cities);
	}
}
