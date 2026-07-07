package com.rohan.arraylist_serialization_deserialization;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class Student implements Serializable {
	
	private int studentId;
	private String studentName;
	private double studentFees;
	private LocalDate dateOfAdmission;
	
	public Student(int studentId, String studentName, double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		int studentId = Integer.parseInt(IO.readln("Student Id: "));
		String studentName = IO.readln("Student Name : ");
		double studentFees = Double.parseDouble(IO.readln("Student fee : "));
		LocalDate dateOfAdmission = LocalDate.now();
		
		return new Student(studentId, studentName, studentFees, dateOfAdmission );
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
	
	

}
