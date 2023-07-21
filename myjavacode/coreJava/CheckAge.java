package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>Check Age!</h3>
 * <p>
 * This Program Show Your Above 18 Or Not
 * </p>
 * 
 * @author Kartik
 */
class CheckAge {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		// Take Input from user and store in varibale
		System.out.println("Enter Your Age :");
		int yourAge = scannerObject.nextInt();
		// Checking the age
		if (yourAge > 18) {
			System.out.print("Age is Above than 18");
		} else {
			System.out.print("Age is Below than 18");
		}
		scannerObject.close();
	}

}