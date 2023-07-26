package com.myjavacode.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h3>Finding Index Of Arrays!</h3>
 * <p>
 * This program shows how to find an index of an array using Binary Search!
 * </p>
 * <p>
 * <b>Note</b>: Binary search only works if an array is sorted
 * </p>
 * 
 * @param myArray
 * @param enterElement
 * @return -1 If array element not found.
 * @author Kartik
 */
public class BinarySearch {

	private static int findIndex(int myArray[], int enterElement) {
		int arrayIndex = Arrays.binarySearch(myArray, enterElement);
		return (arrayIndex < 0) ? -1 : arrayIndex;
	}

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Array : " + Arrays.toString(myArray));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Element : ");
		int enterElement = scanner.nextInt();

		System.out.println("Index position of " + enterElement + " is " + findIndex(myArray, enterElement));
		scanner.close();
	}

}