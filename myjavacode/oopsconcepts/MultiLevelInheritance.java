package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This Program About Multi-level Inheritance
 * </p>
 * <p>
 * <h2>Created Grandfather class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>grandfatherMethod : Grand Father method</b></li>
 * </ul>
 * 
 * @author Kartik
 */
class Grandfather {

	void grandfatherMethod() {
		System.out.println("I am thier Grand father!");
	}

}

/**
 * <p>
 * <h2>Created Father class Inherited GrandFather class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>fatherMethod : Parent Base Method</b></li>
 * </ul>
 */
class FatherClass extends Grandfather {

	void fatherMethod() {
		System.out.println("He is My Son!");
	}

}

/**
 * <p>
 * <h2>Created Son class Inherited Father Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>sonMethod : Son Method</b></li>
 * </ul>
 */
class SonClass extends FatherClass {

	void sonMethod() {
		System.out.println("He is My Garnd Son!");
	}

}

public class MultiLevelInheritance {

	// created main method
	public static void main(String args[]) {
		SonClass showReltion = new SonClass(); // Created base Object
		showReltion.grandfatherMethod(); // CallingSecond Grand father Class with base Object
		showReltion.fatherMethod(); // Calling Parent Child Class with base Object
		showReltion.sonMethod(); // Calling Son Child Class with base Object
	}

}