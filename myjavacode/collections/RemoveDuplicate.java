package com.myjavacode.collections;

import java.util.*;

/**
 * <h3>Collection!</h3>
 * <p>
 * This Program show how to add string Values Like (Your First Name, Middle Name & Last Name)!
 * </p>
 * 
 * @author Kartik
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		// dupAlphabet : Creating Empty list to store data
		List<String> dupAlphabet = new ArrayList<String>();

		// adding value
		dupAlphabet.add("A");
		dupAlphabet.add("B");
		dupAlphabet.add("C");
		dupAlphabet.add("D");
		dupAlphabet.add("A");
		dupAlphabet.add("C");
		dupAlphabet.add("E");
		dupAlphabet.add("E");
		dupAlphabet.add("E");

		System.out.println("List With duplicate elements : " + dupAlphabet);
		Set<String> alphBet = new LinkedHashSet<String>(dupAlphabet);
		System.out.println("List with unique elements : " + alphBet);
	}

}