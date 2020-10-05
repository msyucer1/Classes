package com.class129_Encapsulation;

public abstract class Car {

	/**
	 * Create a Class Car that would have the following fields: regularPrice and
	 * color and method calculateSalePrice() which should be returning a price of
	 * the car. Create 2 sub classes: Sedan and Truck. The Truck class has field as
	 * weight and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * should include 10%discount, otherwise 20%discount. The Sedan class has field
	 * as length and also does it is own implementation of calculateSalePrice(): if
	 * length of sedan is >20 feet then returned price should include 5%discount,
	 * otherwise 10%discount
	 */

	int regularPrice;
	String color;

	public abstract int calculateSalePrice();
}

class Sedan extends Car {

	int length;
	int price;
	
	Sedan (int price, int length ){
		this.length = length;
		super.regularPrice = price;
	}
	
	public int calculateSalePrice() {
		if (length > 20) {
			return (regularPrice - (regularPrice * 5) / 100);
		} else {
			return (regularPrice - (regularPrice * 10) / 100);
		}
	}
}

class Truck extends Car {

	int weight;
	int price;
	
	Truck (int price, int weight){
		this.weight = weight;
		super.regularPrice = price;
	}

	public int calculateSalePrice() {
		
		if (weight > 2000) {
			return (regularPrice - (regularPrice * 10) / 100);
		}else {
			return  (regularPrice - (regularPrice * 20) / 100);
		}
	}
}
