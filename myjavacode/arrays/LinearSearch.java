package com.myjavacode.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>Finding index of array element.</h3>
 * <p>
 * This program show how to find index of array element using Linear Search!
 * </p>
 * 
 * @param myArray
 * @param enterElement
 * @return -1 If Element Not Found.
 * @author Kartik
 */
public class LinearSearch {

	private static int findIndex(int myArray[], int enterElement) {
		// Checking if array is null or not!
		if (myArray == null) {
			System.out.println("Array Is null.");
		} else {
			// Find length of array
			int lengthArray = myArray.length;
			int arrayElement = 0;

			while (arrayElement < lengthArray) {
				if (myArray[arrayElement] == enterElement) {
					return arrayElement;
				} else {
					arrayElement++;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] myArray = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		System.out.println("Array : " + Arrays.toString(myArray));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Element : ");
		int enterElement = scanner.nextInt();
		System.out.println("Index position of " + enterElement + " is : " + findIndex(myArray, enterElement));
		scanner.close();
	}

}
