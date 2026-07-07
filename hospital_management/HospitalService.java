package com.rohan.hospital_management;

import java.util.*;

public class HospitalService {
	
	private List<Hospital> hospitalList = new ArrayList<>();
	private static int hospitalCounter = 100;
	
	//add Hospital
	public int addHospital(String hospitalName, List<String> treatments, 
			                String contactPerson, String contactNumber, String location)
	{
		Hospital hospital = new Hospital( hospitalName, treatments, contactPerson, contactNumber, location);
		
		hospital.setHospitalcode(++hospitalCounter);
		hospitalList.add(hospital);
		
		return hospital.getHospitalcode();
	}
	
	
	//get Hospital
	public Map<Integer, String> getHospitals()
	{
		Map<Integer, String> hospitalMap = new HashMap<>();
		
		for(Hospital hospital : hospitalList)
		{
			hospitalMap.put(hospital.getHospitalcode(), hospital.getHospitalName());
		}
		
		return hospitalMap;
	}
	
	
	//getHospitalDetails
	public Hospital getHospitalDetails(int hospitalCode)
	{
		for(Hospital hospital : hospitalList)
		{
			if(hospital.getHospitalcode()==hospitalCode)
			{
				return hospital;
			}
		}
		
		return null;
	}
	

	
}
