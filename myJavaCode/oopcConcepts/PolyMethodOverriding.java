/** 
*<h3>Polymorphism!</h3>
* <p>This Program About Compile-Time Polymorphism : Method Overriding</p>
*@author Kartik
*/
package com.myjavacode.oopcConcepts;

/**
 * <p>
 * <h2>Created Parent class : Owner</h2>
 * <h4>Created Child Class</h4>
 * </p>
 * <ul>
 * <li><b>Employee</b></li>
 * </ul>
 */
class Owner {

	void jobRole() {
		System.out.println("I am Owner Of Company!");
	}

}

/**
 * <p>
 * <h2>Created Child class : Employee</h2>
 * <h4>Created Same Method as Parent Class</h4>
 * </p>
 */
class Employee extends Owner {

	void jobRole() {
		System.out.println("I am employee of company!!");
	}
}


class PolyMethodOverriding {

	//Creating main method
	public static void main(String args[]) {
		Employee empObj = new Employee();// creating object For Employee
		Owner ownObj = new Owner();// creating object For Owner

		ownObj.jobRole();// calling method from owner
		empObj.jobRole();// calling method from employee
	}

}