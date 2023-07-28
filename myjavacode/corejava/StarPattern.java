package com.myjavacode.corejava;

/**
 *
 * Print star pattern using for loop
 * 
 * @Note i for rows and j for columns row denotes the number of rows you want to print
 * @author Kartik
 */
class StarPattern {

	public static void main(String[] args) {
		// Outer loop for rows
		for (int i = 0; i < 5; i++) {
			// Inner loop for columns
			for (int j = 0; j <= i; j++) {
				// Print stars
				System.out.print("* ");
			}
			// Print new line
			System.out.println();
		}
	}

}