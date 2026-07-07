package com.rohan.java25;

public class ClassNotFoundExpDemo {
	
	String name;

	public ClassNotFoundExpDemo(String name) {
		
		
		super();
		this.name = name;
		try
		{
			IO.println("Enter the class name to load:");
			name = IO.readln();
			Class<?> forName = Class.forName(name);
			IO.println("Class loaded successfully:"+forName);
			
			
		}catch(ClassNotFoundException e)
		{
	        e.printStackTrace();
             
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ClassNotFoundExpDemo c = new ClassNotFoundExpDemo("");
	}
	
	

}
