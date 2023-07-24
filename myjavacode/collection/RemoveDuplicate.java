package com.myjavacode.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <h3>Collection!</h3>
 * <p>
 * This Program show how to Remove duplicate value from list!
 * </p>
 * 
 * @author Kartik
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		// 'list' : Creating Empty list to store data
		List<String> list = new ArrayList<String>();

		// Adding value
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");

		System.out.println("List With duplicate elements : " + list);
		Set<String> alphBet = new LinkedHashSet<String>(list);
		System.out.println("List with unique elements : " + alphBet);
	}

}