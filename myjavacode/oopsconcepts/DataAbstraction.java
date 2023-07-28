package com.myjavacode.oopsconcepts;

/**
 * <p>
 * <h3>Data-Abstraction!</h3>
 * <p>
 * This program is designed to help you find the interest rates of two banks.
 * </p>
 * <h2>Create world bank class</h2>
 * </p>
 * <ul>
 * <li><b>SbiBank class for finding SBI interest rates.</b></li>
 * <li><b>AxisBank class for finding AXIS interest rate</b></li>
 * </ul>
 * 
 * @author Kartik
 */
abstract class WorldBank {

	abstract void getInterestRate();

}

class SbiBank extends WorldBank {

	void getInterestRate() {
		System.out.println("SBI interest rate is 9.8%.");
	}

}

class AxisBank extends WorldBank {

	void getInterestRate() {
		System.out.println("AXIS interest rate is 10.1%.");
	}

}

public class DataAbstraction {

	public static void main(String[] args) {
		WorldBank findRateSbi = new SbiBank(); // Create object to call 'SbiBank' class
		findRateSbi.getInterestRate();
		WorldBank findRateAxis = new AxisBank(); // Create object to call 'AxisBank' class
		findRateAxis.getInterestRate();
	}

}