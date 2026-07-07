package com.rohan.arraylist_scenario;

import java.util.*;
import java.util.Map.Entry;


public class ArrayListDemo {
	
	public static <V> void main(String[] args) 
	{
		
		HashMap<String, Double> hs = new HashMap<String, Double>();
		hs.put("Shoes", 20000D);
		hs.put("Watch", 15000D);
		hs.put("Aaptop", 50000D);
		
		ArrayList<Entry<String, Double>> list = new ArrayList<>(hs.entrySet());
		
		list.sort((k,v) -> v.getKey().compareTo(k.getKey()));
		
		IO.println(list);
		
//		hs.entrySet()
//		     .stream()
//		        .sorted((k,v) -> Double.compare(v.getValue(), k.getValue()))
//		          .forEach(IO::println);
		
		
		 /*ArrayList listOfCity = new ArrayList();
		listOfCity.add("Hydrabad");
		listOfCity.add("Mumbai");
		listOfCity.add("Kolkata");
		listOfCity.add("Delhi");
		listOfCity.add(12);
		
		Vector v = new Vector(listOfCity);
		Enumeration elements = v.elements();
		
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
		
		Stack s = new Stack();
		s.add(12);
		s.add(14);
		s.add(18);
		
		Enumeration elements2 = s.elements();
		
		while(elements2.hasMoreElements())
		{
			System.out.println(elements2.nextElement());
		} */
		
		
		
		
	}

}
