package com.myjavacode.coreJava;
/**
* Write a program to illustrate super & This keyword
* @author Kartik
*/

class Parent {

	// instance variable
	int parentVar1 = 10;

	// static variable
	static int parentVar2 = 20;

}

class ThisSuperVariable extends Parent {

	void innerMethod() {
		// Refer To Current Class 
		this.parentVar1 = 100;
		System.out.println("Inner Class Variable = "+(parentVar1));

		// Refer To Parent class
		System.out.println("Parent Class Variable = "+(super.parentVar2));
	}

	// creating main method 
	public static void main(String[] args) {
		// Calling inner method 
		new ThisSuperVariable().innerMethod();
	}

}