package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>Wrapper class</h3> 
 * Using wrapper classes, compare two variables.
 * <p>
 * 
 * @author Kartik
 */
public class WrapperClass {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);

		// Create primitive variable and store value in primitiveVar
		System.out.println("Enter the first number => ");
		int primitiveVar = scannerObject.nextInt();

		// Create primitive variable and store value in primitiveVar2
		System.out.println("Enter the second number => ");
		int primitiveVar2 = scannerObject.nextInt();

		Integer wrapperVar = primitiveVar;
		Integer wrapperVar1 = primitiveVar2;

		if (wrapperVar == wrapperVar1) {
			System.out.println("Both numbers are same!");
		} else {
			System.out.println("Both numbers are different!");
		}
		scannerObject.close();
	}

}