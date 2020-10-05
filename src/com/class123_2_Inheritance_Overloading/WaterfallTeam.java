package com.class123_2_Inheritance_Overloading;

import com.class123_inheritance_Overloading.InhEmployee;

public class WaterfallTeam extends InhEmployee{
	
		// WaterfallTeam class extended by com.class123 package and Employee class.
	
	public static void main(String[] args) {
		
		WaterfallTeam wt = new WaterfallTeam();
		wt.salary1 = 125000;
		// Here salary1 is protected and salary is default
		// we can access protected variables or methods from different packages through inheritance.
		// but we cannot access to default variables or methods from different packages.
				
		
	}
}
