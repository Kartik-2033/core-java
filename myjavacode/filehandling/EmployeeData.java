/**
*<h3>File Handling!</h3>
*<p>This Program show how to create new file!</p>
*@author Kartik
*/
package com.myjavacode.filehandling;
import java.io.*;
import java.util.Scanner;

/**
 * <p>Use {@link #CreateFile()} to create new file.
 * @author Kartik
 *
 */
public class EmployeeData {

	public void CreateFile() {
		/**
		 * filePath : use to where file is create.
		 * fileName : use to What to name the file. 
		 */
		String filePath = "", fileName = "";

		try {
			Scanner userInput = new Scanner(System.in);

			System.out.println("Enter File Name : ");
			fileName = userInput.next();

			System.out.println("For Example : Path = D:/(Folder name)/");
			System.out.println("Enter File Path : ");
			filePath = userInput.next();

			// Creating an object of a File  
			File createFile = new File(filePath + "" + fileName + ".txt");

			// Make Condition If file is create or not
			if(createFile.createNewFile()) {
				System.out.println( fileName + " File Is successfully Created.");
			} else {
				System.out.println("File already exist in directory.");
			}

			// Checking file exist or not
			if (createFile.exists()) {
				//creating FileWriter object to write in file
				FileWriter writerObject = new FileWriter(filePath + "" + fileName + ".txt");

				writerObject.write("Name : Kartik \nAge : 22 \nEmail : kartikpanchal629@gmail.com.");

				writerObject.close();
				System.out.println("Content Added successfully in File.");
			} else {
				System.out.println("file Does not exist in location.");
			}
			userInput.close();

		} catch (IOException exeObj) {
			System.out.println("An unexpected error is occurred");
			exeObj.printStackTrace();
		} catch (Exception exeObj) {
			System.out.println("An unexpected error is occurred. Sorry For inconvenience.");
		}
	}

	public static void main(String[] args) {
		EmployeeData userRegister = new EmployeeData();
		userRegister.CreateFile();
	}

}