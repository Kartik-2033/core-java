package com.myjavacode.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <h3>Collection-List!</h3>
 * <p>
 * This program shows how to remove duplicate values from the list!
 * </p>
 * 
 * @author Kartik
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		// 'list' : Creating empty list to store data
		List<String> list = new ArrayList<String>();

		// Adding value in list.
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
		Set<String> uniqueListSet = new LinkedHashSet<String>(list);
		System.out.println("List with unique elements : " + uniqueListSet);
	}

}