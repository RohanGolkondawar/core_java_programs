package com.rohan.arraylist_serialization_deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreObject {

	public static void main(String[] args) throws IOException
	{
		
		
		
		String filepath = "C:\\Users\\acer\\Desktop\\File_Handling\\Student.txt";
		
		var fout = new FileOutputStream(filepath);
		var oos = new ObjectOutputStream(fout);
		
		try(fout; oos)
		{
			IO.println("How Many Students data : ");
			int size = Integer.parseInt(IO.readln());
			
			Student student[] = new Student[size];
			
			for(int i=0;i<size;i++)
			{
				student[i] = Student.getStudentObject();
			}
			
			for(Student stud : student)
			{
			   oos.writeObject(stud);
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		

	}

}
