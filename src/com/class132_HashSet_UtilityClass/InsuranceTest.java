package com.class132_HashSet_UtilityClass;

import java.util.*;

public class InsuranceTest {

	public static void main(String[] args) {

		car carObj = new car("Progressive", "Tesla");
		pet petObj = new pet("PetHealth", "Dog");
		health hObj = new health("Kaiser");

		ArrayList<Insurance> alist = new ArrayList<Insurance>();
		alist.add(carObj);
		alist.add(petObj);
		alist.add(hObj);
		
		
		System.out.println("-----ITERATOR-----");
		Iterator <Insurance> myObj = alist.iterator();
		while(myObj.hasNext()) {
			Insurance obje = myObj.next();
			System.out.println(obje.insuranceName);
			obje.getQuote();
			obje.cancelInsurance();
		}
		
		System.out.println("-----FOR LOOP-----");
		for (int i =0; i<alist.size(); i++) {
			Insurance obje1 = alist.get(i);
			System.out.println(obje1.insuranceName);
			obje1.getQuote();
			obje1.cancelInsurance();
		}
		
		System.out.println("-----FOR EACH LOOP-----");
		for(Insurance obje2 : alist) {
			System.out.println(obje2.insuranceName);
			obje2.getQuote();
			obje2.cancelInsurance();
		}
		
		System.out.println("-----WHILE LOOP-----");
		int count = 0;
		while(alist.size()>count) {
			Insurance obje3 = alist.get(count);
			System.out.println(obje3.insuranceName);
			obje3.getQuote();
			obje3.cancelInsurance();
			count++;
		}
	}
}