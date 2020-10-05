package com.classReview4;

public class Nintendo extends GameConsoloe {
	public static void main(String[] args) {
		Nintendo obj = new Nintendo();
		obj.controller = "red & blue";
		obj.numberOfController = 4;
		obj.ifTVNeeded= true;
		obj.cd = false;
		obj.powerSource = "computer";
		//-----------------------------------------
		System.out.println(obj.cd + " if ccd needed");
		System.out.println(obj.controller + " controller color");
		System.out.println(obj.ifTVNeeded + " if tv needed");
		System.out.println(obj.numberOfController +" number of controller");
		System.out.println(obj.powerSource + " power source");
	}
}
