package com.rohan.java25;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[2];
			a[0] = 10;
			a[1] = 20;
			IO.println("Enter the index Position : ");
			int position = Integer.parseInt(IO.readln());
			IO.println(a[position]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			IO.println(e.getMessage());
			IO.println(e.toString());
			e.printStackTrace();
			IO.println(e);
		}
		

	}

}
