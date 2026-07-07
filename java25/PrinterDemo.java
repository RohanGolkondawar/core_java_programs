package com.rohan.java25;

public class PrinterDemo {
	
	public Printer getPrinter()
	{
		
		return new Printer()
		{

			@Override
			public void print() {
				
				IO.println("Print method");
				
			}
			
			
			
		};
		

		
	}
	
	
	

	

}
