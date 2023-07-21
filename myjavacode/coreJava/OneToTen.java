package com.myjavacode.corejava;

/**
 * Write a program to demonstrate the use of while loop and do while loop. (E.g
 * print 1 to 10 numbers).
 * 
 * @author Kartik
 */

class OneToTen {

	// Printing data using while loop
	static void whileLoop() {
		System.out.println("Using While Loop");
		int start = 1;
		while (start <= 10) {
			System.out.print(start);
			start++;
		}
	}

	// Printing data using do while loop
	static void doWhileLoop() {
		System.out.println("Using Do While Loop");
		int start = 1;
		do {
			System.out.print(start);
			start++;
		} while (start <= 10);
	}

	public static void main(String[] args) {
		whileLoop();
		doWhileLoop();
	}

}