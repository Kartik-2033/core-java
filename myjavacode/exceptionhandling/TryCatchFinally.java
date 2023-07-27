package com.myjavacode.exceptionhandling;

import java.util.Scanner;

/**
 * <h3>Exception handling!</h3>
 * <p>
 * This program demonstrates how to handle exceptions using try, catch, and
 * finally statements.
 * </p>
 * <p>
 * Type Of Exception : RunTimeException > Unchecked > Arithmetic Exception!
 * </p>
 * 
 * @author Kartik
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		int varOne = 0, varTwo = 0, varThird = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		varOne = scanner.nextInt();
		System.out.println("Enter second number : ");
		varTwo = scanner.nextInt();

		try {
			varThird = varOne / varTwo;
			System.out.println("::Try Block::");
			System.out.println("The division is : " + varThird); // If varTwo is equal to zero, then an error is thrown.
		} catch (ArithmeticException zeroDivisonException) {
			System.out.println("::Catch Block::");
			System.out.println("Number can not divided by zero"); // Catch the exception
		} finally {
			System.out.println("::Finally Block::");
			System.out.println("::This block execute if error occurs or not::");
			scanner.close();
		}
	}

}