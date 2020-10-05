package com.class123_inheritance_Overloading;

public class OverloadingConstructor {

	public OverloadingConstructor() {
		System.out.println("I'm a constructor with no parameters");
	}

	public OverloadingConstructor(String str) {
		System.out.println("I'm a constructor with 1 parameter (1 String)");
	}

	public OverloadingConstructor(int a) {
		System.out.println("I'm a constructor with " + a + " parameters (1 int)");
	}

	public OverloadingConstructor(String str, String str1) {
		System.out.println("I'm a constructor with 2 parameters (2 Strings)");
	}

	public static void main(String[] args) {
		OverloadingConstructor obj = new OverloadingConstructor();
		OverloadingConstructor obj1 = new OverloadingConstructor(1);
		OverloadingConstructor obj2 = new OverloadingConstructor("name");
		OverloadingConstructor obj3 = new OverloadingConstructor("mhmt","mehmet");
				
	}
	
}
