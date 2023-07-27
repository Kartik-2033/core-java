package com.myjavacode.filehandlingextra;

import java.io.File;
import java.util.Scanner;

/**
 *
 * <h3>This program is designed to check the following conditions :</h3>
 * <ul>
 * <li>Whether a file exists or not</li>
 * <li>Whether a file is writable or not</li>
 * <li>Whether a file is readable or not</li>
 * <li>The length of a file in bytes</li>
 * </ul>
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
			System.out.println("The file name is : " + (infoFile.getName()));
			System.out.println("The absolute path of the file is : " + infoFile.getAbsolutePath());

			// Checking whether the file is writable or not
			if (infoFile.canWrite() == true) {
				System.out.println((infoFile.getName()) + " is writable.");
			} else {
				System.out.println((infoFile.getName()) + " is not writable.");
			}

			// Checking whether the file is readable or not
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