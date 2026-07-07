package com.rohan.java25;

import java.util.*;

public class ListCollectionInterface {
	
	public static void main(String[] args) 
	{
		
		List<Integer> list = new Vector<>();
		list.add(12);
		list.add(50);
		list.add(40);
		
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
			//list.add(5);
		}
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			list.remove(2);
		}
			

		
		List<Integer> list1 = new Vector<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.removeIf(num -> num%2==1);
		IO.println(list1);
		IO.println(list1.contains(Integer.valueOf(13)));
		
		//list.retainAll(list1);
		//list1.removeAll(list1);
//		list1.remove(1);
//		IO.println(list1);
//		IO.println(list1.size());
//		list1.clear();
//		IO.println(list1);

		
		
				
		
	
	
	}

}
