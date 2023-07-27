package com.myjavacode.corejava;

/**
 * Program to use 'this' and 'super' Keywords.
 * 
 * @author Kartik
 */
class SuperClass {

	void printData() {
		System.out.println("Super Class Called.");
	}

}

class ThisAndSuperVariable extends SuperClass {

	void printData() {
		System.out.println("ThisSuperVariable Class Called.");
	}

	void callMethods() {
		// 'this' invokes current class "ThisSuperVariable".
		this.printData();
		// 'super' invokes parent class "SuperClass".
		super.printData();
	}

	// Creating main method
	public static void main(String[] args) {
		ThisSuperVariable thisSuperVariable = new ThisSuperVariable();
		thisSuperVariable.callMethods();
	}

}