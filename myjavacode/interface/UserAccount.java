package com.myjavacode.interface;

/**
 * <h3>Interface!</h3>
 * <p>
 * provide a real-life example to understand the interface.
 * </p>
 * <p>
 * This Program Show How User Can Shop Anything from his credit card!
 * </p>
 * <h3>VaseShop Interface!</h3>
 * <p>
 * This shop only accepts payment in dollars currency.
 * </p>
 * 
 * @author Kartik
 */
interface VaseShop {

	void ShopAcceptDollar();

}

/**
 * <h3>VaseShop Interface!</h3>
 * <p>
 * This shop only accepts payment in rupees currency.
 * </p>
 */
interface FlowerShop {

	void ShopAcceptRupee();

}

/**
 * <h3>UserCreditCard Class!</h3>
 * <p>
 * With this class, users can buy anything using different currencies.
 * </p>
 */
class UserCreditCard implements VaseShop, FlowerShop {

	@Override
	public void ShopAcceptRupee() {
		System.out.println("Purchase Flower : Payment In Rupees.");
	}

	@Override
	public void ShopAcceptDollar() {
		System.out.println("Purchase Vase : Payment In Dollars.");
	}

}

public class UserAccount {

	public static void main(String[] args) {
		UserCreditCard userPayment = new UserCreditCard();
		userPayment.ShopAcceptDollar();
		userPayment.ShopAcceptRupee();
	}

}