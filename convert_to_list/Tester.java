package com.rohan.convert_to_list;

import java.util.List;

public class Tester {

	public static void main(String[] args) 
	{
		String[] fruits = {"mango","Apple","Grapes","PineApple"};
		
		String[] veg = {};
		
		
		List<String> list = ArrayToList.convertToList(fruits);
		list.forEach(a -> System.out.println(a.toUpperCase()));

	}

}
