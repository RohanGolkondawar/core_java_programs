package com.rohan.java25;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<>(100,25);
		
	    for(int i=0;i<=130;i++)
	    {
	    	  v1.add(i);
	    }
	    
	    IO.println(v1.lastElement());
	    
		IO.println(v1.capacity());
		

	}

}
