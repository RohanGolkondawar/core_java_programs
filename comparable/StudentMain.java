package com.rohan.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student s = new Student(3,"Rohan");
		Student s2 = new Student(1,"Sahil");
		Student s3 = new Student(2,"Ankit");
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(s);
		list.add(s2);
		list.add(s3);
		
		Comparator<Student> cmp = (a,b) -> b.name.compareTo(a.name);
		
		Collections.sort(list,cmp);
		
		list.forEach(IO::println);

	}

}
