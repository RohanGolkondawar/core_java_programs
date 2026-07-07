package com.rohan.java25;

import java.util.Random;
import java.util.function.Supplier;
import java.util.random.*;
public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 String totalCharacter = upper+lower+digits+special;
		 
		 Supplier<String> passwordSupplier = () -> 
		 {
			 Random random = new Random();
			 StringBuilder builder = new StringBuilder();
			 
			 for(int i=0;i<8;i++)
			 {
				 int randomNumber = random.nextInt(totalCharacter.length());
				 builder.append(totalCharacter.charAt(randomNumber));
			 }
			 
			 return builder.toString();
		 };
		 
		 IO.println("Generated Password : "+passwordSupplier.get());

	}

}
