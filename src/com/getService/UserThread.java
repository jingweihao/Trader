package com.getService;

import java.util.ArrayList;
import java.util.Random;

import com.data.Sales;
import com.data.SearchResult;

public class UserThread implements Runnable 
{
    private String name;
    private Random r = new Random();
    private Service s = Service.getInstance();
    
    public UserThread(String name)
    {
    	System.out.println("User Thread constructing~~~~~~~~~~~");
    	this.name = name;
    }
    
	public void run() 
	{
        for(int i = 1; i <= 2; i++)
        {
        	System.out.println(name + " runs " + i);
        	if(name.charAt(0) == 'A')
        	{
        		//String result = s.get_Hello1(name);
        		//System.out.println(name + "has:  " + result);
            	ArrayList<SearchResult> list = s.get_Search("book");
            	System.out.println(name + " has " + list.size() + " results");
        	}
        	else
        	{
        		String result = s.get_Hello1(name);
        		System.out.println(name + "has:  " + result);
            	//ArrayList<Sales> list = s.get_Sales("user1");
            	//System.out.println(name + " has " + list.size() + " results");        		
        	}
        	try{
        		Thread.sleep(r.nextInt(10)*100);
        	}
        	catch(InterruptedException e) 
        	{
                e.printStackTrace();
            }
        	
        }
	}

}
