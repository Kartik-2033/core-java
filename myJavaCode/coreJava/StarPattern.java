package com.myjavacode.coreJava;

/**
*
*Write a program to demonstrate the example of the ‘for’ loop and print the below-mentioned pattern
*@author Kartik 
*/

class StarPattern {

	public static void main (String[] args) {
		/*i for rows and j for columns
	row denotes the number of rows you want to print */ 

		//outer loop for rows
		for(int i=0; i<5; i++)	{

			//inner loop for columns
			for(int j=0; j<=i; j++)	{
				//prints stars
				System.out.print("* ");
			}

			//Print New Line 
			System.out.println();
		}
	}

}