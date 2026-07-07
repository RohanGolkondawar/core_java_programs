package com.rohan.arraylist_scenario;

public record Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) 
{
	   public Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone)
	   {
			if(custId<=0)
			{
				throw new IllegalArgumentException("Validation Error: Customer ID must be positive.");
			}else if(customerName.isBlank())
			{
				throw new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");
			}
			else if(pickupLocation.isBlank())
			{
				throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");
			}
			else if(dropLocation.isBlank())
			{
				throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
			}
			else if(distance<=0)
			{
				throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
			}
			else if(phone.length()>10)
			{
				throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
			}
			else
			{
			this.custId = custId;
			this.customerName = customerName;
			this.pickupLocation = pickupLocation;
			this.dropLocation = dropLocation;
			this.distance = distance;
			this.phone = phone;
			}
	   }

}
	
	


