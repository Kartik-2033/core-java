package com.myjavacode.corejava;

/**
 * Write a program to illustrate super & This keyword
 * 
 * @author Kartik
 */

class Parent {

	// Instance variable
	int parentVar1 = 10;
	// Static variable
	static int parentVar2 = 20;

}

class ThisSuperVariable extends Parent {

	@SuppressWarnings("static-access")
	void innerMethod() {
		// Refer To Current Class
		this.parentVar1 = 100;
		System.out.println("Inner Class Variable = " + (parentVar1));
		// Refer To Parent class
		System.out.println("Parent Class Variable = " + (super.parentVar2));
	}

	// Creating main method
	public static void main(String[] args) {
		// Calling inner method
		new ThisSuperVariable().innerMethod();
	}

}