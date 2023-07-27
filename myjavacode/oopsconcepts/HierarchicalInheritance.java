package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This program about hierarchical inheritance
 * </p>
 * 
 * @author Kartik
 */
class SonClass {

	void sonMethod() {
		System.out.println("He his my son!");
	}

}

class FatherClass extends SonClass {

	void fatherMethod() {
		System.out.println("I am his father!");
	}

}

class MotherClass extends SonClass {

	void motherMethod() {
		System.out.println("I am his mother!");
	}

}

public class HierarchicalInheritance {

	// Created main method
	public static void main(String args[]) {
		FatherClass fatherObject = new FatherClass(); // Created base object for father class
		MotherClass motherObject = new MotherClass(); // Created base object for mother class

		fatherObject.fatherMethod(); // Calling father class
		fatherObject.sonMethod(); // Calling son class with object father

		motherObject.motherMethod(); // Calling mother class
		motherObject.sonMethod(); // Calling son class with object Mother
	}

}