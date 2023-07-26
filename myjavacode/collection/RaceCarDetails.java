package com.myjavacode.collection;

import java.util.HashSet;

/**
 * <h3>Collection-HashSet!</h3>
 * <p>
 * This program demonstrates how to add string values such as "Engine", "Turbo",
 * "Tires", and "Nitro" to a HashSet.
 * </p>
 * 
 * @author Kartik
 */
public class RaceCarDetails {

	public static void main(String[] args) {
		// Creating empty 'raceCar' list
		HashSet<String> raceCar = new HashSet<String>();

		// Adding basic parts to race car
		raceCar.add("Engine");
		raceCar.add("Turbo");
		raceCar.add("Tires");
		raceCar.add("Nitro");
		raceCar.add("Nitro");

		// Display race car
		System.out.println("Parts added To Race Car : " + raceCar);

		// Remove 'nitro' element form list
		raceCar.remove("Nitro");
		System.out.println("After remove nitro raceCar : " + raceCar);

		// Check list have 'engine' element ?
		System.out.println("Check Race car have engine : " + raceCar.contains("Engine"));

		// Check list is empty ?
		System.err.println("Race car is empty : " + raceCar.isEmpty());

		// Size of list
		System.err.println("How many parts added : " + raceCar.size());
	}

}