package com.myjavacode.collection;

import java.util.*;

/**
 * <h3>Comparable-Comparator interface!</h3>
 * <p>
 * This Program shows how to sort data using comparable & comparator!
 * </p>
 * <h3>StudentData Class!</h3>
 * <p>
 * This Class implements Comparable<StudentData> interface!
 * </p>
 * 
 * @author Kartik
 */
class StudentData implements Comparable<StudentData> {

	// Creating two local variable
	String studentName;
	int studentAge;

	public StudentData(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public String getName() {
		return studentName;
	}

	@Override
	public int compareTo(StudentData thatStudent) {
		if (this.studentAge > thatStudent.studentAge) // Check the condition
			return 1; // If true than swap the data
		else
			return -1; // If false than leave the data as it is
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
		studentList.add(new StudentData("Kartik", 21));
		studentList.add(new StudentData("John", 12));
		studentList.add(new StudentData("Parru", 18));
		studentList.add(new StudentData("Sonaa", 20));

		System.out.println(": Data without sorted :");
		for (StudentData student : studentList)
			System.out.println("Student name : " + (student.getName()) + ", Age : " + (student.studentAge));

		// Sorting data using Comparable
		System.out.println("\n: Data sorting according to students age(ASC) :");
		Collections.sort(studentList);
		for (StudentData student : studentList)
			System.out.println("Student name : " + (student.getName()) + ", Age : " + (student.studentAge));

		// Sorting data using Comparator
		System.out.println("\n: Data sorting according to students name(ASC) :");
		// Created Comparator object
		NameComparator comObj = new NameComparator();
		Collections.sort(studentList, comObj);
		for (StudentData student : studentList)
			System.out.println("Student name : " + (student.getName()) + ", Age : " + (student.studentAge));
	}

}