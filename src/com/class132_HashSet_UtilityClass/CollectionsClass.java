package com.class132_HashSet_UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(120);
		intList.add(1220);
		intList.add(320);
		intList.add(6667);
		
		System.out.println("Collection before sorting "+intList);
		Collections.sort(intList);
		System.out.println("Collection after sorting "+intList);
		
		int [] array = {12,55,999,142,1};
		Arrays.sort(array);
		System.out.println("Array after sorting: ");
		for(int k : array) {
			System.out.print(k + " ");
		}
		
		
	}
}
