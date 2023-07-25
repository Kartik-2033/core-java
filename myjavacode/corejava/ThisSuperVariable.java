package com.myjavacode.corejava;

/**
 * Write a program to illustrate super & This keyword
 * 
 * @author Kartik
 */
class SuperClass {

	void printData() {
		System.out.println("Super Class Called.");
	}

}

class ThisSuperVariable extends SuperClass {

	void printData() {
		System.out.println("ThisSuperVariable Class Called.");
	}

	void callMethods() {
		// 'this' invokes current class "ThisSuperVariable" prinData() method
		this.printData();
		// 'super' invokes current class "SuperClass" prinData() mehtod
		super.printData();
	}

	// Creating main method
	public static void main(String[] args) {
		ThisSuperVariable thisSuperVariable = new ThisSuperVariable();
		thisSuperVariable.callMethods();
	}

}