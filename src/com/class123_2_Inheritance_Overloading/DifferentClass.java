package com.class123_2_Inheritance_Overloading;

import com.class123_inheritance_Overloading.InhScrumTeam;

public class DifferentClass extends InhScrumTeam {

	public static void main(String[] args) {
		
		DifferentClass Dc = new DifferentClass();
		
		Dc.method(); //available because it is protected
		
		// Dc.method1(); not available because it is default.
		
	}
}
