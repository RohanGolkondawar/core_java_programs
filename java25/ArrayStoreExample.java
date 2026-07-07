package com.rohan.java25;

public class ArrayStoreExample {
	
	public static void storeObjects(Object obj[])
	{
		Object obj1[] = new String[5];
		
		for(int i=0;i<obj.length;i++)
		{
			 obj1[i] = obj[i];
		}
		
		IO.println("Objects stored successfully.");
	}
	
	
	public static void main(String[] args) {
		
		Object obj[] = new Object[3];
		
		obj[0] = "Hello";
		obj[1] = "World";
		obj[2] = 123;
		
		
 		
	try
	{
		storeObjects(obj);
	}
	catch(Exception e)
	{
	     e.printStackTrace();
	}
	
	}

}
