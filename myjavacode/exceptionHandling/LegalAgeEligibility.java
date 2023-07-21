package com.myjavacode.exceptionhandling;

import java.util.Scanner;

/**
 * <h3>Exception Handling!</h3>
 * <p>
 * This Program Show How To Handle Exception Using Try, Catch, Finally & Throw!
 * </p>
 * <p>
 * Type Of Exception : RunTimeException > Unchecked > UserDefined Exception!
 * </p>
 * 
 * @author Kartik
 */
@SuppressWarnings("serial")
class YoungAge extends RuntimeException {

	YoungAge(String responseMessage) {
		super(responseMessage);
	}

}

public class LegalAgeEligibility {

	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your age : ");

		try {
			int enterAge = scanner.nextInt();// Take input from user
			if (enterAge <= 21) { // Check the condition
				throw new YoungAge("You are not eligible for Marriage");// If condition false throw a exception
			} else {
				System.out.println("You are eligible for Marriage");
			}
		} catch (YoungAge underAge) {
			System.out.println(underAge);// Catch the exception
		} catch (Exception e) {
			System.out.println("Invalid input");
		} finally {
			scanner.close();
		}
	}

}