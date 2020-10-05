package com.class132_HashSet_UtilityClass;

import java.util.*;

public class HashSetIntro {
	
	public static void main(String[] args) {
		
		HashSet <Integer> hset = new HashSet<>();
		hset.add(12);
		hset.add(99);
		hset.add(15);
		hset.add(65);
		
		System.out.println(hset.size());
		//SET doesn't keep the order
		System.out.println(hset);
		System.out.println(hset.contains(12));
		
		hset.add(12);
		hset.add(99);
		System.out.println(hset.size()); // it is 4 because SET interface doesn't accept duplicate values
		
		System.out.println("\n---FOR EACH LOOP---");
		//To retrieve all values from hash set
		for (int num : hset) {
			System.out.print(num +" ");
		}
		System.out.println("\n---ITERATOR---");
		Iterator <Integer> hset1 = hset.iterator();
		while(hset1.hasNext()) {
			System.out.print(hset1.next()+" ");
		}
		
		
		
	}
}
