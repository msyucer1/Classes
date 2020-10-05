package com.class134_GetValue_getKey;

import java.util.*;

public class CarTest {
	
	public static void main(String[] args) {
		//Create a map in which we will store the carNumber and  
		
//		Car car1 = new Car("Toyota", "Corolla");
//		Car car2 = new Car("Honda", "Accord");
//		Car car3 = new Car("Lada", "Priora");
//		
//		car1.printCarDetails();
//		car2.printCarDetails();
//		car3.printCarDetails();
		System.out.println("-------------------------------------");
		
		Map <Integer, Car> carMap = new HashMap<>();
		carMap.put(1, new Car("Toyota", "Corolla"));
		carMap.put(2, new Car("Honda", "Accord"));
		carMap.put(3, new Car("Lada", "Priora"));
		
		Collection <Car> CarValue = carMap.values();
		for(Car car : CarValue) {
			car.printCarDetails();
		}
	}
}
