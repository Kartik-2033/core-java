/**
*<h3>File Handling!</h3>
*<p>This Program show how to create new file!</p>
*@author Kartik
*/
package com.myjavacode.filehandlingExtra;
import java.io.*;
import java.util.Scanner;

/**
 * <p>Use {@link #CreateFile()} to create new file.
 * @author Kartik
 *
 */
public class CreateUserDataFile {

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

			System.out.println("Enter File Path : ");
			System.out.println("For Example : Path = D:/(Folder name)/");
			filePath = userInput.next();

			// Creating an object of a File  
			File createFile = new File( filePath + "" + fileName + ".txt");

			// Make Condition If file is create or not
			if(createFile.createNewFile()) {
				System.out.println( fileName + " File Is successfully Created.");
			} else {
				System.out.println("File already exist in directory.");
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
		CreateUserDataFile userRegister = new CreateUserDataFile();
		userRegister.CreateFile();
	}

}