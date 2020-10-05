package com.class132_HashSet_UtilityClass;

public abstract class Insurance {

	String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();
	
	public abstract void cancelInsurance();
}
class car extends Insurance {
	String carModel;

	public car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println ("You can get quote by online "+insuranceName+" website");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel insurance within 15 days");
	}
}

class pet extends Insurance {
	String petType;

	public pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println ("You can get quote by coming "+insuranceName+"'s place");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel insurance within 30 days");
	}
}

class health extends Insurance {

	public health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println ("You can get quote by callin"+ insuranceName);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel insurance within 7 days");
	}
	
}