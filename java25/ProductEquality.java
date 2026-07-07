package com.rohan.java25;

public class ProductEquality {

	public static void main(String[] args) 
	{
		Product p1 = new Product(1,"Mobile");
		Product p2 = new Product(1,"mobile");
		IO.println(p1.equals(p2));
		IO.println(p1.hashCode());
		IO.println(p2.hashCode());

	}

}
