package com.myjavacode.corejava;

/**
 * Program to use 'this' and 'super' keywords.
 * 
 * @author Kartik
 */
class SuperClass {

	void printData() {
		System.out.println("Super class called.");
	}

}

class ThisAndSuperVariable extends SuperClass {

	void printData() {
		System.out.println("ThisSuperVariable class called.");
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