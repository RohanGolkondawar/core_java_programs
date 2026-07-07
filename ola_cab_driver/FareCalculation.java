package com.rohan.ola_cab_driver;

public class FareCalculation extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Calculating estimated fare");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Estimated fare : 133 Rs");
	}

}
