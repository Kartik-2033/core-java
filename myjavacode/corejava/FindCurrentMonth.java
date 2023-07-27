package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>Find month name!</h3>
 * <p>
 * Using this program, you can find the name of the month.
 * </p>
 * 
 * @author Kartik
 */
class FindCurrentMonth {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the number of month : ");
		int monthNumber = scannerObject.nextInt();

		// Start switch case loop
		switch (monthNumber) {
		case 1:
			System.out.println("Month name is January");
			break;

		case 2:
			System.out.println("Month name is Febuary");
			break;

		case 3:
			System.out.println("Month name is March");
			break;

		case 4:
			System.out.println("Month name is April");
			break;

		case 5:
			System.out.println("Month name is May");
			break;

		case 6:
			System.out.println("Month name is June");
			break;

		case 7:
			System.out.println("Month name is July");
			break;

		case 8:
			System.out.println("Month name is August");
			break;

		case 9:
			System.out.println("Month name is September");
			break;

		case 10:
			System.out.println("Month name is October");
			break;

		case 11:
			System.out.println("Month name is November");
			break;

		case 12:
			System.out.println("Month name is December");
			break;

		default:
			System.out.println("You have entered an invalid number");
		}
		scannerObject.close();
	}

}