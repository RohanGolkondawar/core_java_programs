package com.rohan.java25;

public class ClassCastExceptionDemo {
	
	public static void handleClassCastException()
	{
		Object []obj = {"Rohan",123,"Java"};
		
		try
		{
			for(Object s : obj)
			{
				String element = (String) s;
				IO.println("Successful Casted : "+element);
			}

		}catch(ClassCastException e)
		{
			IO.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		handleClassCastException();
	}

}
