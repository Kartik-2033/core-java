package com.myjavacode.filehandlingExtra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to create a file
 * 
 * @author Kartik
 */
public class CreateUserDataFile {

	public void CreateFile() {
		String filePath = "", fileName = "";

		try {
			Scanner userInput = new Scanner(System.in);

			System.out.println("Enter File Name : ");
			fileName = userInput.next();

			System.out.println("Enter File Path : ");
			System.out.println("For Example : Path = D:/(Folder name)");
			filePath = userInput.next();

			// Creating an object of a File
			File createFile = new File(filePath + "/" + fileName + ".txt");

			// Make Condition If file is create or not
			if (createFile.createNewFile()) {
				System.out.println(fileName + " file is successfully created.");
			} else {
				System.out.println("File already exist in directory.");
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
		CreateUserDataFile userRegister = new CreateUserDataFile();
		userRegister.CreateFile();
	}

}