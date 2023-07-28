package com.myjavacode.corejava;

/**
 *
 * Print numbers 1 to 10 using a loop, then the execution stops after 7
 * numbers, and also skipped number 5 using 'Break/Continue'.
 * 
 * @author Kartik
 */
public class SkipNumber {

	public static void main(String[] args) {
		for (int startVar = 1; startVar <= 10; startVar++) {
			if (startVar == 8) {
				break;
			} else if (startVar == 5) {
				continue;
			}
			System.out.println(startVar);
		}
	}

}