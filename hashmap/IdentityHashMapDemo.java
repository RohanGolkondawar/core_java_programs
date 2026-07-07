package com.rohan.hashmap;

import java.util.IdentityHashMap;

record Product(int id, String name)
{
	
}

public class IdentityHashMapDemo {

	public static void main(String[] args) 
	{
		Product p1 = new Product(1, "Camera");
		Product p2 = new Product(2, "Laptop");
		Product p3 = new Product(3, "TV");
		Product p4 = new Product(1, "Camera");
		
		System.out.println(p1.hashCode()+" "+p4.hashCode());
		System.out.println(p1.equals(p4));
		
		IdentityHashMap<Product, Double> ih = new IdentityHashMap<Product, Double>();
		ih.put(p1, 50000D);
		ih.put(p2, 10000D);
		ih.put(p3, 30000D);
		ih.put(p4, 40000D);
		
		ih.forEach((k,v) -> System.out.println(k+"="+v));
		
		

	}

}
