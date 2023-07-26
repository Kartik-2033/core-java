package com.myjavacode.oopsconcepts;

/**
 * <p>
 * <h3>Data Abstraction!</h3>
 * <p>
 * This program is designed to help you find the interest rates of two banks.
 * </p>
 * <h2>Created World bank class</h2>
 * </p>
 * <ul>
 * <li><b>SbiBank Class for Finding SBI Interest Rates.</b></li>
 * <li><b>AxisBank Class for Finding AXIS Interest Rate</b></li>
 * </ul>
 * 
 * @author Kartik
 */
abstract class WorldBank {

	abstract void getInterestRate();

}

class SbiBank extends WorldBank {

	void getInterestRate() {
		System.out.println("SBI Interest Rate Is 9.8%.");
	}

}

class AxisBank extends WorldBank {

	void getInterestRate() {
		System.out.println("AXIS Interest Rate Is 10.1%.");
	}

}

public class DataAbstraction {

	public static void main(String[] args) {
		WorldBank findRateSbi = new SbiBank(); // Creating Object To call SbiBank Class
		findRateSbi.getInterestRate();
		WorldBank findRateAxis = new AxisBank(); // Creating Object To call AxisBank Class
		findRateAxis.getInterestRate();
	}

}