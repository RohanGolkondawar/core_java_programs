package com.rohan.hashmap;


import java.util.*;

public class CourseRegistration {

	public static void main(String[] args) 
	{
		HashMap<String, List<String>> course = new HashMap<>();
		while(true)
		{
			System.out.println("----------Course Registration Menu----------");
			System.out.println("1. Register Student to course");
			System.out.println("2. Remove Student from course");
			System.out.println("3. View course-wise student list");
			System.out.println("4. Exit");
			System.out.print("Enter Your Choice : ");
			
			int choice = Integer.parseInt(IO.readln());
			
			switch(choice)
			{
			case 1 ->
			{
				System.out.println("Enter Course name : ");
				String courseName = IO.readln();
				System.out.println("Enter Student Name : ");
				String studName = IO.readln();
				course.computeIfAbsent(courseName, k -> new ArrayList<>()).add(studName);
				System.out.println("Student Registered Successfully");
				
			}
			case 3 ->
			{
				course.forEach((k,v) -> System.out.println(k+ " "+v));
			}
		}
		}
		
		

	}

}
