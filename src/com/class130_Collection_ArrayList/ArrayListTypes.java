package com.class130_Collection_ArrayList;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		//generic arrays store only String Object
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Nick");
		names.add("Sam");
//		names.add(123);		not valid since we have generic arraylist of a type of a type of String
	
//		non generic ArrayList -  we can store different types of Objects
		ArrayList alist = new ArrayList();
		alist.add("String"); //String
		alist.add(123); //Integer
		alist.add(100.10); //Double
		alist.add(true); //Boolean
		alist.add('a'); //Char
		
		for(Object value : alist) {
			System.out.println(value);
		}
		
		ArrayList <Boolean> booleanArrayList = new ArrayList<Boolean>();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for(Object value : booleanArrayList) {
			System.out.println(value);
		}
	
	
	
	
	
	
	
	}
}
