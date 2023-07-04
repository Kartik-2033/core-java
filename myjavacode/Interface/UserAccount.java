/**
*<h3>Interface!</h3>
*<p>This Program Show How User Can Shop Anything from his credit card!</p>
*@author Kartik
*/
package com.myjavacode.Interface;


/**
 *<h3>VaseShop Interface!</h3>
 *<p>This Shop Accept Only Dollar in currency!</p>
 * @author Kartik 
 */
interface VaseShop {

	void ShopAcceptDollar();

}

/**
 *<h3>VaseShop Interface!</h3>
 *<p>This Shop Accept Only Rupess in currency!</p>
 * @author Kartik
 */
interface FlowerShop {

	void ShopAcceptRupee();

}

/**
 * <h3>UserCreditCard Class!</h3>
 * <p>Using This class user can purchase any thing in various currency!</p>
 * @author Kartik
 *
 */
class UserCreditCard implements VaseShop,FlowerShop {

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