package com.myjavacode.corejava;

/**
 * Write a program to demonstrate static methods, variables, and blocks
 * 
 * @author Kartik
 */
public class Static {

	// Create static variables
	static int staticVar1 = 10;
	static int staticVar2;

	// Create static method
	static void staticMethod (int staticVar3) {
		System.out.println("Static method initialise.");
		System.out.println("First variable = " + staticVar1);
		System.out.println("Second variable = " + staticVar2);
		System.out.println("Third variable = " + staticVar3);
	}

	// Create static block
	static {
		System.out.println("Static block initialise.");
		staticVar2 = staticVar1 + 5;
	}

	public static void main(String args[]) {
		System.out.println("Main method initialise.");
		staticMethod(8);
	}

}