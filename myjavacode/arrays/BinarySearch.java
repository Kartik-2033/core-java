/**
*<h3>Finding Index Of Arrays!</h3>
*<p>This Program Show How To Find Index Of Arrays Using Binary Serach!</p>
*@author Kartik
*/
package com.myjavacode.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h2>Created findIndex method</h2>
 * <p>This Method Used to find index of array</p>
 * <p>
 * <b>Note</b>: Binary Serach Only Work if array is sorted.
 * </p>
 * @param myArray : Array
 * @param enterElement : Find Index Of Enter Element
 * @return -1 If Element Not Found.

 * @author Kartik
 */
public class BinarySearch {

	public static int findIndex(int myArray[], int enterEle) {
		int arrayIndex = Arrays.binarySearch(myArray, enterEle);
		return (arrayIndex < 0) ? -1 : arrayIndex;
	}

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 5, 6, 7};

		System.out.println("Array : "+ Arrays.toString(myArray)); //Print an Array using standard library Arrays

		//taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Element : ");

		int enterElement = scanner.nextInt();

		//Find the index of enter element
		System.out.println("Index position of "+ enterElement +" is : " + findIndex(myArray, enterElement));

		scanner.close();
	}

}