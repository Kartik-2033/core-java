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
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter absolute path of the file :");
			String filePath = scanner.next();
			// Create an object of a file
			File infoFile = new File(filePath);

			// Check file exist or not
			if (infoFile.exists()) {
				// Create FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath);
				writerObject.write("Hello my name is kartik.");
				writerObject.close();
				scanner.close();
				System.out.println("The content has been successfully added to the file.");
			} else {
				System.out.println("File does not exist in location.");
			}
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry for inconvenience.");
			exception.printStackTrace();
		}
	}

}