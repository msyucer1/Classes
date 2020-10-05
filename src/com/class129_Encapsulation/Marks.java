package com.class129_Encapsulation;

public abstract class Marks {

	/**
	 * 2. We have to calculate the percentage of marks obtained in three subjects
	 * (each out of 100) by student A 
	 * and in four subjects (each out of 100) by student B. 
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	 * It is inherited by classes ‘A’ and ‘B’ each having a method with the same name
	 * which returns the percentage of the students. The constructor of student A
	 * takes the marks in three subjects as its parameters and the marks in four
	 * subjects as its parameters for student B. Test your code
	 */

	int history;
	int english;
	int math;
	int science;
	abstract void getPercentage();
}

class StudentA extends Marks {

	StudentA(int history, int english, int math) {
		super.history = history;
		super.english = english;
		super.math = math;
	}

	@Override
	void getPercentage() {
		int average = ((history + english + math) / 3);
		System.out.println(average);
	}
}

class StudentB extends Marks {

	StudentB(int history, int english, int math, int science) {
		super.history = history;
		super.english = english;
		super.math = math;
		super.science = science;
	}

	@Override
	void getPercentage() {
		int average = ((history + english + math + science) / 4);
		System.out.println(average);
	}
}
