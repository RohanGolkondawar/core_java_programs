package com.rohan.java25;

import java.util.Scanner;

public class AreaCalculator {
	
	public static double calculateArea(double length,double width)
	{
		if(length<=0 || width<=0)
		{
			throw new IllegalArgumentException();
		}
		return length*width;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IO.println("Length : ");
        double length = Double.parseDouble(sc.nextLine());
        IO.println("width : ");
        double width = Double.parseDouble(sc.nextLine());
        
        try
        {
        	   double area = calculateArea(length, width);
        	   IO.println("Area of rectangle with length " +length+ " and width " +width+ " is: " +area);
           sc.close();
        }catch(Exception e)
        {
        	    IO.println("Error: Length and width must be > 0.");
        }
        
       
	}

}
