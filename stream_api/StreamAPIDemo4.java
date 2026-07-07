package com.rohan.stream_api;

import java.util.Arrays;

public class StreamAPIDemo4 {
	
	public static boolean isArmstrong(int n)
	{
		int original = n;
		int digits = String.valueOf(n).length();
		int sum=0;
		int temp = n;
		int r = 0;
		
		while(temp!=0)
		{
			r = temp%10;
			sum = (int) Math.pow(r, digits);
			temp/=10;
		}
		
		return sum==original;
	}


	public static void main(String[] args) 
	{
		//Checking ArmStrong
		
		int numb[] = {153,370,1634,14,885,453,4120};
		
		Arrays.stream(numb)
		         .filter(x -> isArmstrong(x))
		            .forEach(IO::println);


	}

}
