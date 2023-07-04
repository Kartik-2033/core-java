/** 
*<h3>Inheritance!</h3>
* <p>This Program About Inheritance : Hierarchical Inheritance</p>
*@author Kartik
*/
package com.myjavacode.oopcConcepts;

/**
 * <p>
 * <h2>Created Parent class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>MulParentClass : Parent Base Method</b></li>
 * </ul>
 * <h4>Created Two Child Class</h4>
 * </p>
 * <ul>
 * <li><b>FirstChildClass</b></li>
 * <li><b>SecondChildClass</b></li>
 * </ul>
 */
class HirSonClass {

	void sonMethod() {
		System.out.println("He His My Son!!");
	}
}

/**
* <p>
* <h2>Created First Child class Inherited Parent Class</h2>
* <h4>Created Method</h4>
* </p>
* <ul>
* <li><b>childBaseMethodOne : First Child Base Method</b></li>
* </ul>
*/
class HirFatherClass extends HirSonClass {

	void fatherMethod() {
		System.out.println("I am His Father!");
	}
}

/**
 * <p>
 * <h2>Created Second Child class Inherited Parent Class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>childBaseMethodTwo : Second Child Base Method</b></li>
 * </ul>
 */
class HirMotherClass extends HirSonClass {

	void motherMethod() {
		System.out.println("I am his Mother!");
	}
}

public class HierarchicalInheritance {

	// created main method
	public static void main(String args[]) {
		HirFatherClass baseFatObj = new HirFatherClass(); // Created base Object For Father Class
		HirMotherClass baseMotObj = new HirMotherClass(); // Created base Object For Mother Class

		baseFatObj.fatherMethod(); // Calling Father Class 
		baseFatObj.sonMethod(); // Calling Son Class with base Object Father

		baseMotObj.motherMethod(); // Calling Mother class
		baseMotObj.sonMethod(); // Calling Son Class with base object Mother
	}

}