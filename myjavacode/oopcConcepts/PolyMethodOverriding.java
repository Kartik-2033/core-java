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
 * <li><b>Employee : same method name as owner class</b></li>
 * <li><b>StaffBoy : same method name as owner class</b></li>
 * </ul>
 */
class Owner {

	public void jobRole() {
		System.out.println("I am Owner Of Company!");
	}

}


class Employee extends Owner {

	@Override
	public void jobRole() {
		System.out.println("I am employee of company!!");
	}

}

class StaffBoy extends Owner {

	@Override
	public void jobRole() {
		System.out.println("I am Staff boy of company!!");
	}

}

class PolyMethodOverriding {

	//Creating main method
	public static void main(String args[]) {
		new Owner().jobRole();
		new Employee().jobRole();
		new StaffBoy().jobRole();
	}

}