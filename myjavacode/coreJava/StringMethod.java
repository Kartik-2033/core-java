package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * Write a program to show use of String Method
 * 
 * @author Kartik
 */

public class StringMethod {

	// Creating Main Method
	public static void main(String[] args) {
		Scanner stringScanner = new Scanner(System.in);
		// Taking Input First Name From User Store In firstName
		System.out.println("Enter the First Name : ");
		String firstName = stringScanner.next();

		// Taking Input Last Name From User Store In lastName
		System.out.println("Enter the Last Name : ");
		String lastName = stringScanner.next();

		// Print both variable
		System.out.println("First Name Is : " + firstName);
		System.out.println("Last Name Is : " + lastName);

		System.out.println("Find Character At Index Of 2 in First Name : " + firstName.charAt(2));

		// concat Append lastName at end Of firstName
		System.out.println("Append last name After first Name : " + firstName.concat(lastName));

		// equals Append lastName at end Of firstName
		System.out.println("Compare First name And last name : " + firstName.equals(lastName));

		// indexOf Search a string for the first occurrence of "t":
		System.out.println("Return Index Value Of 't' : " + firstName.indexOf("t"));
		stringScanner.close();
	}

}