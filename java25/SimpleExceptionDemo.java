package com.rohan.java25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			IO.println("Enter number 1 : ");
			int a = sc.nextInt();
			IO.println("Enter number 2 : ");
			int b = sc.nextInt();
			IO.println("You entered a =" +a+ "and b ="+b);
			
		}
		catch(InputMismatchException e)
		{
			IO.println("Please Enter in Proper Format");
			IO.println(e.getMessage());
			e.printStackTrace();
//			e.printStackTrace();
//			IO.println(e);
//			IO.println(e.toString());
		}
		
		
	}

}
