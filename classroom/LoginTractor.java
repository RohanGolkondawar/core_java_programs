package com.rohan.classroom;

import java.util.*;

public class LoginTractor {
	
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       LoginTracker lt = new LoginTracker();
       System.out.println("Enter Username : ");
       while(true)
       {
         String username = sc.nextLine();
         if(username.equals("-1"))
         {
            break;
         }
         else
         {
            lt.recordLogin(username);
         }
       }

       lt.display();
       
        
    }
}

class LoginTracker{

        LinkedHashMap<String, Integer> map;

        LoginTracker()
        {
            map = new LinkedHashMap<>();
        }

        public void recordLogin(String username)
        {
            map.put(username,map.getOrDefault(username,0)+1);
            
        }

        public void display()
        {
            IO.println(map);
        }

}
