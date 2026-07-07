package com.rohan.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLogicalStream {
	
	
	public static boolean isPrime(Integer n)
	{
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
			return true;
		else 
			return false;
	}
	
	
	public static boolean isPalindrome(String word)
	{
		boolean isPalindrome = true;  // madam
		
		char[] charArray = word.toCharArray();
		
		for(int i=0; i<=charArray.length/2;i++)
		{
			if(charArray[i]!=charArray[charArray.length-1-i])
			{
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) 
	{
		//Q1) WAP to remove Negative Numbers from an Integer Array.
		Integer[] numbers = {-10,-5,0,5,10,15};
		
		List<Integer> list = Arrays.stream(numbers)
		          .filter(n -> n>0)
		             .toList();
		IO.println(list);
		
		/* WAP to print all the names from String array which contains 
	    letter 'a' in the name. */
		
		String[] names = {"Rahul","Raj","Arnav","Scott","Smith"};
		
		List<String> list2 = Arrays.stream(names)
		        .filter(n -> n.contains("A") || n.contains("a"))
		          .toList();
		
	    IO.println(list2);
	    
	    
//	    WAP to print all the Prime Numbers from an Integer Array.
	    
	    
	    Integer[] numbers2 = {2,3,4,5,6,7,8,9,10,11};
	    
	    List<Integer> prime = Arrays.stream(numbers2)
	             .filter(n -> isPrime(n) )
	               .toList();
	    
	    IO.println(prime);
	    
//	    WAP to print all the names from String array where the length of the 
//	    name must be greater than 3.
	    
	    String[] words = {"Raj", "Rohit","Smirti", "Richa","Sky"};
	    
	    List<String> list3 = Arrays.stream(words)
	             .filter(n -> n.length()>3)
	                .toList();
	    
	    System.out.println(list3);
	             
	  //  WAP to print all the unique numbers from the Array.           
	             
	    Integer[] numbers3 = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
	    
	    List<Integer> list4 = Arrays.stream(numbers3)
	             .distinct()
	               .toList();
	    
	    IO.println(list4);
	    
	    
	    //WAP to filter Palindrome Words from an Array.
	    
	    String[] words2 = {"madam", "hello", "racecar", "java", "level", "world"};
	    
	     List<String> list5 = Arrays.stream(words2)
	               .filter(n -> isPalindrome(n))
	                 .toList();
	     
	     IO.println(list5);
		
	     
	    //WAP to convert Integer Array to String Representation
	     
	     Integer[] numbers4 = {10, 20, 30, 40, 50};
	     
	     Arrays.stream(numbers4)
	              .forEach(n -> System.out.print("Numbers : "+n+" "));
	     
	     System.out.println();
	     
	     //WAP to convert all the names of String array into uppercase
		
	     String[] names1 = {"Virat", "Sanju", "Rohit", "Bumrah"};
	     
	     List<String> list6 = Arrays.stream(names1)
	              .map(n -> n.toUpperCase())
	                 .toList();
	     
	     IO.println(list6);

		//WAP to convert boolean value to "Yes" or "No"
		
	     Boolean[] flags = {true, false, true, false, true};
	     
	     List<String> list7 = Arrays.stream(flags)
	               .map(e -> e?"Yes":"No")
	                  .toList();
	     
	     IO.println(list7);
	     
	  //WAP to extract First Letter of Each Word from String Array
	     
	     String []names4 = {"James", "Aryan", "Vibha", "Aniket"};
	     
	     List<Character> list8 = Arrays.stream(names4)
	               .map(e -> e.charAt(0))
	                 .toList();
	     
	     IO.println(list8);
	               
	                 
		
		

	}

}
