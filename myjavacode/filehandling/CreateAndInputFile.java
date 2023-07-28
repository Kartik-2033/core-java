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
		String filePath = "", fileName = "", userName = "", userEmail = "";
		int userAge;

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter file name : ");
			fileName = scanner.next();

			System.out.println("For example : Path = D:/(Folder name)");
			System.out.println("Enter file path : ");
			filePath = scanner.next();

			System.out.println("Enter your name : ");
			userName = scanner.next();

			System.out.println("Enter your age : ");
			userAge = scanner.nextInt();

			System.out.println("Enter your email-id : ");
			userEmail = scanner.next();
			// Create an object of a File
			File createFile = new File(filePath + "/" + fileName + ".txt");

			// Check Condition If file is create or not
			if (createFile.createNewFile()) {
				System.out.println(fileName + " file is successfully created.");
			} else {
				System.out.println("File is already exist in directory.");
			}

			// Check file exist or not
			if (createFile.exists()) {
				// Create FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath + "/" + fileName + ".txt");
				writerObject.write("Name : " + userName + "\nAge : " + userAge + "\nEmail : " + userEmail);
				writerObject.close();
				System.out.println("The content has been successfully added to the file.");
			} else {
				System.out.println("File does not exist in location.");
			}
			scanner.close();
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred");
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry for inconvenience.");
		}
	}

	public static void main(String[] args) {
		CreateAndInputFile userRegister = new CreateAndInputFile();
		userRegister.createFile();
	}

}