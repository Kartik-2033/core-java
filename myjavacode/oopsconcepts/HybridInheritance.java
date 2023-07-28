package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This program about hybrid inheritance
 * </p>
 * <p>
 * <h2>Create 'Grandfather' class</h2>
 * <h4>Create method</h4>
 * </p>
 * <ul>
 * <li><b>'relationGrandFather' : Display relationship with grand father</b></li>
 * </ul>
 * 
 * @author Kartik
 */
class Grandfather {

	public void relationGrandFather() {
		System.out.println("He is Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Create father class inherited 'GrandFather' Class</h2>
 * <h4>Create method</h4>
 * </p>
 * <ul>
 * <li><b>'relationFather' : Display relationship with father</b></li>
 * </ul>
 */
class Father extends Grandfather {

	public void relationFather() {
		System.out.println("He is Ramesh (Father) and son of Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Create mother class</h2>
 * <h4>Create Method</h4>
 * </p>
 * <ul>
 * <li><b>'relationMother' : Display relationship with mother</b></li>
 * </ul>
 */
interface Mother {

	public default void relationMother() {
		System.out.println("She is Minaa (Mother) and wife of Ramesh!");
	}

}

/**
 * <p>
 * <h2>Create son class inherited father class and mother class</h2>
 * <h4>Create Method</h4>
 * </p>
 * <ul>
 * <li><b>'relationGrandSon' : Display relationship with all family members</b></li>
 * </ul>
 */
class Son extends Father implements Mother {

	public void relationGrandSon() {
		System.out.println("He is suresh son of Ramesh (father) and Minaa (mother) and grandson of Kishor!");
	}

}

public class HybridInheritance {

	// Create main method
	public static void main(String[] args) {
		Son showRelation = new Son();// Create obj for son class
		showRelation.relationGrandFather();// Call grand father class
		showRelation.relationFather();// Call father class
		showRelation.relationMother(); // Call mother class
		showRelation.relationGrandSon();// Call son class method
	}

}