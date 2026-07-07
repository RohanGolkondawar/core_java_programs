package com.rohan.java25;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	
	public static void handleExceptions(String a)
	{
		try
		{
		    int c = a.length();
			IO.println("Length of the input string:"+c);
			int b = Integer.parseInt(a);
			IO.println("Converted to integer:"+b);
		}
		catch(NullPointerException e)
		{
			IO.println("String is null");
		}
		catch(NumberFormatException e)
		{
			IO.println("Input is not a valid integer.");
		}
		catch(Exception e)
		{
			IO.println("other Error");
		}

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IO.println("Enter a String : ");
		String a = sc.nextLine();
		handleExceptions(a);
		
		
		sc.close();
		
	}

}
