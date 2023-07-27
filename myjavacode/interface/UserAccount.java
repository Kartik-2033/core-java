package com.myjavacode.interface;

/**
 * <h3>Interface!</h3>
 * <p>
 * provide a real-life example to understand the interface.
 * </p>
 * <p>
 * This program show how user can buy anything from his credit card!
 * </p>
 * <h3>VaseShop interface!</h3>
 * <p>
 * This shop only accepts payment in dollars currency.
 * </p>
 * 
 * @author Kartik
 */
interface VaseShop {

	void shopAcceptDollar();

}

/**
 * <h3>VaseShop interface!</h3>
 * <p>
 * This shop only accepts payment in rupees currency.
 * </p>
 */
interface FlowerShop {

	void shopAcceptRupee();

}

/**
 * <h3>UserCreditCard class!</h3>
 * <p>
 * With this class, users can buy anything using different currencies.
 * </p>
 */
class UserCreditCard implements VaseShop, FlowerShop {

	@Override
	public void shopAcceptRupee() {
		System.out.println("Purchase flower : Payment in rupees.");
	}

	@Override
	public void shopAcceptDollar() {
		System.out.println("Purchase vase : Payment in dollars.");
	}

}

public class UserAccount {

	public static void main(String[] args) {
		UserCreditCard userPayment = new UserCreditCard();
		userPayment.shopAcceptDollar();
		userPayment.shopAcceptRupee();
	}

}