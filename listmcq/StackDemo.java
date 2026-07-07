package com.rohan.listmcq;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        int size = Integer.parseInt(IO.readln("Enter the Size : "));
        Stack<String> stack = new Stack<>();

        for(int i=0;i<size;i++)
        {
            String tab = IO.readln("Enter Value : ");
            stack.push(tab);
        }
        
        
        String searchItem = IO.readln("Enter search item : ");
        int position = stack.search(searchItem);
        
        if(position==-1)
        {
        	System.out.println("Item not found");
        }
        else
        {
        	System.out.println("Item found at position (from top) : "+position);
        }

        



        
    }
}

