package com.myjavacode.collection;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * <h3>Collection-HashMap!</h3>
 * <p>
 * This program demonstrates the use of HashMap with a student mark sheet example.
 * </p>
 * 
 * @author Kartik
 */
public class TenthMarksheets {

	public static void main(String[] args) {
		// Create a HashMap object called studentSheet
		HashMap<String, Integer> studentSheet = new HashMap<>();
		studentSheet.put("Id", 10);
		studentSheet.put("enrollNo", 1905);
		studentSheet.put("totalMarks", 700);
		studentSheet.put("obtainMarks", 628);
		studentSheet.put("firstClass", 0);

		// Display student data
		System.out.println("Student enrollment number : " + studentSheet.get("enrollNo"));
		System.out.println("Student obtain marks : " + studentSheet.get("obtainMarks"));
		System.out.println("Student pass with first class : " + studentSheet.containsValue(0));
		System.out.println("Check student marksheet is empty : " + studentSheet.isEmpty());

		// Find key of provided value
		for (Entry<String, Integer> startPoint : studentSheet.entrySet()) {
			if (startPoint.getValue() == 700) {
				System.out.println("The key of 700 is : " + startPoint.getKey());
			}
		}
	}

}