package com.myjavacode.filehandlingExtra;

import java.io.File;
import java.util.Scanner;

/**
 * <p>
 * Use {@link #FileInfo()} to get information about file.
 * 
 * @author Kartik
 */
public class FileInfo {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter absolute path of the file :");
		String filePath = userInput.next();
		File infoFile = new File(filePath);

		// Checking file exist or not
		if (infoFile.exists()) {
			// Getting file name
			System.out.println("The file name is : " + (infoFile.getName()));
			// Getting path of file
			System.out.println("The absolute path of the file is: " + infoFile.getAbsolutePath());

			// Checking whether the file is writable or not
			if (infoFile.canWrite() == true) {
				System.out.println((infoFile.getName()) + " is writable.");
			} else {
				System.out.println((infoFile.getName()) + " is not writable.");
			}

			// Checking whether the file is writable or not
			if (infoFile.canRead() == true) {
				System.out.println((infoFile.getName()) + " is readable.");
			} else {
				System.out.println((infoFile.getName()) + " is not readable.");
			}
			// Getting the length of the file in byte
			System.out.println("The size of the file in bytes is: " + infoFile.length());
		} else {
			System.out.println("File doesn't exist.");
		}
		userInput.close();
	}

}