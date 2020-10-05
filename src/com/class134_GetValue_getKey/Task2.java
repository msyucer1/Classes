package com.class134_GetValue_getKey;

import java.util.*;

public class Task2 {

	
	 /* 
	 * 2. Write a program to check which employee gets highest salary use hashmap
	 * employee name as key and salary amount as the value. Output example: John
	 * Smith=100000.
	 */

	public static void main(String[] args) {
		
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("John", 75000);
		salaryMap.put("James", 10000);
		salaryMap.put("Frank", 82000);
		salaryMap.put("David", 78000);
		salaryMap.put("Jordan", 175000);
		
		int maxSalary = 0;
		String key = null;
		
		for(Map.Entry <String,Integer> Entry:salaryMap.entrySet()) {
			if(Entry.getValue()>maxSalary) {
				maxSalary = Entry.getValue();
				key = Entry.getKey();
			}
		}
		System.out.println(maxSalary+ " belongs to "+key);
	}
}
