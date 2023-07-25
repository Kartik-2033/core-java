package com.myjavacode.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>Finding Index Of Arrays!</h3>
 * <p>
 * This Program Show How To Find Index Of Arrays Using Linear Search!
 * </p>
 * <h2>Created LinearSearch Class</h2>
 * <h4>Created findIndex method</h4>
 * <p>
 * This Method Used to find index of array
 * </p>
 * 
 * @param myArray      : Array
 * @param enterElement : Find Index Of Enter Element
 * @return -1 If Element Not Found.
 * 
 * @author Kartik
 */
public class LinearSearch {

	private static int findIndex(int myArray[], int enterElement) {
		// Checking If array is null or not!
		if (myArray == null) {
			System.out.println("Array Is null.");
		}

		// Find length of array
		int lengthArray = myArray.length;
		// Starting Point of array
		int arrayElement = 0;

		// Traverse in array
		while (arrayElement < lengthArray) {
			/*
			 * If the arrayElement is enterElement are both same. Then return index of
			 * element.
			 */
			if (myArray[arrayElement] == enterElement) {
				return arrayElement;
			} else {
				arrayElement++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] myArray = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		System.out.println("Array : " + Arrays.toString(myArray)); // Print an Array using standard library Arrays
		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Element : ");
		int enterElement = scanner.nextInt();
		// Find the index of enter element
		System.out.println("Index position of " + enterElement + " is : " + findIndex(myArray, enterElement));
		scanner.close();
	}

}