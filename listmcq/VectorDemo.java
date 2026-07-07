package com.rohan.listmcq;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VectorDemo
{
public static void main(String[] args) throws IOException
{
	String filePath = "C:\\Users\\acer\\Desktop\\Java Lab\\File Handling\\Hello1.txt";
	var fout = new FileOutputStream(filePath);
	
	try(fout)
	{
		String data = "Hello Everyone, Welcome to file Handling";
		
		byte[] bytes = data.getBytes();
		
		fout.write(bytes);
		IO.println("Data Stored Successfully");
		
	}
	catch(FileNotFoundException e)
	{
		IO.println(e.getMessage());
	}
	catch(IOException e)
	{
		IO.println(e.getMessage());
	}
	
}


}



