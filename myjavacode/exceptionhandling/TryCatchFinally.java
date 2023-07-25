package com.myjavacode.exceptionhandling;

import java.util.Scanner;

/**
 * <h3>Exception Handling!</h3>
 * <p>
 * This Program Shows How To Handle Exceptions Using Try, Catch & Finally!
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
		System.out.println("Enter First Number : "); 
		varOne = scanner.nextInt();
		System.out.println("Enter Second Number : ");
		varTwo = scanner.nextInt();

		// Start try, catch, & finally block
		try {
			varThird = varOne / varTwo;
			System.out.println("::Try Block::");
			System.out.println("The Division is : " + varThird); // If varTwo is zero than throw error
		} catch (ArithmeticException zeroDivisonException) {
			System.out.println("::Catch Block::");
			System.out.println("Number Can Not divided by zero"); // Error catch
		} finally {
			System.out.println("::Finally Block::");
			System.out.println("::This Block Execute if Error Occurs Or Not::");
			scanner.close();
		}
	}

}