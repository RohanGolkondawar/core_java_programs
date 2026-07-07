package com.rohan.arraylist_scenario;

import java.util.ArrayList;

public class CustomerService {
	
	private  ArrayList<Customer> customers;

	public CustomerService() {
		super();
		customers  = new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer cust)
	{
        customers.add(cust);
	}
	

	private boolean isFirstCustomer(Customer cust)
	{
		for (Customer c : customers) {
            if (c.phone().equals(cust.phone())) {
                return false;   // customer already exists
            }
        }
        return true;
    }
	
	public double calculateBill(Customer cust)
	{
		if(isFirstCustomer(cust))
		{
			return 0;
			
		}
		
		double distance = cust.distance();
		
		if(distance<=4)
		{
			return 80;
		}
		
		return 80+2*(cust.distance()-4);
	}
	
	public void printBill(Customer cust)
	{
		IO.println(cust);
		IO.println(cust.customerName()+" Please pay your bill of Rs "+calculateBill(cust));
	}
	
	
	
	

}
