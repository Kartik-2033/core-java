package com.myjavacode.corejava;

/**
 * <b>
 * <p>
 * This program shows how to calculate the sum of two numbers using a Default
 * constructor And Parameterized constructor.
 * </p>
 * </b>
 * 
 * @author Kartik
 */
class Constructor {

	// Default constructor created
	Constructor() {
		int number1 = 5;
		int number2 = 10;
		// Print the sum of two variables
		System.out.println("Default constuctor is called");
		System.out.println("Sum of two number " + (number1 + number2));
	}

	// Parameterized constructor created
	Constructor(int number1, int number2) {
		System.out.println("Paramerterized constuctor is called");
		System.out.println("Sum Of Two Number " + (number1 + number2));
	}

	public static void main(String[] args) {
		new Constructor();
		new Constructor(10, 15);
	}

}