package com.class134_GetValue_getKey;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {
	public static void main(String[] args) {

		Map<Integer, Person> person = new HashMap<>();
		person.put(1, new Person("Mehmet", "YUCER", 150000, 24));
		person.put(2, new Person("Bekir", "PEKDEMIR", 125000, 40));
		person.put(3, new Person("Omer", "AY", 50000, 12));
		person.put(4, new Person("Siyar", "SAHAR", 75000, 40));
		
		for (Person pers : person.values()) {
			pers.printPersonDetails();
		}
		
		
	}

}