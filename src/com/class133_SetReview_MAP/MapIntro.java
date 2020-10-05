package com.class133_SetReview_MAP;

import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		
		/**
		 * 	MAP is an interface that stores objects based on key+value =  entry
		 */
		
		// Map <key, value>
		Map <Integer, String> map = new HashMap<>();
		//add entries
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		System.out.println(map.get(101));
		System.out.println(map.size());
		
		//how to update value
		System.out.println("---REPLACE---");
		map.replace(103, "Said");
		System.out.println(map.get(103));
		
		//how to remove() 
		System.out.println("---REMOVE---");
		map.remove(104);
		System.out.println(map.size());
		
		//how to check if there are any values ion the map
		System.out.println("---ISEMPTY---");
		System.out.println(map.isEmpty());
		System.out.println(map);
		
		// to check is specific key/value is there
		System.out.println("---CONTAINS---");
		System.out.println(map.containsKey(103)); // checks if there is key as this
		System.out.println(map.containsValue("Said")); // checks if there is value as this
		
		map.put(105, "Jane");
		System.out.println(map);
		map.put(101, "Mehmet");
		System.out.println(map);
		map.put(null, "YUCER");
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		
		System.out.println("----------------------------------------------LOOK IMPLEMENTATION");
		Map <Object, Object> map1 = new HashMap<>();
		map1.put("Hello", true);
		System.out.println(map1);
		System.out.println("----------------------------------------------LOOK IMPLEMENTATION");
	}
}
