package com.class133_SetReview_MAP;

import java.util.*;

public class Recap_HashSet {

	public static void main(String[] args) {
		
		Set <String> classDay = new HashSet<>();
		classDay.add("Monday");
		classDay.add("Tuesday");
		classDay.add("Wednesday");
		classDay.add("Thursday");
		classDay.add("Friday");
		classDay.add("Saturday");
		classDay.add("Sunday");
		
		System.out.println(classDay);
		System.out.println("-----------------------------");
		for (Object days :classDay) {
			System.out.print(days +" ");
		}
		System.out.println("\n-----------------------------");
		Iterator<String> day = classDay.iterator();
		while(day.hasNext()) {
			System.out.print(day.next()+" ");
		}
		
	}
}
