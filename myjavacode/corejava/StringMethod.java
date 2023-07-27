package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * Write a program to show use of String method
 * 
 * @author Kartik
 */
public class StringMethod {

	public static void main(String[] args) {
		Scanner stringScanner = new Scanner(System.in);
		// Taking the first name of the user and storing it in firstName
		System.out.println("Enter the first name : ");
		String firstName = stringScanner.next();

		// Taking the last name of the user and storing it in lastName
		System.out.println("Enter the last name : ");
		String lastName = stringScanner.next();

		// Print both variable
		System.out.println("First name is : " + firstName);
		System.out.println("Last name is : " + lastName);

		System.out.println("Find character at index of 2 in first name : " + firstName.charAt(2));

		// The 'concat' function appends the lastname at the end of the firstname
		System.out.println("Append last name after first Name : " + firstName.concat(lastName));

		// The '.equals' function compares the first and last name
		System.out.println("Compare first Name and last name : " + firstName.equals(lastName));

		// The 'indexOf' function search a string for the first occurrence of "t":
		System.out.println("Return index value of 't' : " + firstName.indexOf("t"));
		stringScanner.close();
	}

}