package com.rohan.employee_crud;

import java.util.ArrayList;

public class EmployeeDirectory {

	public static void main(String[] args) 
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Directory emp = new Directory(employees);
		Employee rohan = new Employee("Rohan", "SDE-1", 55000);
		emp.addEmployee(rohan);
		Employee aryan = new Employee("Aryan", "Manager", 70000);
		emp.addEmployee(aryan);
	    emp.displayAllEmployees();
	    System.out.println();
	    emp.updateEmployee(aryan);
	    emp.displayAllEmployees();

	}

}
