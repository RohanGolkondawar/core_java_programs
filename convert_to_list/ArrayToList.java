package com.rohan.convert_to_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static List<String> convertToList(String[] inputArray)
	{
		List<String> list;
		
		if(inputArray.length==0)
		{
			System.out.println("Empty list");
			System.exit(0);
		}
		
		list = new ArrayList<>(Arrays.asList(inputArray));
        return list;
	}

}
