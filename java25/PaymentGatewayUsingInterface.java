package com.rohan.java25;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args)
	{
		String paymentType = IO.readln("Enter Payment Type [CreditCard / UPI]: ");
		
		Payment p = PaymentGateway.initiatePayment(paymentType);
		p.processPayment();
		p.applyDiscount();
	}

}
