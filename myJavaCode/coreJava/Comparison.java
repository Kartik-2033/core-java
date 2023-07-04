package com.myjavacode.coreJava;

import java.math.BigDecimal; //Import Package

/** 
*<h3>Check Age!</h3>
* <p>This Program Compare Wrapper Classes Like</p>
* <ul>
* <li>Integer</li>
* <li>String</li>
* <li>BigDecimal</li>
* </ul>
*@author Kartik
*/
class Comparison {

	public static void main(String[] args)	{
		// creating Two BigDecimal 2śśśś
		BigDecimal varBigDecimal1 = new BigDecimal(265321265);
		BigDecimal varBigDecimal2 = new BigDecimal(2653265);

		// creating Two Integer Variable
		Integer varInteger2 = 10;
		Integer varInteger1 = 10;

		// creating Two String Variable
		String varString1 = "Kartik";
		String varString2 = "Kartik";

		// Compare Two variables ' == ' method
		System.out.println(varBigDecimal1 == varBigDecimal2);

		System.out.println(varInteger1 == varInteger2);

		System.out.println(varString1 == varString2);

		// Compare  Two variable ' .equals ' method
		System.out.println(varBigDecimal1.equals(varBigDecimal2));

		System.out.println(varInteger1.equals(varInteger2));

		System.out.println(varString1.equals(varString2));
	}

}