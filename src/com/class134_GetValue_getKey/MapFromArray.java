package com.class134_GetValue_getKey;

import java.util.*;

public class MapFromArray {

	public static void main(String[] args) {

		String[] names = { "Mehmet", "Aisha", "Bekir", "Skender", "Amina", "Danny" };
		Map<Integer, String> nameMap = new LinkedHashMap<>();

		int key = 1;
		for (String name : names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		// print key and values using entrySet(loop && Iterator)

		for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
			// String mapValue=entry.getKey()+" = "+entry.getValue();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		Iterator<Map.Entry<Integer, String>> it = nameMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry1 = it.next();
			System.out.println(entry1.getKey() + " and value is " + entry1.getValue());
			// System.out.println(valueFromMap);

		}
	}
}