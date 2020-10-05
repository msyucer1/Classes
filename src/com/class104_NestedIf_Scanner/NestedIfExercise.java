package com.class104_NestedIf_Scanner;

import java.util.Scanner;

public class NestedIfExercise {

	public static void main(String[] args) {

		/*
		 * Write a program that prints out if it is good weather to go for any activity
		 * or not
		 * 
		 * If the temperature is between 40 degrees and 80 degrees inclusive & no rain
		 * --> we will go for hiking otherwise--> we will not go hiking
		 * 
		 * If temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		 * otherwise--> we are not going snowboarding
		 * 
		 * it if temperature is more than 80 & sunny --> go to the beach otherwise-->
		 * not go to the beach
		 */

		Scanner scan;
		Boolean snow, sunny, rainy;
		int temp;
		String activity;

		scan = new Scanner(System.in);
		System.out.println("Please enter today's temperature: ");
		temp = scan.nextInt();
		if (temp > 80) {
			System.out.println("The weather is sunny today, is it true?: ");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "You can go to the beach.";
			} else {
				activity = "You can stay at home.";
			}
		} else if (temp >= 40 && temp <= 80) {
			System.out.println("The weather is rainy today, is it true?: ");
			rainy = scan.nextBoolean();
			if (rainy) {
				activity = "You can Watch some movie.";
			} else {
				activity = "You can go outside, you can do hiking!";
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("The weather is snowy today, Is it true?: ");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "You can go snowboarding or watch snow while you'r drinking coffee.";
			} else {
				activity = "You can do more coding exercises.";
			}
		}else {
			activity = "Unknown"; }
		// If you don't write here unknown line 59 gives you an error (Doesn't initiliaze activity)
	// If you write out of range temp. It should find assigned value for activity. Because you declared activity. 
// All variables which have declared, should have value.
		
		System.out.println(activity);
	}
}
