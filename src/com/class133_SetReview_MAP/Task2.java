package com.class133_SetReview_MAP;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
//		Create a map of a building. Store floor number and it is associated company name. 
//		(Example: 1= Google, 2=Syntax etc..). 
//		Insert 7 entries with duplicate keys and values.
//		Check how many entries you have?
//		Update company on a 4th floor
//		Remove company on the 7th floor
//		Print your map
		
		Map <Object,Object> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Facebook");
		building.put(5, "Twitter");
		building.put(6, "Twitter");
		building.put(6, "Apple");
		
		System.out.println("We have "+building.size()+" entries.");
		building.replace(4, "Oracle");
		System.out.println(building);
		building.remove(6);
		System.out.println("We have "+building.size()+" entries.");
		System.out.println(building);
		
		
	}
}
