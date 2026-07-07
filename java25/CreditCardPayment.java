package com.rohan.java25;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		
		IO.println("Initiating Credit Card payment\nProcessing Credit Card payment...");
		
	}

	@Override
	public void applyDiscount() {
		
		
		IO.println("Applying 10% discount for Credit Card payment");
		
	}

	

}
