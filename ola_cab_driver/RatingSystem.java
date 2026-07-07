package com.rohan.ola_cab_driver;

public class RatingSystem extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Requesting user rating");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("User rated the ride: 5 star");
		
	}

}
