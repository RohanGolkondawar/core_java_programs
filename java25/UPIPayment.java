package com.rohan.java25;

public class UPIPayment implements Payment{

	@Override
	public void processPayment() {
		
		
		IO.println("Initiating UPI payment\nProcessing UPI payment...");
		
	}

	@Override
	public void applyDiscount() {
		
		IO.println("Applying 5% discount for UPI payment");
		
	}

}
