package com.rohan.java25;

public class DivisionExample {
	
	public static int performDivision(int a, int b)
	{
		int result=0;
		try
		{
			IO.println("Enter dividend :");
			a = Integer.parseInt(IO.readln());
			IO.println("Enter divisor :");
			b = Integer.parseInt(IO.readln());
			result = a/b;
		
		}
		catch(ArithmeticException e)
		{
			IO.println(e.getMessage());
			IO.println("dividend="+a+", divisor="+b);
		}
		return result;
	}

	
	public static void main(String[] args) {
		
		int result = performDivision(1, 1);
		IO.println("Result of division : "+result);
	}
}
