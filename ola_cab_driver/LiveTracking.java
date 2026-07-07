package com.rohan.ola_cab_driver;

public class LiveTracking extends Thread {
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Updating ride location....."+((i*10)+(i*10))+"%");
			
		}
		System.out.println("Ride completed");
		
	}

}
