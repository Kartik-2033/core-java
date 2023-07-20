/**
*<h3>Comparable-Comparator Interface!</h3>
*<p>This Program show sort data using comparable & comparator!</p>
*@author Kartik
*/
package com.myjavacode.collections;

import java.util.*;

/**
 * <h3>StudentData Class!</h3>
 * <p>
 * This Class implements Comparable<Studentdat> Interface!
 * </p>
 * 
 * @author Kartik
 */
class StudentData implements Comparable<StudentData> {

	// Creating Two Local Variable
	String studentName;
	int studentAge;

	/**
	 * <h2>Created findIndex method</h2>
	 * <p>
	 * This Method Used to find index of array
	 * </p>
	 * 
	 * @param studentName : String data
	 * @param studentAge  : int data
	 */
	public StudentData(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	/*
	 * <h4>getName Method</h4>
	 * 
	 * @return Student name
	 */
	public String getName() {
		return studentName;
	}

	@Override
	public int compareTo(StudentData ThatStudent) {
		if (this.studentAge > ThatStudent.studentAge) // Check the condition
			return 1; // If true than swap the data
		else
			return -1; // if false than leave the data as it is
	}

}

class NameComparator implements Comparator<StudentData> {

	@Override
	public int compare(StudentData studentOne, StudentData studentTwo) {
		return studentOne.getName().compareTo(studentTwo.getName());
	}

}

public class StudentDataSorting {

	public static void main(String[] args) {
		List<StudentData> studentList = new ArrayList<>();
		studentList.add(new StudentData("Paruu", 21));
		studentList.add(new StudentData("John", 12));
		studentList.add(new StudentData("Kartik", 18));
		studentList.add(new StudentData("Sonaa", 20));

		// Sorting data using Comparable
		System.out.println(": Data Sorting According Thier Age(ASC) :");
		Collections.sort(studentList);
		for (StudentData student : studentList)
			System.out.println("Student Name : " + (student.getName()) + " Age : " + (student.studentAge));

		// Sorting data using Comparator
		System.out.println("\n: Data Sorting According Thier Name(ASC) :");
		// Created Comparator object
		NameComparator comObj = new NameComparator();
		Collections.sort(studentList, comObj);
		for (StudentData student : studentList)
			System.out.println("Student Name : " + (student.getName()) + " Age : " + (student.studentAge));
	}

}