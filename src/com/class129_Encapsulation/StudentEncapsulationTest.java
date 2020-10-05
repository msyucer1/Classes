package com.class129_Encapsulation;

public class StudentEncapsulationTest {

	public static void main(String[] args) {
		StudentEncapsulation obj=new StudentEncapsulation();

		obj.setName("Alex");
		obj.setAge(17);
		
		System.out.println(obj.getName()+" is "+obj.getAge());
	}
}
