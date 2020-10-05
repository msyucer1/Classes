package com.class126_Super_This;

public class UserTask extends UserInfo {

	/**
	 * 2. Write program: user class has a constructor that takes name and mobile
	 * number. Extend this class by userInfo that will have user address variable.
	 * Print users name, mobile number and address in userDetails method. Test your
	 * code.
	 */

	String name;
	String number;
	
	UserTask(String number , String name, String address) {
		this.name = name;
		this.number = number;
		super.address = address;
	}
	
	public void userDetails () {
		System.out.println(name+"'s phone number is "+number+" and his home address is "+address);
	}
	
	public static void main(String[] args) {
		UserTask obj = new UserTask("5447778654", "Mehmet", "Fairfax VA");
		obj.userDetails();
	}
}
