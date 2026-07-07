package com.rohan.listmcq;

import java.io.FileReader;
import java.io.IOException;

public class ReadingData {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\acer\\Desktop\\Java Lab\\File Handling\\Hello1.txt";
		
		try(var fr = new FileReader(path))
		{
			int i;
			
			while(true)
			{
				i = fr.read();
				if(i==-1)
				{
					break;
				}
				
				IO.print((char)i);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
