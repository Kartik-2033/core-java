package com.myjavacode.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <h3>Collection-ArrayList!</h3>
 * <p>
 * This Program shows how to add string Values Like (Your First Name, Middle
 * Name& Last Name) in ArrayList.
 * </p>
 * 
 * @author Kartik
 */
public class UsersDetails {

	public static void main(String[] args) {
		// 'userDetailsList' : Creating empty ArrayList to store data
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
		Iterator<String> printUserDetails = userDetailsList.iterator();

		while (printUserDetails.hasNext()) {
			System.out.println("First Name : " + printUserDetails.next());
			System.out.println("Middle Name : " + printUserDetails.next());
			System.out.println("Last Name : " + printUserDetails.next());
		}
		scanner.close();
	}

}