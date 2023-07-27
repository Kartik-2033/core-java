package com.myjavacode.filehandlingextra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to Write data from a file.
 * 
 * @author Kartik
 */
public class WriteDataInFile {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter absolute path of the file :");
			String filePath = userInput.next();
			// Creating an object of a file
			File infoFile = new File(filePath);

			// Checking file exist or not
			if (infoFile.exists()) {
				// Creating FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath);
				writerObject.write("Hello my name is kartik.");
				writerObject.close();
				userInput.close();
				System.out.println("The content has been successfully added to the file..");
			} else {
				System.out.println("File Does not exist in location.");
			}
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
			exception.printStackTrace();
		}
	}

}