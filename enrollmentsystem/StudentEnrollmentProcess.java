package com.rohan.enrollmentsystem;

public class StudentEnrollmentProcess {

	    public static void main(String[] args) {

	        Course[] courses = {
	                new Course(1, "Java", 35000.0),
	                new Course(2, ".Net", 30000.0),
	                new Course(3, "Python", 32000.0)
	        };

	        Offer[] offers = {
	                new Offer("Special discount: Get 20% off on all courses!"),
	                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
	        };

	        EducationInstitute institute = new EducationInstitute(courses, offers);

	     
	        System.out.print("Enter student name: ");
	        String studentName = IO.readln();

	        Student student = new Student(studentName, institute);

	        student.viewCoursesAndFees();
	        student.viewOffers();

	        System.out.print("Enter course ID to enroll: ");
	        int courseId = Integer.parseInt(IO.readln());

	        student.enrollInCourse(courseId);

	        
	    }
	}
	


