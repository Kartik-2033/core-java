package com.myjavacode.oopsconcepts;

/**
 * <h3>Polymorphism-Method Overloading</h3>
 * <p>
 * This program is about compile-time polymorphism.
 * </p>
 * <p>
 * <h2>Created PolyOuter class</h2>
 * <h4>Created Two Method</h4>
 * </p>
 * <ul>
 * <li><b>polyMethod : One With two parameter</b></li>
 * <li><b>polyMethod : Second With three parameter</b></li>
 * </ul>
 * 
 * @author Kartik
 */
class PolyOuter {

	static int sumMethod(int polyVar1, int polyVar2) {
		return polyVar1 + polyVar2; // sum of two variable
	}

	static int sumMethod(int polyVar1, int polyVar2, int polyVar3) {
		return polyVar1 + polyVar2 + polyVar3; // sum of three variable
	}

}

public class PolyMethodOverloading {

	// creating main method
	public static void main(String[] args) {
		System.out.println("Method With two arguement : " + PolyOuter.sumMethod(10, 10)); // Calling two parameterized
																							// method
		System.out.println("Method With three arguement : " + PolyOuter.sumMethod(10, 10, 10)); // Calling two
																								// parameterized method
	}

}