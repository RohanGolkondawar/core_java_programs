package com.rohan.hashmap;

import java.util.*;


record Emp(int id, String name)
{
	
}

public class WeakHashMapDemo {

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1, "Rohan");
		Emp e2 = new Emp(2, "Aryan");
		Emp e3 = new Emp(3, "Vicky");
		
		WeakHashMap<Emp, String> wh = new WeakHashMap<>();
		wh.put(e1, "Ghodpeth");
		wh.put(e2, "Nagpur");
		wh.put(e3, "Tadali");
		
		e1=null;
		System.gc();
		System.out.println(wh);
		

	}

}
