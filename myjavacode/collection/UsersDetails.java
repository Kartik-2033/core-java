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
		String userFirstName, userMiddleName, userLastName;

		System.out.println("Enter your first name : ");
		userFirstName = scanner.next();

		System.out.println("Enter your middle name : ");
		userMiddleName = scanner.next();

		System.out.println("Enter your last name : ");
		userLastName = scanner.next();

		// Add all datas in 'userDetailsList'
		userDetailsList.add(userFirstName);
		userDetailsList.add(userMiddleName);
		userDetailsList.add(userLastName);

		System.out.println("Data added in list : " + userDetailsList);
		// System.out.println(userDetailsList);
		Iterator<String> printUserDetails = userDetailsList.iterator();

		while (printUserDetails.hasNext()) {
			System.out.println("First name : " + printUserDetails.next());
			System.out.println("Middle Name : " + printUserDetails.next());
			System.out.println("Last Name : " + printUserDetails.next());
		}
		scanner.close();
	}

}