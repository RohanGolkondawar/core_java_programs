package com.rohan.stream_api;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(Integer id, String name, Double sal)
{
	
}

public class FilterDemo {

	public static void main(String[] args) 
	{
		List<String> listOfNames = List.of("Aryan","Ankit","Raj","Rohit","Aniket","Raj","Aryan","Ajinkya","Ankit");
		
		listOfNames.stream()
		           .filter(n -> n.startsWith("A"))
		           .distinct()
		           .forEach(IO::println);
		
		Employee e1 = new Employee(111, "Juber" , 90000D);
		Employee e2 = new Employee(222, "Aryan" , 40000D);
		Employee e3 = new Employee(333, "Scott" , 60000D);
		Employee e4 = new Employee(444, "Rahul" , 70000D);
		Employee e5 = new Employee(555, "AKash" , 45000D);
		Employee e6 = new Employee(666, "Manav" , 92000D);
		Employee e7 = new Employee(111, "Juber" , 90000D);
		
	    List<Employee> list = Stream.of(e1,e2,e3,e4,e5,e6,e7)
		.filter(emp -> emp.sal()>50000)
		.distinct()
		.toList();
	    
	    list.forEach(e -> IO.println(e.name()));
		
		
		
		           

	}

}
