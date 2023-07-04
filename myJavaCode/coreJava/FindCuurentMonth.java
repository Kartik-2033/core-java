package com.myjavacode.coreJava;

import java.util.Scanner;
/** 
*<h3>Find Current Month!</h3>
* <p>This Program Provide Current Month Which User Inputed</p>
*@author Kartik
*/
class FindCuurentMonth {

	public static void main(String[] args) {
		// created variable of month
		Scanner scannerObject = new Scanner(System.in);

		// Take Input from user and store in varibale
		System.out.println("Enter the number of month");

		int monthNumber = scannerObject.nextInt();

		// start switch case loop

		switch (monthNumber) {

		case 1:
			System.out.println ("Current month is January");
			break;

		case 2:
			System.out.println ("Current month is Febuary");
			break;

		case 3:
			System.out.println ("Current month is March");
			break;

		case 4:
			System.out.println ("Current month is April");
			break;

		case 5:
			System.out.println ("Current month is May");
			break;

		case 6:
			System.out.println ("Current month is June");
			break;

		case 7:
			System.out.println ("Current month is July");
			break;

		case 8:
			System.out.println ("Current month is August");
			break;

		case 9:
			System.out.println ("Current month is September");
			break;

		case 10:
			System.out.println ("Current month is October");
			break;

		case 11:
			System.out.println ("Current month is November");
			break;

		case 12:
			System.out.println ("Current month is December");
			break;

		default:
			System.out.println ("You have entered an invalid number");
		}

		scannerObject.close();
	}

}