package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance!</h3>
 * <p>
 * This Program About Inheritance : Single Inheritance
 * </p>
 * <p>
 * <h2>Created Parent class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>ParentClass : Parent Base Method</b></li>
 * </ul>
 */
class FatherClass {

	void fatherMethod() {
		System.out.println("I am His father!");
	}

}

/**
 * <p>
 * <h2>Created Child class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>childBaseMethod : Child Base Method</b></li>
 * </ul>
 */
class SonClass extends FatherClass {

	void sonMethod() {
		System.out.println("He is my Son!");
	}

}

public class SingleInheritance {

	// created main method
	public static void main(String args[]) {
		SonClass sonClass = new SonClass(); // Created Object
		sonClass.fatherMethod(); // Calling Parent Class 
		sonClass.sonMethod(); // Calling Child Class 
	}

}