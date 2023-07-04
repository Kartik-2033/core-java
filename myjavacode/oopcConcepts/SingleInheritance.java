/** 
*<h3>Inheritance!</h3>
* <p>This Program About Inheritance : Single Inheritance</p>
*@author Kartik
*/
package com.myjavacode.oopcConcepts;

/**
 * <p>
 * <h2>Created Parent class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>ParentClass : Parent Base Method</b></li>
 * </ul>
 */
class FatherClass {

	void parentBaseMethod() {
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

	void childBaseMethod() {
		System.out.println("He is my Son!");
	}

}

public class SingleInheritance {

	// created main method
	public static void main(String args[]) {
		SonClass baseObj = new SonClass(); // Created base Object

		baseObj.parentBaseMethod(); // Calling Parent Class with base Object
		baseObj.childBaseMethod(); // Calling Child Class with base Object
	}

}