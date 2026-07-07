package com.rohan.comparable;

public class Student //implements Comparable<Student> 
{
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}




	/*@Override
	public int compareTo(Student s)
	{
		return s.name.compareTo(this.name);
	} */
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}





}
