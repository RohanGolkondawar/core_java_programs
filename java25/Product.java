package com.rohan.java25;

import java.util.Objects;

public class Product {
	
	private int productid;
	private String productName;
	
	public Product(int productid, String productName) {
		super();
		this.productid = productid;
		this.productName = productName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName, productid);
	}

	@Override
	public boolean equals(Object obj) {
		
	
			Product p2 = (Product) obj;
			
			if(this.productid == p2.productid && this.productName.equals(p2.productName))
			{
				return true;
			}else
			{
				return false;
			}
		
	}
	
	
	
	

}
