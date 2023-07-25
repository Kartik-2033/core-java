package com.myjavacode.encapsulation;

/**
 * <h3>Encapsulation!</h3>
 * <p>
 * This Program About Encapsulation : This Program About set data from Main
 * file!
 * </p>
 * <p>
 * <h2>Created Student Data class</h2>
 * </p>
 * <ul>
 * <li><b>setStudentRollNo method : Set Student Roll Number</b></li>
 * <li><b>setStudentName method : Set Student Name</b></li>
 * </ul>
 * 
 * @author Kartik
 */
public class StudentData {

	private int studentRollNo; // Created Private Variable
	private String studentName;

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo; // Store value
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName; // Store value
	}

	// Created Method To display Data
	public void displayData() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Student rollNo is : " + studentRollNo);
	}

}