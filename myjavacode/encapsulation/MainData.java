/** 
*<h3>Encapsulation!</h3>
*<p>This Program About Encapsulation : This Program Passing Data To Student data File !</p>
*@author Kartik
*/
package com.myjavacode.encapsulation;

public class MainData {

	public static void main(String[] args) {
		StudentData student = new StudentData();

		student.setStudentRollNo(27);
		student.setStudentName("Kartik");
		student.displayData();
	}

}