package com.rohan.ola_cab_driver;

public class PaymentProcessing extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Payment Processing");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Payment Successful");
	}

}
