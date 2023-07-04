/**
*<h3>Collection!</h3>
*<p>This Program show how to add string Values Like (Your First Name, Middle Name & Last Name)!</p>
*@author Kartik
*/
package com.myjavacode.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsersDetails {

	public static void main(String[] args) {
		//userDetail : Creating Empty list to store data
		ArrayList<String> userDetail = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your First Name, Middle Name & Last Name : ");

		//store data in variables
		String userFirstName = scanner.nextLine();
		String userMiddleName = scanner.nextLine();
		String userLastName = scanner.nextLine();

		//Add data in empty list
		userDetail.add(userFirstName);
		userDetail.add(userMiddleName);
		userDetail.add(userLastName);

		System.out.println(userDetail);
		//Iterator variable 
		Iterator<String> printDel = userDetail.iterator();

		//printing data
		while(printDel.hasNext()) {

			System.out.println("Your First Name : "+printDel.next());
			System.out.println("Your Middle Name : "+printDel.next());
			System.out.println("Your Last Name : "+printDel.next());
		}
		scanner.close();
	}

}