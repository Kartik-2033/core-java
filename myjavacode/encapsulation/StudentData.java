package com.myjavacode.encapsulation;

/**
 * <h3>Encapsulation!</h3>
 * <p>
 * This Program takes data from the 'MainData.java' file!
 * </p>
 * <p>
 * <h2>Created Student Data class</h2>
 * </p>
 * <ul>
 * <li><b>setStudentRollNo method : Set student roll number</b></li>
 * <li><b>setStudentName method : Set student name</b></li>
 * </ul>
 * 
 * @author Kartik
 */
public class StudentData {

	private int studentRollNo;
	private String studentName;

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// Created method to display data
	public void displayData() {
		System.out.println("Student name is " + studentName);
		System.out.println("Student roll number is " + studentRollNo);
	}

}