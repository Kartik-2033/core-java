package com.myjavacode.oopsconcepts;

/**
 * <h3>Polymorphism-Method overloading</h3>
 * <p>
 * This program is about compile-time polymorphism.
 * </p>
 * <p>
 * <h2>Create 'PolyOuter' class</h2>
 * <h4>Create two method</h4>
 * </p>
 * <ul>
 * <li><b>'sumMethod' : This method has two parameter</b></li>
 * <li><b>'sumMethod' : This method has three parameter</b></li>
 * </ul>
 * 
 * @author Kartik
 */
class PolyOuter {

	static int sumMethod(int number1, int number2) {
		return (number1 + number2); // Sum of two variable
	}

	static int sumMethod(int number1, int number2, int number3) {
		return (number1 + number2 + number3); // Sum of three variable
	}

}

class PolyMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Method with two arguement : " + PolyOuter.sumMethod(10, 10)); // Call two parameterized method
		System.out.println("Method with three arguement : " + PolyOuter.sumMethod(10, 10, 10)); // Call two parameterized method
	}

}