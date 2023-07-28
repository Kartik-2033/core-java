package com.myjavacode.oopsconcepts;

/**
 * <h3>Inheritance</h3>
 * <p>
 * This program about single inheritance
 * </p>
 * <p>
 * <h2>Create parent class : Father class</h2>
 * <h2>Create child class : Son class extends father class</h2>
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
		System.out.println("He is my son!");
	}

}

public class SingleInheritance {

	public static void main(String args[]) {
		SonClass sonClass = new SonClass();
		sonClass.fatherMethod();
		sonClass.sonMethod();
	}

}