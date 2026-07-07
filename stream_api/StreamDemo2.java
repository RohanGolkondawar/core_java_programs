package com.rohan.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo2 {
	
	public static boolean isArmstrong(int n)
	{
		int original = n;
		int digits = String.valueOf(n).length();
		double sum=0;
		int temp = n;
		int r = 0;
		
		while(temp!=0)
		{
			r = temp%10;
			sum += Math.pow(r, digits);
			temp/=10;
		}
		
		return sum==original;
	}
	
	public static boolean isPalindrome(String s1)
	{
		boolean isPalindrome = s1.equals(new StringBuilder(s1).reverse().toString());
		
		return isPalindrome;
	}

	public static void main(String[] args) 
	{
		//first non-repeated character in string
		
		String word = "geeksforgeeks";
		
		Optional<Entry<Character, Long>> first = word.chars()
		     .mapToObj(c -> (char) c)
		       .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
		          .entrySet().stream()
		            .filter(e -> e.getValue()==1)
		              .findFirst();
		
		System.out.println(first);
		
		
		
		String w2 = "swiss";
		
	 w2.chars()
		 .mapToObj(c -> (char) c)
		   .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
		     .entrySet().stream()
		        .filter(e -> e.getValue()==1)
		           .findFirst()
		              .ifPresent(IO::println);
		             
		
		
		
		
		//Find numbers starting with 1
		Integer numbers[] = {11,25,41,32,54,15,18,17,19};
		
		Arrays.stream(numbers)
		  .map(n -> String.valueOf(n))
		    .filter(n -> n.startsWith("1"))
		      .forEach(IO::println);
		
		//Checking Anagrams
		String s1 = "silent";
		String s2 ="listen";
		
		char[] charArray = s1.toCharArray();
		Arrays.sort(charArray);
		
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray2);
		
		System.out.println(Arrays.equals(charArray, charArray2));
		
		String s3 = "rat";
		String s4 = "tar";
		
		boolean isAnagram = Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
		
		System.out.println(isAnagram);
		
	Object[] array = s1.chars().sorted()
	.mapToObj(c -> (char) c).toArray();
	
	System.out.println(Arrays.toString(array));
	
	
	//remove duplicates
	String s5 = "programming";
	
	String s6 = s5.chars()
	.mapToObj(c -> String.valueOf((char) c))
	  .distinct()
	     .collect(Collectors.joining(""));
	
	System.out.println(s6);
	
	
	//checking palindrome
	
	String s7[] = {"madam","racecar","geeks","youtube"};
	
	Arrays.stream(s7)
	         .filter(s -> isPalindrome(s))
	            .forEach(IO::println);
	
	
	
	//Checking ArmStrong
	
	int numb[] = {153,370,1634,14,885,453,4120};
	
	int[] ArmstrongNumbers = Arrays.stream(numb)
	         .filter(x -> isArmstrong(x))
	            .toArray();
	//printing
	
	System.out.println(Arrays.toString(ArmstrongNumbers));
	
	
		
	
		
		
		
			
			  
		    
		
	
		
		
		
		

	}

}
