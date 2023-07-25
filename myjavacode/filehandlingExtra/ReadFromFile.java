package com.myjavacode.filehandlingExtra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * Use {@link #ReadFromFile()} to Read data from file.
 * 
 * @author Kartik
 */
public class ReadFromFile {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter absolute path of the file :");
		String filePath = userInput.next(); // Take file path input from user
		// Creating File Object
		File infoFile = new File(filePath);

		try {
			// Creating object to read data from file
			Scanner fileReader = new Scanner(infoFile);
			// Start while loop
			while (fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
			e.printStackTrace();
		} catch (Exception exeObj) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
		userInput.close();
	}

}