package com.class128_Abstraction_Interface;

public abstract class RecapAbsVehicle {

		static int vehicleCount;

		RecapAbsVehicle() {
			vehicleCount++;
		}
	
//	public abstract final void break(); can not override 	
//	private abstract void speed(); System doesn't accept it cuz private is not participate inheritance
//	public static abstract void gps(); we can inherit our static method but we can not override it.
	public abstract void drive();
	public abstract void start();
	public void stop() {
		System.out.println("Press brake to stop car");
	}
	
	public static void displayTotalVehicles() {
		System.out.println("Total vehicles that we created = "+vehicleCount);
	}
}

abstract class Car extends RecapAbsVehicle {

}
class BMW extends Car {

	@Override
	public void start() {
		System.out.println("Remote control to start your car");
	}

	@Override
	public void drive() {
		System.out.println("BMW cars drive fast");
	}
}

class Toyota extends Car {

	@Override
	public void start() {
		System.out.println("Push button to start your car");
	}

	@Override
	public void drive() {
		System.out.println("Toyota cars drive safe");
	}
}