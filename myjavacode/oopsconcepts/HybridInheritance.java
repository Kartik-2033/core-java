/** 
*<h3>Inheritance!</h3>
*<p>This Program About Inheritance : Hybrid Inheritance</p>
*@author Kartik
*/
package com.myjavacode.oopsconcepts;
/**
 * <p>
 * <h2>Created Grandfather class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>displayRel : Display realtionship</b></li>
 * </ul>
 */
class Grandfather {

	public void displayRelGrand() {
		System.out.println("He is Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Created Father class Inherited GrandFather Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>displayRel : Display realtionship</b></li>
 * </ul>
 */
class Father extends Grandfather {

	public void displayRelFather() {
		System.out.println("He is Ramesh (Father) And Son Of Kishor (Grand-Father)!");
	}

}

/**
 * <p>
 * <h2>Created Mother class Inherited GrandFather Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>displayRel : Display realtionship</b></li>
 * </ul>
 */
interface Mother {

	public default void displayRelMother() {
		System.out.println("She is Minaa (Mother) And Wife Of Ramesh!");
	}

}

/**
 * <p>
 * <h2>Created Son class Inherited Father Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>displayRel : Display realtionship</b></li>
 * </ul>
 */
class Son extends Father implements Mother{

	public void displayRelSon() {
		System.out.println("He is Suresh (Son) And Son Of Ramesh (Father) And Grnadson Of Kishor!");
	}

}

public class HybridInheritance {

	// created main method
	public static void main(String[] args) {
		Son showReltion = new Son();// created obj for son class
		showReltion.displayRelGrand();// calling grand father class
		showReltion.displayRelFather();// calling father class
		showReltion.displayRelMother(); // calling mother class
		showReltion.displayRelSon();// calling son class method
	}

}