/** 
*<h3>Inheritance!</h3>
* <p>This Program About Inheritance : Multi-level Inheritance</p>
*@author Kartik
*/
package com.myjavacode.oopcConcepts;

/**
 * <p>
 * <h2>Created Grandfather class</h2>
 * <h4>Created Method</h4>
 * </p>
 * <ul>
 * <li><b>grandfatherMethod : Grand Father method</b></li>
 * </ul>
 * <h4>Created Two Child Class</h4>
 * </p>
 * <ul>
 * <li><b>MulFatherClass</b></li>
 * <li><b>MulSonClass</b></li>
 * </ul>
 */
class MulGrandfather  {

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
 * <li><b>parentBaseMethod : Parent Base Method</b></li>
 * </ul>
 */
class MulFatherClass extends MulGrandfather {

	void parentBaseMethod() {
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
class MulSonClass extends MulFatherClass {

	void sonMethod() {
		System.out.println("He is My Garnd Son!");
	}

}

public class MultiLevelInheritance {

	// created main method
	public static void main(String args[]) {

		MulSonClass baseObj = new MulSonClass(); // Created base Object

		baseObj.grandfatherMethod(); // CallingSecond Grand father Class with base Object
		baseObj.parentBaseMethod(); // Calling Parent Child Class with base Object
		baseObj.sonMethod(); // Calling Son Child Class with base Object
	}

}