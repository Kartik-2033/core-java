package com.myjavacode.filehandlingextra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to create a file.
 * 
 * @author Kartik
 */
public class CreateUserDataFile {

	public void createFile() {
		String filePath = "", fileName = "";

		try {
			Scanner userInput = new Scanner(System.in);

			System.out.println("Enter file name : ");
			fileName = userInput.next();

			System.out.println("Enter file path : ");
			System.out.println("For example : Path = D:/(Folder name)");
			filePath = userInput.next();

			// Create an object of a file
			File createFile = new File(filePath + "/" + fileName + ".txt");

			// Make condition if file is create or not
			if (createFile.createNewFile()) {
				System.out.println(fileName + " file is successfully created.");
			} else {
				System.out.println("File already exist in directory.");
			}
			userInput.close();
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred");
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry for inconvenience.");
		}
	}

	public static void main(String[] args) {
		CreateUserDataFile userRegister = new CreateUserDataFile();
		userRegister.createFile();
	}

}