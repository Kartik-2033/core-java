/**
*<h3>File Handling!</h3>
*<p>This Program show how to delete file!</p>
*@author Kartik
*/
package com.myjavacode.filehandlingExtra;
import java.io.*;
import java.util.Scanner;

/**
 * <p>Use {@link #DeleteFile()} to delete file.
 * @author Kartik
 *
 */
public class DeleteFile {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(System.in);

			System.out.println("Enter absolute path of file you want delete :");
			String filePath = userInput.next(); //Take file path input from user

			File deleteFile = new File(filePath);

			if (deleteFile.delete()) {
				System.out.println((deleteFile.getName()) + " file is deleted successfully");
			} else {
				System.out.println("File not Found.");
			}
			userInput.close();
		} catch (Exception exeObj) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
	}

}