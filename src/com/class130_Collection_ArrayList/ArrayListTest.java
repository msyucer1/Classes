package com.class130_Collection_ArrayList;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Nick");
		names.add("Sam");
		
		System.out.println("---1st WAY---");		//USING FOR LOOP
		for (int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("---2nd WAY---");		// USING for each = enhanced = ADVANCED FOR LOOP
		for (Object name : names) { 
			System.out.println(name);
		}
		
		System.out.println("---3rd WAY---");		// USING ITERATOR METHOD
		Iterator <String> it = names.iterator();
		
//		it.hasNext();		Checks that if there is element or not one by one. Checks 1st after that 2nd
		while (it.hasNext()) {
			System.out.println(it.next()); //We said print next element
		}
	
	
	}
}
