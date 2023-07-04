/**
*<h3>File Handling!</h3>
*<p>This Program show how to read data from file!</p>
*@author Kartik
*/
package com.myjavacode.filehandling;
import java.io.*;
import java.util.Scanner;

/**
 * <p>Use {@link #ReadFile()} to Read data from file.
 * @author Kartik
 *
 */
public class ReadFile {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter absolute path of the file :");
		String filePath = userInput.next(); //Take file path input from user

		//Creating File Object 
		File infoFile = new File(filePath);

		try {
			//Creating object to read data from file
			Scanner fileReader = new Scanner(infoFile);

			//start while l;oo
			while (fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
			fileReader.close();
		} catch (FileNotFoundException exeObj) {
			System.out.println("File Not Found.");
			exeObj.printStackTrace();
		} catch (Exception exeObj) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
		userInput.close();
	}

}