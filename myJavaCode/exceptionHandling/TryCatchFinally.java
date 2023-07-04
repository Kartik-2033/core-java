/**
*<h3>Exception Handling!</h3>
*<p>This Program Show How To Handle Exception Using Try, Catch & Finally!</p>
*<p>Type Of Exception : RunTimeException > Unchecked > Arithmetic Exception!</p>
*@author Kartik
*/
package com.myjavacode.exceptionHandling;

import java.util.Scanner;

/**
*<h3>ArithmeticException Class</h3>
*<li>Show How Exception Occurs!</li>
*/
public class TryCatchFinally {

	public static void main(String[] args) {
		int varOne = 0 , varTwo = 0, varThird = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Interger Number : "); // Take Input From User
		varOne = scanner.nextInt();

		System.out.println("Enter Second Interger Number : ");
		varTwo = scanner.nextInt();

		//Start try, catch, & finally block 
		try	{

			varThird = varOne/varTwo;
			System.out.println ("::Try Block::");
			System.out.println("The Division is : "+ varThird); //If varTwo is zero than throw error

		}	catch (ArithmeticException zeroDivisonException) {

			System.out.println ("::Catch Block::");
			System.out.println("Number Can Not divided by zero"); // error catch

		}	finally {

			System.out.println("::Finally Block::");
			System.out.println("::This Block Execute if Error Occurs Or Not::");
			scanner.close();
		}
	}

}