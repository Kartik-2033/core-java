package com.myjavacode.corejava;

import java.util.Scanner;

/**
 * <h3>EMI Calculate In Java</h3> The program calculates the monthly
 * installment!
 * <p>
 * 
 * @author Kartik
 */
public class EmiCalculate {

	// Function to calculate monthly emi
	static float emiCalculate(float loanAmount, float interestRate, float yearTime) {
		float oneMonthInterestRate = interestRate / (12 * 100); // One month interest
		float oneMonthTime = yearTime * 12; // One month period

		// Applying formula to count emi
		float emiCount = (loanAmount * oneMonthInterestRate * (float) Math.pow(1 + oneMonthInterestRate, oneMonthTime))
				/ (float) (Math.pow(1 + oneMonthInterestRate, oneMonthTime) - 1);
		return (emiCount);
	}

	public static void main(String[] args) {
		float loanAmount, interestRate, yearTime, monthlyEmi;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the principal or loan amount : ");
		loanAmount = scanner.nextFloat();

		System.out.println("Enter the interest rate : ");
		interestRate = scanner.nextFloat();

		System.out.println("Enter time in year : ");
		yearTime = scanner.nextFloat();

		monthlyEmi = emiCalculate(loanAmount, interestRate, yearTime);
		System.out.println("Monthly EMI is " + monthlyEmi);
		scanner.close();
	}

}