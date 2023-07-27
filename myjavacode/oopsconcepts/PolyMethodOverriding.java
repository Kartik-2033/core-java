package com.myjavacode.oopsconcepts;

/**
 * <h3>Polymorphism-Method Overriding</h3>
 * <p>
 * This program is about run-time polymorphism. 
 * </p>
 * <p>
 * <h2>Created parent class : Owner</h2>
 * <h4>Created first child class : Employee extends Owner class</h4>
 * <h4>Created second child class : StaffBoy extends Owner class</h4>
 * 
 * @author Kartik
 */
class Owner {

	public void jobRole() {
		System.out.println("I am owner Of company!");
	}

}

class Employee extends Owner {

	@Override
	public void jobRole() {
		System.out.println("I am employee of company!");
	}

}

class StaffBoy extends Owner {

	@Override
	public void jobRole() {
		System.out.println("I am staff boy of company!");
	}

}

class PolyMethodOverriding {

	public static void main(String args[]) {
		new Owner().jobRole();
		new Employee().jobRole();
		new StaffBoy().jobRole();
	}

}