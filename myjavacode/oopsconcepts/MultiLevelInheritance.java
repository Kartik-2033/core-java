package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This program about 'Multi-level' inheritance
 * </p>
 * <p>
 * <h2>Created Grandfather class</h2>
 * 
 * @author Kartik
 */
class Grandfather {

	void grandfatherMethod() {
		System.out.println("I am thier Grand father!");
	}

}

// Created father class inherited 'GrandFather' class
class FatherClass extends Grandfather {

	void fatherMethod() {
		System.out.println("He is My Son!");
	}

}

// Created son class inherited 'Father' Class
class SonClass extends FatherClass {

	void sonMethod() {
		System.out.println("He is My Garnd Son!");
	}

}

public class MultiLevelInheritance {

	public static void main(String args[]) {
		SonClass showRelation = new SonClass(); // Created object
		showRelation.grandfatherMethod(); // Calling grand father class with object
		showRelation.fatherMethod(); // Calling parent child class with object
		showRelation.sonMethod(); // Calling son child class with object
	}

}