package com.myjavacode.filehandlingextra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to read data from a file.
 * 
 * @author Kartik
 */
public class ReadFromFile {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter absolute path of the file :");
		String filePath = userInput.next();
		// Create file object
		File infoFile = new File(filePath);

		try {
			// Create object to read data from file
			Scanner fileReader = new Scanner(infoFile);
			while (fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			fileReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File not found.");
			exception.printStackTrace();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry for inconvenience.");
		}
		userInput.close();
	}

}