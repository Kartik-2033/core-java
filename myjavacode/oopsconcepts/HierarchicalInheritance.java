package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This Program About Inheritance : Hierarchical Inheritance
 * </p>
 * <p>
 * <h2>Created SonClass class</h2>
 * </p>
 */
class SonClass {

	void sonMethod() {
		System.out.println("He His My Son!!");
	}

}

/**
 * <p>
 * <h2>Created Father class extend SonClass</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>fatherMethod : Print data</b></li>
 * </ul>
 */
class FatherClass extends SonClass {

	void fatherMethod() {
		System.out.println("I am His Father!");
	}

}

/**
 * <p>
 * <h2>Created Mother Child class extend SonClass</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>motherMethod : Print data</b></li>
 * </ul>
 */
class MotherClass extends SonClass {

	void motherMethod() {
		System.out.println("I am his Mother!");
	}

}

public class HierarchicalInheritance {

	// Created main method
	public static void main(String args[]) {
		FatherClass baseFatObj = new FatherClass(); // Created base Object For Father Class
		MotherClass baseMotObj = new MotherClass(); // Created base Object For Mother Class

		baseFatObj.fatherMethod(); // Calling Father Class
		baseFatObj.sonMethod(); // Calling Son Class with base Object Father

		baseMotObj.motherMethod(); // Calling Mother class
		baseMotObj.sonMethod(); // Calling Son Class with base object Mother
	}

}