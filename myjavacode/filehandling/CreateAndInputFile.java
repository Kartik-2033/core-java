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
public class CreateAndInputFile {

	public void createFile() {
		String filePath = "", fileName = "", userName = "", userAge = "", userEmail = "";

		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter file name : ");
			fileName = userInput.next();

			System.out.println("For example : Path = D:/(Folder name)");
			System.out.println("Enter file path : ");
			filePath = userInput.next();

			System.out.println("Enter your name : ");
			userName = userInput.next();

			System.out.println("Enter your age : ");
			userAge = userInput.next();

			System.out.println("Enter your email-id : ");
			userEmail = userInput.next();
			// Creating an object of a File
			File createFile = new File(filePath + "/" + fileName + ".txt");

			// Check Condition If file is create or not
			if (createFile.createNewFile()) {
				System.out.println(fileName + " file is successfully created.");
			} else {
				System.out.println("File is already exist in directory.");
			}

			// Checking file exist or not
			if (createFile.exists()) {
				// Creating FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath + "/" + fileName + ".txt");
				writerObject.write("Name : " + userName + "\nAge : " + userAge + "\nEmail : " + userEmail);
				writerObject.close();
				System.out.println("The content has been successfully added to the file.");
			} else {
				System.out.println("File does not exist in location.");
			}
			userInput.close();
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred");
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
	}

	public static void main(String[] args) {
		EmployeeData userRegister = new EmployeeData();
		userRegister.createFile();
	}

}