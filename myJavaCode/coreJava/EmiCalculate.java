package com.myjavacode.coreJava;
import java.util.Scanner;

/**
* <h3>EMI Calculate In Java</h3>
* This Program Calculate The Monthly Installement!<p>
* @author Kartik
*/

public class EmiCalculate {
	// Function to calculate EMI
	static float emiCalculate(float loanAmount,float interestRate, float yearTime) {

		interestRate = interestRate / (12 * 100); // one month interest
		yearTime = yearTime * 12; // one month period

		// Applying Formula To Count emi
		float emiCount = (loanAmount * interestRate * (float)Math.pow(1 + interestRate, yearTime))/ (float)(Math.pow(1 + interestRate, yearTime) - 1);
	
		return (emiCount);

	}

	// Creating Main Method 
	public static void main (String[] args) {

		float loanAmount, interestRate, yearTime, emi;
		Scanner scanner = new Scanner(System.in); //For Input From User

		// creating varible and Store value in loanAmount
		System.out.println("Enter the Principal Or Loan Amount => "); 
		loanAmount = scanner.nextInt();

		// creating varible and Store value in interestRate
		System.out.println("Enter the Interest Rate (Per Month) => "); 
		interestRate = scanner.nextInt();

		// creating varible and Store value in interestRate
		System.out.println("Enter yearTime in year => "); 
		yearTime = scanner.nextInt();

		emi = emiCalculate(loanAmount, interestRate, yearTime);

		System.out.println("Monthly EMI is = " + emi); // Count Monthly EMI
		scanner.close();

	}

}