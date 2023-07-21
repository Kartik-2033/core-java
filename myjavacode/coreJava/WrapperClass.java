package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>Wrapper Class!</h3> Compare two variables of Wrapper class using Wrapper
 * classes.
 * <p>
 * 
 * @author Kartik
 */
public class WrapperClass {

	/** Creating Main Method */
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in); // For Input From User

		// Creating primitives Variable and Store value in primitiveVar
		System.out.println("Enter the First Number => ");
		int primitiveVar = scannerObject.nextInt(); // Store Value Store in primitives

		// Creating primitives Variable and Store value in primitiveVar
		System.out.println("Enter the Second Number => ");
		int primitiveVar2 = scannerObject.nextInt(); // Store Value Store in primitives

		Integer wrapperVar = primitiveVar; // Autoboxing = Converting primitiveVar into objects (wrapperVar)
		Integer wrapperVar1 = primitiveVar2; // Autoboxing = Converting primitiveVar into objects (wrapperVar)

		if (wrapperVar == wrapperVar1) {
			System.out.println("Both Are Same!");
		} else {
			System.out.println("Both Are Different!");
		}
		scannerObject.close();
	}

}