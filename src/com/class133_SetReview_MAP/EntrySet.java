package com.class133_SetReview_MAP;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		Map <Object, Object> classroomMap = new LinkedHashMap<>();
		classroomMap.put("Table",20); // Entry = Key+Value
		classroomMap.put("Chair",60); // Entry<String,Integer>
		classroomMap.put("Screen",3);
		classroomMap.put("Student",60);
		classroomMap.put("Instructor",3);
		
		System.out.println(classroomMap+"\n");
		
		for (Map.Entry entry : classroomMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println("-------------------------------------");
//		entrySet()  returns you set of entry <STRING INTEGER>
		Iterator <Map.Entry<Object, Object>> classroomIterator = classroomMap.entrySet().iterator();
		while (classroomIterator.hasNext()) {
			Map.Entry<Object, Object> me = classroomIterator.next();
			System.out.println(me.getKey()+": "+me.getValue());
		}
	}
}
