package com.myjavacode.exceptionhandling;

import java.util.Scanner;

/**
 * <h3>Exception handling!</h3>
 * <p>
 * This program demonstrates how to handle exceptions using try, catch, finally,
 * and throw statements.
 * </p>
 * <p>
 * Type of Exception : RunTimeException > Unchecked > UserDefined Exception!
 * </p>
 * 
 * @author Kartik
 */
@SuppressWarnings("serial")
class UnderAgeException extends RuntimeException {

	UnderAgeException(String responseMessage) {
		super(responseMessage);
	}

}

public class LegalAgeEligibility {

	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");

		try {
			int enterAge = scanner.nextInt();
			if (enterAge <= 21) {
				// If the condition is false, then an exception is thrown.
				throw new UnderAgeException("You are not eligible for marriage");
			} else {
				System.out.println("You are eligible for marriage");
			}
		} catch (UnderAgeException underAge) {
			System.out.println(underAge); // Catch the exception
		} catch (Exception e) {
			System.out.println("Invalid input");
		} finally {
			scanner.close();
		}
	}

}