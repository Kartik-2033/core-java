package com.myjavacode.coreJava;

/**
*
* Use the loop for 10 numbers and stop the execution after 7 numbers and skip 5 number Using Break/Continue
* @author Kartik
*/

public class SkipNumber {

	public static void main(String[] args) {
		for (int startVar = 1; startVar <= 10; startVar++) {
			if (startVar == 8) {
				break;
			}
			else if (startVar == 5) {
				continue;
			}
		System.out.println(startVar);
		}
	}

}