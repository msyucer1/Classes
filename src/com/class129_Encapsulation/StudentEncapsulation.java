package com.class129_Encapsulation;

public class StudentEncapsulation {
	private String name;
	private int age;

	// create setters to set the value
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		}
	}

	// create getters to return the value of the variable
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
