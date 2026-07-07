package com.rohan.enrollmentsystem;

public record Student(String name, EducationInstitute institute) {
	
	public void viewCoursesAndFees()
	{
		IO.println("1. Java : 35000.0");
		IO.println("2. .Net : 30000.0");
		IO.println("3. Python : 32000.0");

	}
	
	public void enrollInCourse(Integer courseId)
	{
		if(courseId==1)
		{
			IO.println(name+" enrolled in : Java");
		}
		else if(courseId==2)
		{
			IO.println(name+" enrolled in : .Net");
		}
		else if(courseId==3)
		{
			IO.println(name+" enrolled in : Python");
		}
	}
	
	public void viewOffers()
	{
		IO.println("Special discount: Get 20% off on all courses!");
		IO.println("Limited time offer: Enroll in any two courses and get one course free!");
	}

}
