package com.rohan.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {
	
	record Customer(int id, String name, double bill) {};
	
	record Product(int id, String name, double price) {};
	
	record Trainer(int id, String name, double salary) {};
	
	record Student(String course, int id, String name) {};

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//Duplicate Object throws  java.lang.IllegalStateException 
		ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
		listOfCustomers.add(new Customer(111, "Scott", 23000));
		listOfCustomers.add(new Customer(222, "Smith", 15000));
		listOfCustomers.add(new Customer(333, "Alen", 10000));
		//listOfCustomers.add(new Customer(333, "Alen", 10000));
		
		
		Map<Integer, String> collect = listOfCustomers.stream()
		        .collect(Collectors.toMap(c -> c.id(),c -> c.name()));
		
		
		System.out.println(collect);
		
		//It does not throws IllegalStateException while Duplicate object found we can replace key using BinaryOperator
		ArrayList<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product(1, "Camera", 20000));
		listOfProducts.add(new Product(2, "Laptop", 50000));
		listOfProducts.add(new Product(3, "Shirt", 899));
		listOfProducts.add(new Product(1, "Camera", 20000));
		
		Map<Integer, String> collect2 = listOfProducts.stream()
		          .collect(Collectors.toMap(p -> p.id(), p -> p.name(), (oldKey,newKey) -> newKey));
		
		System.out.println(collect2);
		
		
		//print the data in the same order as they inserted
		ArrayList<Trainer> listOfTrainer = new ArrayList<>();
		listOfTrainer.add(new Trainer(111, "Aryan", 15000));
		listOfTrainer.add(new Trainer(222, "Raju", 7000));
		listOfTrainer.add(new Trainer(333, "Ravi", 25000));
		listOfTrainer.add(new Trainer(444, "Ankit", 3000));
		
		LinkedHashMap<Integer, String> collect3 = listOfTrainer.stream()
		       .collect(Collectors.toMap(t -> t.id(), t -> t.name(), (ok,nk) -> nk, LinkedHashMap::new));
		
		System.out.println(collect3);
		
		
		//Collectors.joinig(CharSequence delimiter)
		
		List<String> list = Arrays.asList("a","b","c","d","e");
		
		String collect4 = list.stream()
				.sorted(Comparator.reverseOrder())
		      .collect(Collectors.joining(""));
		
		System.out.println(collect4);
		
		//Group the city according to their lenghth
		
		List<String> cities = Arrays.asList("pune","ampt", "Chennai", "Hydrabad", "Mumbai", "Delhi", "Indore", "Kolkata");
		
		Map<Integer, List<String>> collect5 = cities.stream()
		    .collect(Collectors.groupingBy(String::length));
		
		collect5.forEach((k,v) -> IO.println(k+"="+v));
		
		//Group by course
		
		ArrayList<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student("Java", 101, "Aryan"));
		listOfStudents.add(new Student("Java", 102, "Vicky"));
		listOfStudents.add(new Student("Java", 103, "Rohan"));
		listOfStudents.add(new Student("HTML", 201, "Raju"));
		listOfStudents.add(new Student("HTML", 202, "Vishal"));
		listOfStudents.add(new Student("React", 301, "Pramod"));
		listOfStudents.add(new Student("React", 302, "Shubham"));
		listOfStudents.add(new Student("React", 302, "Shubham"));
		
		
		Map<String, List<Student>> map  = listOfStudents.stream()
		   .collect(Collectors.groupingBy(Student::course));
		
		map.forEach((k,v) -> IO.println(k+"="+v));
		
		
		
		
		
		
		
		

	}

}
