package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This program about 'Multi-level' inheritance
 * </p>
 * <p>
 * <h2>Create Grandfather class</h2>
 * 
 * @author Kartik
 */
class Grandfather {

	void grandfatherMethod() {
		System.out.println("I am thier Grandfather!");
	}

}

// Create father class inherited 'GrandFather' class
class FatherClass extends Grandfather {

	void fatherMethod() {
		System.out.println("He is my son!");
	}

}

// Create son class inherited 'Father' class
class SonClass extends FatherClass {

	void sonMethod() {
		System.out.println("He is my Grandson.");
	}

}

public class MultiLevelInheritance {

	public static void main(String args[]) {
		SonClass showRelation = new SonClass(); // Create object
		showRelation.grandfatherMethod(); // Call grand father class with object
		showRelation.fatherMethod(); // Call parent child class with object
		showRelation.sonMethod(); // Call son child class with object
	}

}