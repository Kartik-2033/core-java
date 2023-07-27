package com.myjavacode.corejava;

import java.math.BigDecimal; //Import Package

/**
 * <h3>Wrapper class</h3>
 * <p>
 * The following program compares wrapper classes such as :
 * </p>
 * <ul>
 * <li>Integer</li>
 * <li>String</li>
 * <li>BigDecimal</li>
 * </ul>
 * 
 * @author Kartik
 */
class Comparison {

	public static void main(String[] args) {
		// Creating two BigDecimal variables
		BigDecimal varBigDecimal1 = new BigDecimal(265321265);
		BigDecimal varBigDecimal2 = new BigDecimal(2653265);

		// Creating two Integer variables
		Integer varInteger2 = 10;
		Integer varInteger1 = 10;

		// Creating two String variables
		String varString1 = "Kartik";
		String varString2 = "Kartik";

		// Compare variables using ' == ' operators
		System.out.println(varBigDecimal1 == varBigDecimal2);
		System.out.println(varInteger1 == varInteger2);
		System.out.println(varString1 == varString2);

		// Compare variables using ' .equals ' method
		System.out.println(varBigDecimal1.equals(varBigDecimal2));
		System.out.println(varInteger1.equals(varInteger2));
		System.out.println(varString1.equals(varString2));
	}

}