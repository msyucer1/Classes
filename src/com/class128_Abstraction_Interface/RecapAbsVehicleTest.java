package com.class128_Abstraction_Interface;

public class RecapAbsVehicleTest {

	public static void main(String[] args) {
		Car obj = new BMW();	//Upcasting and run-time polymorphism
		obj.drive();
		obj.start();
		obj.stop();
		RecapAbsVehicle.displayTotalVehicles();
		
		new BMW();
		new Toyota();
		RecapAbsVehicle.displayTotalVehicles();
	}
}
