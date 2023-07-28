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

class ThisAndSuperKeywords extends SuperClass {

	void printData() {
		System.out.println("ThisAndSuperKeywords class called.");
	}

	void callMethods() {
		// 'this' invokes current class "ThisAndSuperKeywords".
		this.printData();
		// 'super' invokes parent class "SuperClass".
		super.printData();
	}

	public static void main(String[] args) {
		ThisAndSuperKeywords thisSuperVariable = new ThisAndSuperKeywords();
		thisSuperVariable.callMethods();
	}

}