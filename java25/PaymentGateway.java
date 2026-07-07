package com.rohan.java25;

public class PaymentGateway {
	
	public static Payment initiatePayment(String paymentType)
	{
		if(paymentType.equalsIgnoreCase("creditcard"))
		{
			return new CreditCardPayment();
		}
		else if(paymentType.equalsIgnoreCase("UPI"))
		{
			return new UPIPayment();
		}else
		{
			IO.println("Invalid payment type selected!");
			System.exit(0);
		}
		return null;
		
	}

}
