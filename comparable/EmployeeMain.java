package com.rohan.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee e[] = new Employee[3];
		e[0] = new Employee(3,"Rohan",5000D);
		e[1] = new Employee(2,"Vihan",8000D);
		e[2] = new Employee(1,"Santosh",9000D);
		
		Comparator<Employee> cmpid = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.name().compareTo(o2.name());
			}
		};
		
		Arrays.sort(e,cmpid);
		
		for(Employee e1 : e )
		{
			IO.println(e1);
		}
		

	}

}
