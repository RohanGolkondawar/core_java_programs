package com.rohan.java25;

import java.util.function.Consumer;

public class StudentNotification {
	
	public static void main(String[] args) {
		
		Consumer<Student> s = t -> System.out.println("Hello "+t.name()+"! Welcome to the "+t.course()+" Course");
		
		int noOfStudent = Integer.parseInt(IO.readln("Enter number of student : "));
		IO.println();
		
		for(int i=1;i<=noOfStudent;i++)
		{
			IO.println("Enter details for Student "+i);
			int id = Integer.parseInt(IO.readln("Enter ID : "));
			String name = IO.readln("Enter Name : ");
			String course = IO.readln("Enter Course : ");
			s.accept(new Student(id,name,course));
			IO.println();
		}


	

	}
}
