package com.rohan.java25;

import java.util.*;

public class Demo {

	public static void main(String[] args) 
	{
		Vector<String> listofCity = new Vector<>();
		listofCity.add("Hydrabad");
		listofCity.add("Ameerpet");
		listofCity.add("Kolkata");
		listofCity.add("Pune");
		listofCity.add("Mumbai");
		
		IO.println("Ordinary for loop\n------------");
		for(int i=0;i<listofCity.size();i++)
		{
			IO.println(listofCity.get(i));
		}
		
		IO.println(" for-Each loop\n------------");
		for(String cityName : listofCity)
		{
			IO.println(cityName);
		}
		
		IO.println(" Enumeration Interface\n------------");
		
		Enumeration<String> elements = listofCity.elements();
		while(elements.hasMoreElements())
		{
			IO.println(elements.nextElement());
		}
		
		IO.println(" Iterator Interface\n------------");
		
		Iterator<String> iterator = listofCity.iterator();
		
		/*while(iterator.hasNext())
		{
			IO.println(iterator.next());
		}*/
		
		
		IO.println(" forEachRemaining Iterator Interface Method\n------------");
		
		iterator.forEachRemaining(str -> System.out.println(str));
		
		IO.println(" ListIterator Iterator Interface Method\n------------");
		
		ListIterator<String> listitr = listofCity.listIterator();
		
		IO.println("--------Forward Direction--------");
		
		while(listitr.hasNext())
		{
			IO.println(listitr.next());
		}
		
		IO.println("------Backward-----------");
		
		while(listitr.hasPrevious())
		{
			IO.println(listitr.previous());
		}
		
		IO.println("--------Splititerator interface -------");
		
		Spliterator<String> splititerator = listofCity.spliterator();
		splititerator.forEachRemaining(str -> IO.println(str));
		
		IO.println("----By using stream--------");
		
		listofCity.stream().forEach(city -> IO.println(city));
		
		IO.println("-----for-Each Method");
		
		listofCity.forEach(str -> IO.println(str));
		
		IO.println("-------Parallel Stream-------");
		
		listofCity.parallelStream().forEach(str -> IO.println(str));
		
		IO.println("---------Method Reference----------");
		
		listofCity.forEach(IO::println);
		

	}

}
