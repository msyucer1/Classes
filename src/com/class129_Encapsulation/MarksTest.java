package com.class129_Encapsulation;

public class MarksTest {
	
	public static void main(String[] args) {
	        
	        Marks obj=new StudentA(67, 88, 90);
	        obj.getPercentage();
	        
	        Marks obj1=new StudentB(88, 90, 67, 45);
	        obj1.getPercentage();
	        
	    }
	}