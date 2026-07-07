package com.rohan.stream_api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization {

	public static void main(String[] args) 
	{
	   HashSet<String> set = new HashSet<String>();
	   set.add("Anuj");
	   set.add("Aryan");
	   set.add("Rohan");
	   set.add("Ankit");
	   
	   String filepath = "C:\\Users\\acer\\Desktop\\File_Handling\\names.ser";
	   
	   try
	   {
		   FileOutputStream fos = new FileOutputStream(filepath);
		   ObjectOutputStream oos = new ObjectOutputStream(fos);
		   
		   oos.writeObject(set);
		   System.out.println("Stored Successfully");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   try(FileInputStream fis = new FileInputStream(filepath);ObjectInputStream ois = new ObjectInputStream(fis))
	   {
		     HashSet<String> newset = (HashSet<String>) ois.readObject();
		     System.out.println(newset);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   

	}

}
