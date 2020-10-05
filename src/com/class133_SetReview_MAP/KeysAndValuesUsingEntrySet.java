package com.class133_SetReview_MAP;

import java.util.*;

public class KeysAndValuesUsingEntrySet {

	public static void main(String[] args) {
		//Create a map to store userDetails(name, salary, department, title)
		
		Map <Object,Object> userDetailsMap = new TreeMap<>();
        userDetailsMap.put("Name", "Mehmet S YUCER");  //key + value = entry
        userDetailsMap.put("salary", 99000);
        userDetailsMap.put("Department", "IT");
        userDetailsMap.put("Title", "Automation Tester");
        
        System.out.println(userDetailsMap+"\n");
        
//        userDetailsMap.entrySet(); // returns set of entries
        for (Map.Entry entry:userDetailsMap.entrySet()) {
        	System.out.println(entry.getKey()+": "+entry.getValue());
        }
        
        Iterator<Map.Entry<Object,Object>> it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Object,Object> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
