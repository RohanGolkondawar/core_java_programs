package com.rohan.hashmap;

import java.util.*;

public class Practice {

	public static void main(String[] args) 
	{
		HashMap<String, List<String>> course = new HashMap<>();
		course.computeIfAbsent("Scott", key -> new ArrayList<>()).add("Java");
		course.computeIfAbsent("Scott", key -> new ArrayList<>()).add("Adv Java");
		course.computeIfAbsent("Scott", key -> new ArrayList<>()).add("HTML");
		
		System.out.println(course);

	}

}
