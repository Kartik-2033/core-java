package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>If-else condition</h3>
 * <p>
 * This program shows whether you are above 18 or not.
 * </p>
 * 
 * @author Kartik
 */
class IfElseCondition {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		// Take input from the user and store it in yourAge variable
		System.out.println("Enter your age : ");
		int yourAge = scannerObject.nextInt();
		if (yourAge > 18) {
			System.out.print("Age is above than 18");
		} else {
			System.out.print("Age is below than 18");
		}
		scannerObject.close();
	}

}