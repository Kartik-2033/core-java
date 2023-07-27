package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance</h3>
 * <p>
 * This program about single inheritance
 * </p>
 * <p>
 * <h2>Created Parent class : Father class</h2>
 * <h2>Created child class : Son class extends father class</h2>
 * 
 * @author Kartik
 */
class FatherClass {

	void fatherMethod() {
		System.out.println("I am his father!");
	}

}

class SonClass extends FatherClass {

	void sonMethod() {
		System.out.println("He is my Son!");
	}

}

public class SingleInheritance {

	public static void main(String args[]) {
		SonClass sonClass = new SonClass();
		sonClass.fatherMethod();
		sonClass.sonMethod();
	}

}