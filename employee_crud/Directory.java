package com.rohan.employee_crud;

import java.util.ArrayList;

public class Directory {
	
	ArrayList<Employee> employees;

	
	
	public Directory(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
	}

	public void addEmployee(Employee emp)
	{
		employees.add(emp);
	}
	
	public void displayAllEmployees()
	{
		employees.forEach(emp -> System.out.println(emp));
	}
	
	public void updateEmployee(Employee emp)
	{
		IO.println("Enter Which one do you want to update");
		IO.println("1. Name");
		IO.println("2. Position");
		IO.println("3. Salary");
		int choice = Integer.parseInt(IO.readln("Enter Choice :"));
		switch(choice)
		{
		case 1 ->
		{
			String name = IO.readln("Enter new Name : ");
			emp.setName(name);
			IO.println("Name updated Successfully");
		}
		case 2 ->
		{
			String position = IO.readln("Enter new Position : ");
			emp.setPosition(position);
			IO.println("position updated Successfully");

		}
		case 3 ->
		{
			 double salary = Double.parseDouble(IO.readln("Enter New Salary: "));
			 emp.setSalary(salary);
			 IO.println("Salary Updated Successfully");
		}
		default ->  IO.println("Invalid Choice");
		}
		
	}
	
	
	public void deleteEmployee(Employee emp)
	{
		employees.remove(emp);
	}
	
	
	

}
