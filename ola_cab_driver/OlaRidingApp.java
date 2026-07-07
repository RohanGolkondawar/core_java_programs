package com.rohan.ola_cab_driver;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException 
	{
		RideRequest rideRequest = new RideRequest();
		DriverAssignment driverAssignment = new DriverAssignment();
		FareCalculation fareCalculation = new FareCalculation();
		LiveTracking liveTracking = new LiveTracking();
		PaymentProcessing paymentProcessing = new PaymentProcessing();
		RatingSystem ratingSystem = new RatingSystem();
		
		rideRequest.start();
		
		rideRequest.join();
		fareCalculation.start();
		
		fareCalculation.join();
		
		driverAssignment.start();
		
		driverAssignment.join();
		
		liveTracking.start();
		
		liveTracking.join();
		
		paymentProcessing.start();
		
		paymentProcessing.join();
		
		ratingSystem.start();
		
		ratingSystem.join();
		
		
		
		
		
		

	}

}
