package com.myjavacode.corejava;

/**
 * <b>
 * <p>
 * A program for calculating the sum of two numbers using constructors.
 * </p>
 * </b>
 * 
 * @author Kartik
 */
class Constructor {

	// Default Constructor created
	Constructor() {
		// Creating two defVar1 & defVar2
		int defVar1 = 5;
		int defVar2 = 10;
		// Sum Of Two Number And Print Them
		System.out.println("Default Constuctor Sum Of Two Number" + " " + (defVar1 + defVar2));
	}

	// Parameterized Constructor created
	Constructor(int parVar1, int parVar2) { // Passing Two Variable In Argument
		System.out.println("Paramerterized Constuctor Sum Of Two Number" + " " + (parVar1 + parVar2));
	}

	// Creating Main Method
	public static void main(String[] args) {
		new Constructor();
		new Constructor(10, 15);
	}

}