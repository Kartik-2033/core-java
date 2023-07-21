package com.myjavacode.corejava;

/**
 *
 * Write a program to demonstrate static methods, variables, and blocks
 * 
 * @author Kartik
 */
public class Static {

	// Created Static Variables
	static int staticVar1 = 10;
	static int staticVar2;

	// Created Static Method
	static void staticMethod(int staticVar3) {
		System.out.println("Static Method Initialise.");
		System.out.println("First Variable = " + staticVar1);
		System.out.println("Second Variable = " + staticVar2);
		System.out.println("Third Variable = " + staticVar3);
	}

	// Created Static Block
	static {
		System.out.println("Static Block Initialise.");
		staticVar2 = staticVar1 + 5;
	}

	public static void main(String args[]) {
		System.out.println("Main Method Initialise.");
		staticMethod(8);
	}

}