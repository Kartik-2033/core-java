package com.myjavacode.encapsulation;

/**
 * <h3>Encapsulation!</h3>
 * <p>
 * This program passing data to 'StudentData.java' file !
 * </p>
 * 
 * @author Kartik
 */
public class MainData {

	public static void main(String[] args) {
		StudentData student = new StudentData();
		student.setStudentRollNo(27);
		student.setStudentName("Kartik");
		student.displayData();
	}

}