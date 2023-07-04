/**
*<h3>Polymorphism!</h3>
* <p>This Program About Compile-Time Polymorphism : Method Overloading</p>
*@author Kartik
*/
package com.myjavacode.oopcConcepts;

/**
 * <p>
 * <h2>Created PolyOuter class</h2>
 * <h4>Created Two Method</h4>
 * </p>
 * <ul>
 * <li><b>polyMethod : One With two parameter</b></li>
 * <li><b>polyMethod : Second With three parameter</b></li>
 * </ul>
 */
class PolyOuter {

	static int polyMethod(int polyVar1, int polyVar2) {
		return polyVar1 + polyVar2; // sum of two variable
	}

	static int polyMethod(int polyVar1, int polyVar2, int polyVar3) {
		return polyVar1 + polyVar2 + polyVar3; // sum of three variable
	}

}

public class PolyMethodOverloading {

	// creating main method
	public static void main(String[] args) {
		System.out.println("Method With two arguement : " + PolyOuter.polyMethod(10, 10)); // calling two parameterized method
		System.out.println("Method With three arguement : " + PolyOuter.polyMethod(10, 10, 10)); // calling two parameterized method
	}

}