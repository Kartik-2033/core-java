package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This Program About Inheritance : Hybrid Inheritance
 * </p>
 * <p>
 * <h2>Created Grandfather class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>reltionGrandFather : Display realtionship with grand father</b></li>
 * </ul>
 */
class Grandfather {

	public void reltionGrandFather() {
		System.out.println("He is Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Created Father class Inherited GrandFather Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>reltionFather : Display realtionship with father</b></li>
 * </ul>
 */
class Father extends Grandfather {

	public void reltionFather() {
		System.out.println("He is Ramesh (Father) And Son Of Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Created Mother class Inherited GrandFather Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>reltionMother : Display realtionship with mother</b></li>
 * </ul>
 */
interface Mother {

	public default void reltionMother() {
		System.out.println("She is Minaa (Mother) And Wife Of Ramesh!");
	}

}

/**
 * <p>
 * <h2>Created Son class Inherited Father Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>reltionGrandSon : Display realtionship with grand son</b></li>
 * </ul>
 */
class Son extends Father implements Mother {

	public void reltionGrandSon() {
		System.out.println("He is Suresh (Son) And Son Of Ramesh (Father) And Grnadson Of Kishor!");
	}

}

public class HybridInheritance {

	// created main method
	public static void main(String[] args) {
		Son showReltion = new Son();// Created obj for son class
		showReltion.reltionGrandFather();// Calling grand father class
		showReltion.reltionFather();// Calling father class
		showReltion.reltionMother(); // Calling mother class
		showReltion.reltionGrandSon();// Calling son class method
	}

}