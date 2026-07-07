package com.rohan.arraylist_serialization_deserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveObject {

	public static void main(String[] args) throws IOException
	{
		String filepath = "C:\\Users\\acer\\Desktop\\File_Handling\\Student.txt";
		
		var fin = new FileInputStream(filepath);
		var ois = new ObjectInputStream(fin);
		
		try(fin; ois)
		{
			while(true)
			{
				Student student = (Student) ois.readObject();
				IO.println(student);
			}
			
		}
		catch(ClassNotFoundException e)
		{
			IO.println("No such file is found");
		}
		catch(EOFException e)
		{
			IO.println("End of the file reached: "+e);
		}
	}

}
