package com.myjavacode.filehandling;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to read data from a file.
 * 
 * @author Kartik
 */
public class ReadFile {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter absolute path of the file : ");
		String filePath = userInput.next();

		// Creating file object
		File infoFile = new File(filePath);

		try {
			// Creating object to read data from file
			Scanner fileReader = new Scanner(infoFile);
			while (fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			fileReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File is not found.");
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
		userInput.close();
	}

}