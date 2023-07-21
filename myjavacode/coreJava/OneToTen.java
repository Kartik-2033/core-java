package com.myjavacode.corejava;

/**
 * Write a program to demonstrate the use of while loop and do while loop. (E.g
 * print 1 to 10 numbers).
 * 
 * @author Kartik
 */

class OneToTen {

	public static void main(String[] args) {
		// Created variable For Loop Start
		int printNumber = 1;
		// Starting do while loop
		do {
			System.out.println(printNumber);
			printNumber++;
		} while (printNumber <= 10);
	}

}