package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>Check Age!</h3>
 * <p>
 * This Program shows whether you are above 18 or not.
 * </p>
 * 
 * @author Kartik
 */
class CheckAge {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		// Take Input from the user and store it in yourAge variable
		System.out.println("Enter Your Age :");
		int yourAge = scannerObject.nextInt();
		if (yourAge > 18) {
			System.out.print("Age is Above than 18");
		} else {
			System.out.print("Age is Below than 18");
		}
		scannerObject.close();
	}

}