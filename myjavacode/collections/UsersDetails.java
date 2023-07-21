package com.myjavacode.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <h3>Collection!</h3>
 * <p>
 * This Program show how to add string Values Like (Your First Name, Middle Name
 * & Last Name)!
 * </p>
 * 
 * @author Kartik
 */
public class UsersDetails {

	public static void main(String[] args) {
		// userDetailsList : Creating Empty list to store data
		ArrayList<String> userDetailsList = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your First Name, Middle Name & Last Name : ");

		// Store data in variables
		String userFirstName = scanner.nextLine();
		String userMiddleName = scanner.nextLine();
		String userLastName = scanner.nextLine();

		// Add data in empty list
		userDetailsList.add(userFirstName);
		userDetailsList.add(userMiddleName);
		userDetailsList.add(userLastName);

		System.out.println(userDetailsList);
		// Iterator variable
		Iterator<String> printUserDetails = userDetailsList.iterator();

		// Printing data
		while (printUserDetails.hasNext()) {
			System.out.println("Your First Name : " + printUserDetails.next());
			System.out.println("Your Middle Name : " + printUserDetails.next());
			System.out.println("Your Last Name : " + printUserDetails.next());
		}
		scanner.close();
	}

}