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
		// Taking the first name of the user and storing it in firstName
		System.out.println("Enter the First Name : ");
		String firstName = stringScanner.next();

		// Taking the last name of the user and storing it in lastName
		System.out.println("Enter the Last Name : ");
		String lastName = stringScanner.next();

		// Print both variable
		System.out.println("First Name Is : " + firstName);
		System.out.println("Last Name Is : " + lastName);

		System.out.println("Find Character At Index Of 2 in First Name : " + firstName.charAt(2));

		// The 'concat' function appends the lastname at the end of the firstname
		System.out.println("Append last name After first Name : " + firstName.concat(lastName));

		// The '.equals' function compares the first and last name
		System.out.println("Compare First name And last name : " + firstName.equals(lastName));

		// The 'indexOf' function= Search a string for the first occurrence of "t":
		System.out.println("Return Index Value Of 't' : " + firstName.indexOf("t"));
		stringScanner.close();
	}

}