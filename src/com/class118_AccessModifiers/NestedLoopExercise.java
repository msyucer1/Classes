package com.class118_AccessModifiers;

public class NestedLoopExercise {

	public static void main(String[] args) {
		//NUMBERS (9999)
		NestedLoopExercise obj = new NestedLoopExercise();
		obj.printNumbers();		
	}

	void printNumbers() {
		for (int x = 0;x<10;x++) {
			for (int y = 0;y<10;y++) {
				for (int z = 0;z<10;z++) {
					for (int t = 0;t<10;t++) {
						System.out.println(x+""+y+""+z+""+t);
					}
				}
			}
		}
	}
}
