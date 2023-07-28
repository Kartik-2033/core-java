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

	public static void main(String args[]) {
		FatherClass fatherObject = new FatherClass(); // Create base object for father class
		MotherClass motherObject = new MotherClass(); // Create base object for mother class

		fatherObject.fatherMethod(); // Call father class
		fatherObject.sonMethod(); // Call son class with object father

		motherObject.motherMethod(); // Call mother class
		motherObject.sonMethod(); // Call son class with object Mother
	}

}