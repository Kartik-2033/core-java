/** 
*<h3>Encapsulation!</h3>
*<p>This Program About Encapsulation : This Program About set data from Main file!</p>
*@author Kartik
*/
package com.myjavacode.encapsulation;

/**
* <p>
* <h2>Created Student Data class</h2>
* <h4>Created Two Variable</h4>
* </p>
* <ul>
* <li><b>setStudentRollNo : Set Student Roll Number</b></li>
* <li><b>setStudentName : Set Student Roll Name</b></li>
* </ul>
*/
public class StudentData {

	private int studentRollNo; // Created Private Variable
	private String studentName;

	/**
* <p>
* <h4>Created Set Student Roll Numnber Method</h4>
* </p>
* <ul>
* <li><b>To Store Roll Number Of Student</b></li>
* </ul>
*/
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo; // Store value
	}

/**
* <p>
* <h4>Created Set Student Name Method</h4>
* </p>
* <ul>
* <li><b>To Store Roll Name Of Student</b></li>
* </ul>
*/
	public void setStudentName(String studentName) {
		this.studentName = studentName; // store value 
	}

/**
* <h4>Created Method To display Data</h4>
*/
	public void displayData() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Student rollNo is : " + studentRollNo);
	}

}