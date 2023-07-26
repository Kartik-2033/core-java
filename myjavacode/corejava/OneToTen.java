package com.myjavacode.corejava;

/**
 * print numbers 1 to 10 using the While loop and do-while loop
 * 
 * @author Kartik
 */
class OneToTen {

	// Printing numbers using while loop
	static void whileLoop() {
		System.out.println("Using While Loop");
		int start = 1;
		while (start <= 10) {
			System.out.println(start);
			start++;
		}
	}

	// Printing numbers using do while loop
	static void doWhileLoop() {
		System.out.println();
		System.out.println("\nUsing Do While Loop");
		int start = 1;
		do {
			System.out.println(start);
			start++;
		} while (start <= 10);
	}

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

}