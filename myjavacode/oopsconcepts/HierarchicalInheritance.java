package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This Program About Hierarchical Inheritance
 * </p>
 * 
 * @author Kartik
 */
class SonClass {

	void sonMethod() {
		System.out.println("He His My Son!!");
	}

}


class FatherClass extends SonClass {

	void fatherMethod() {
		System.out.println("I am His Father!");
	}

}

class MotherClass extends SonClass {

	void motherMethod() {
		System.out.println("I am his Mother!");
	}

}

public class HierarchicalInheritance {

	// Created main method
	public static void main(String args[]) {
		FatherClass fatherObject = new FatherClass(); // Created base Object For Father Class
		MotherClass motherObject = new MotherClass(); // Created base Object For Mother Class

		fatherObject.fatherMethod(); // Calling Father Class
		fatherObject.sonMethod(); // Calling Son Class with Object Father

		motherObject.motherMethod(); // Calling Mother class
		motherObject.sonMethod(); // Calling Son Class with object Mother
	}

}