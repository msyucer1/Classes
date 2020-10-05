package com.class131_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		
	Student stest = new Student("John", 123);
//	stest.printStudentDetails();
//	System.out.println(stest.name); ONLY NAME PRINT 
	Student stest1 = new Student("James", 285);
	Student stest2 = new Student("Anna", 144);
	Student stest3 = new Student("Katy", 199);
	Student stest4 = new Student("Emily", 184);
	
	ArrayList<Student> alist = new ArrayList<> (); 
	// When i write String in angle brackets I'm creating String objects ArrayList.
	// When i write Integer in it I'm creating Integer objects ArrayList
	// When i write Student here I'm creating Student objects ArrayList.
	// At the top i assigned student objects to Student references
	// at the bottom i added  objects to ArrayList
	alist.add(stest);
	alist.add(stest1);
	alist.add(stest2);
	alist.add(stest3);
	alist.add(stest4);
	
	for (Student myobje : alist) {
		myobje.printStudentDetails();
		System.out.println(myobje.name);
	}
	System.out.println("-------------------------------");
	Iterator<Student> it=alist.iterator();
	while(it.hasNext()) {
		Student obj=it.next();
		obj.printStudentDetails();
	}
	
	
	}
	
	
}
