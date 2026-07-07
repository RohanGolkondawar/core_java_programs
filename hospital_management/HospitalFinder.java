package com.rohan.hospital_management;

import java.util.Arrays;
import java.util.Map;

public class HospitalFinder {

	public static void main(String[] args) {
		
		
		HospitalService service = new HospitalService();
		
		int code1 = service.addHospital("Yashoda", Arrays.asList("Cardiac","ENT", "Ortho","Pediatric","Gastro"), "Mathews", "984822222", "sec");
		
		int code2 = service.addHospital("APOLLO", Arrays.asList("Neuro","Dental","Ortho"), "Rajesh", "78526642331", "Hydrabad");
		
		//get All Hospital
		Map<Integer, String> hospitals = service.getHospitals();
		hospitals.forEach((k,v) -> System.out.println(k+"="+v));
		
		
		System.out.println("Hospital Details");
		System.out.println(service.getHospitalDetails(code1));
		System.out.println(service.getHospitalDetails(code2));
		System.out.println(service.getHospitalDetails(999));
		
		

	}

}
