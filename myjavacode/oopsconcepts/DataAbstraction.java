package com.myjavacode.oopsconcepts;

/**
 * <p>
 * <h3>Data Abstraction!</h3>
 * <p>
 * This Program About Find Interest Rate OF Two Bank!
 * </p>
 * <h2>Created World bank class</h2>
 * <h4>Created Two child class</h4>
 * </p>
 * <ul>
 * <li><b>SbiBank : Find SBI Interest Rate</b></li>
 * <li><b>AxisBank : Find AXIS Interest Rate</b></li>
 * </ul>
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

		WorldBank findRateAxis = new AxisBank();// Creating Object To call AxisBank Class
		findRateAxis.getInterestRate();
	}

}