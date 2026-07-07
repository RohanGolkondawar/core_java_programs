package com.rohan.student_data_management;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentDataManagement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		while(true)
		{
			IO.println("------------Student Management System------------");
			IO.println("1. Add Student");
			IO.println("2. Update Marks");
			IO.println("3. Delete Student");
			IO.println("4.Search Student");
			IO.println("5. Display All Students");
			IO.println("6. Show Topper");
			IO.println("7. Show Lowest Scorer");
			IO.println("8. Show Total and Average Marks");
			IO.println("9. Exit");
			System.out.println();
			IO.println("Enter your choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1 ->
			{
				System.out.println("Enter Student Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Marks : ");
				int marks = Integer.parseInt(sc.nextLine());
				student.put(name, marks);
				System.out.println("Student added successfully");
			
			}
			case 2 ->
			{
				System.out.println("Enter student name to update the marks : ");
				String name = sc.nextLine();
				System.out.println("Enter new marks : ");
				int marks = Integer.parseInt(sc.nextLine());
				student.put(name, marks);
				System.out.println("Marks updated");
			}
			case 3 ->
			{
				System.out.println("Enter student name to delete : ");
				String name = sc.nextLine();
				student.remove(name);
				System.out.println("Student deleted");
			}
			case 4 ->
			{
				System.out.println("Enter student name to search : ");
				String name = sc.nextLine();
				if(student.containsKey(name))
				{
				     System.out.println(name+" Scored "+student.computeIfPresent(name, (key,value) -> value ));
				}
			}
			case 5 ->
			{
				System.out.println("--------Student Records");
				
				for(Map.Entry<String, Integer> stud : student.entrySet())
				{
					System.out.println(stud.getKey()+" => "+stud.getValue());
				}
			}
			case 6 ->
			{
				Entry<String, Integer> max = Collections.max(student.entrySet(), (s1,s2)->s1.getValue().compareTo(s2.getValue()));
				System.out.println("Topper : "+max);
			}
			case 7 ->
			{
				Entry<String, Integer> min = Collections.min(student.entrySet(), (s1,s2) -> s1.getValue().compareTo(s2.getValue()));
				System.out.println("Lowest Scorer = "+min);
			}
			case 8 ->
			{
				int totalMarks =0;
				for(Integer marks : student.values())
				{
					totalMarks+=marks;
				}
				
				System.out.println("Total Marks : "+totalMarks);
				
				double averageMarks = (double) totalMarks/student.size();
				System.out.println("Average Marks : "+averageMarks);
			}
			case 9 ->
			{
				int sum = student.values().stream().mapToInt(Integer::intValue).sum();
				System.out.println(sum);
				
			}
			}
		}
		

	}

}
