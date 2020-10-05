package com.class133_SetReview_MAP;

import java.util.*;

public class Task4 {

//	Create a map of Best Buy store.
//	Place item id and item name into it. 
//	Example (7664847 = Printer, 7879885= TV etc )
//	Print all keys and values from a Best Buy map using EntrySet.
	
	public static void main(String[] args) {
		
	Map <Object, Object> BestBuy = new LinkedHashMap<>(); 
	BestBuy.put(1101152, "TV Screen");
	BestBuy.put(2764577, "XBox");
	BestBuy.put(9675314, "PSP4");
	BestBuy.put(9875456, "Computers");
	BestBuy.put(8864320, "Electronics");
	BestBuy.put(9685533, "Netflix Products");
	
	
	System.out.println("---USING FOR EACH LOOP-----");
	for (Map.Entry entry : BestBuy.entrySet()) {
		System.out.println(entry.getKey()+": "+entry.getValue());
	}
	
	System.out.println("\n---USING ITERATOR-----");
	Iterator <Map.Entry<Object, Object>> MyBestBuy = BestBuy.entrySet().iterator();
	while(MyBestBuy.hasNext()) {
		Map.Entry<Object, Object> entry1 = MyBestBuy.next();
		System.out.println(entry1.getKey()+": "+entry1.getValue());
	}
	}
}
