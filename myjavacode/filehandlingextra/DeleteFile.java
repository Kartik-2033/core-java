package com.myjavacode.filehandlingextra;

import java.io.*;
import java.util.Scanner;

/**
 * <p>
 * This program demonstrates how to delete a file
 * 
 * @author Kartik
 */
public class DeleteFile {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter absolute path of file you want delete : ");
			String filePath = userInput.next();
			File deleteFile = new File(filePath);
			if (deleteFile.delete()) {
				System.out.println((deleteFile.getName()) + " file is deleted successfully");
			} else {
				System.out.println("File not Found.");
			}
			userInput.close();
		} catch (Exception exception) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
	}

}