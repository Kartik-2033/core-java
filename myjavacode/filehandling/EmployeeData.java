package com.myjavacode.filehandling;

import java.io.*;
import java.util.Scanner;

/**
 * This program demonstrates how to create a file and input user information,
 * such as their name, age, and email address.
 * <p>
 * 
 * @author Kartik
 */
public class EmployeeData {

	public void createFile() {
		String filePath = "", fileName = "", userName = "", userAge = "", userEmail = "";

		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter File Name : ");
			fileName = userInput.next();

			System.out.println("For Example : Path = D:/(Folder name)");
			System.out.println("Enter File Path : ");
			filePath = userInput.next();

			System.out.println("Enter Your Name : ");
			userName = userInput.next();

			System.out.println("Enter Your Age : ");
			userAge = userInput.next();

			System.out.println("Enter Your Email ID : ");
			userEmail = userInput.next();
			// Creating an object of a File
			File createFile = new File(filePath + "/" + fileName + ".txt");

			// Check Condition If file is create or not
			if (createFile.createNewFile()) {
				System.out.println(fileName + " File Is successfully Created.");
			} else {
				System.out.println("File already exist in directory.");
			}

			// Checking file exist or not
			if (createFile.exists()) {
				// Creating FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath + "/" + fileName + ".txt");
				writerObject.write("Name : " + userName + "\nAge : " + userAge + "\nEmail : " + userEmail);
				writerObject.close();
				System.out.println("The content has been successfully added to the file.");
			} else {
				System.out.println("File Does not exist in location.");
			}
			userInput.close();
		} catch (IOException exeObj) {
			System.out.println("An unexpected error is occurred");
			exeObj.printStackTrace();
		} catch (Exception exeObj) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
	}

	public static void main(String[] args) {
		EmployeeData userRegister = new EmployeeData();
		userRegister.createFile();
	}

}