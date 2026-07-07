package com.rohan.ola_cab_driver;

public class DriverAssignment extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Searching for nearby drivers...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("Driver found and assigned..!");
	}

}
