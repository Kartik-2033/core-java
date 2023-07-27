package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This program about hybrid inheritance
 * </p>
 * <p>
 * <h2>Created 'Grandfather' class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>relationGrandFather : Display relationship with grand father</b></li>
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
 * <h2>Created father class inherited 'GrandFather' Class</h2>
 * <h4>Created method</h4>
 * </p>
 * <ul>
 * <li><b>relationFather : Display relationship with father</b></li>
 * </ul>
 */
class Father extends Grandfather {

	public void relationFather() {
		System.out.println("He is Ramesh (Father) And Son Of Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Created mother class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>relationMother : Display relationship with mother</b></li>
 * </ul>
 */
interface Mother {

	public default void relationMother() {
		System.out.println("She is Minaa (Mother) And Wife Of Ramesh!");
	}

}

/**
 * <p>
 * <h2>Created son class inherited father class and mother class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>relationGrandSon : Display relationship with all family members</b></li>
 * </ul>
 */
class Son extends Father implements Mother {

	public void relationGrandSon() {
		System.out.println("He is suresh Son Of Ramesh (father) And Minaa (mother) And grandson of Kishor!");
	}

}

public class HybridInheritance {

	// created main method
	public static void main(String[] args) {
		Son showRelation = new Son();// Created obj for son class
		showRelation.relationGrandFather();// Calling grand father class
		showRelation.relationFather();// Calling father class
		showRelation.relationMother(); // Calling mother class
		showRelation.relationGrandSon();// Calling son class method
	}

}