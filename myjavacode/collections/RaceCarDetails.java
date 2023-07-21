package com.myjavacode.collections;

import java.util.HashSet;

/**
 * <h3>Collection-Set!</h3>
 * <p>
 * This Program show how to add Engine, Turbo, Tires, Nitro To Race Car!
 * </p>
 * 
 * @author Kartik
 */
public class RaceCarDetails {

	public static void main(String[] args) {
		// Creating Empty raceCar list
		HashSet<String> raceCar = new HashSet<String>();

		// Adding basic parts to race car
		raceCar.add("Engine");
		raceCar.add("Turbo");
		raceCar.add("Tires");
		raceCar.add("Nitro");
		raceCar.add("Nitro");

		// Display race car
		System.out.println("Parts added To Race Car: " + raceCar);

		// Remove 'nitro' element
		raceCar.remove("Nitro");
		System.out.println("After remove nitro raceCar : " + raceCar);

		// Check race car have 'engine' element
		System.out.println("Check Race car have engine: " + raceCar.contains("Engine"));

		// Check array is empty ?
		System.err.println("Race car is empty : " + raceCar.isEmpty());

		// Size of raceCar array
		System.err.println("How many parts added :" + raceCar.size());
	}

}