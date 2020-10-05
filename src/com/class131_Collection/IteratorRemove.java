package com.class131_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	// Let's create an ArrayList of integers from 1-10
	// remove all odds using iterator

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int a : array) {
			alist.add(a);
		}
		System.out.println(alist);
	
		Iterator <Integer> it = alist.iterator();
		while(it.hasNext()) {
			int number = it.next();
			if(number %2 != 0) {
				it.remove();
			}
		}
		System.out.println(alist);
	}
}
