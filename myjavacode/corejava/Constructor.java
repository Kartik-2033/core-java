package com.myjavacode.corejava;

/**
 * <b>
 * <p>
 * This program shows how to calculate the sum of two numbers using a Default
 * constructor And Parameterized Constructor.
 * </p>
 * </b>
 * 
 * @author Kartik
 */
class Constructor {

	// Default Constructor created
	Constructor() {
		// Creating two defVar1 & defVar2 variables
		int defVar1 = 5;
		int defVar2 = 10;
		// Print the sum of two variables
		System.out.println("Default Constuctor is called");
		System.out.println("Sum Of Two Number " + (defVar1 + defVar2));
	}

	// Parameterized Constructor created
	Constructor(int parVar1, int parVar2) { // Passing Two Variable In Argument
		System.out.println("Paramerterized Constuctor is called");
		System.out.println("Sum Of Two Number " + (parVar1 + parVar2));
	}

	// Creating Main Method
	public static void main(String[] args) {
		new Constructor();
		new Constructor(10, 15);
	}

}