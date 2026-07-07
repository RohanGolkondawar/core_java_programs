package com.rohan.java25;

public class IllegalStateDemo {

	public static void main(String[] args) 
	{
		IO.println("Calling throwIllegalException from main method:");
		throwIllegalException();

	}
	
	static void throwIllegalException()
	{
		try
		{
			throw new IllegalStateException("MyException");
			
		}catch(IllegalStateException e)
		{
			System.out.println("Caught: " + e);
		}
	}

}
