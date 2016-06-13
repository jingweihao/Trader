package com.getService;

import java.util.ArrayList;
import java.util.Random;

import com.data.Sales;
import com.data.SearchResult;

public class UserThread implements Runnable 
{
    private String name;
    private int ith;
    private Random r = new Random();
    private Service s = Service.getInstance();
    
    public UserThread(String name, int ith)
    {
    	System.out.println("User Thread constructing~~~~~~~~~~~");
    	this.name = name;
    	this.ith = ith;
    }
    
	public void run() 
	{
        	System.out.println(name + " runs~~~~~~~~~~~");
        	if(name.charAt(0) == 'A')
        	{
        		String result = s.get_Hello1(name, ith);
        		System.out.println(name + "has:  " + result);
        	}
        	else if(name.charAt(0) == 'B')
        	{
        		ArrayList<SearchResult> list = s.get_TestSearch("book", ith);
            	System.out.println(name + " has " + list.size() + " results");
        	}
        	else
        	{
            	ArrayList<Sales> list = s.get_TestSales("user2", ith);
            	System.out.println(name + " has " + list.size() + " results");        		
        	}
//        	if(name.isEmpty() == false)
//        	{
//        		String result = s.get_Hello1(name, ith);
//        		System.out.println(name + "has:  " + result);
//            	//ArrayList<SearchResult> list = s.get_Search("book");
//            	//System.out.println(name + " has " + list.size() + " results");
//        	}
//        	else
//        	{
//        		String result = s.get_Hello1(name, ith);
//        		System.out.println(name + "has:  " + result);
//            	//ArrayList<Sales> list = s.get_Sales("user1");
//            	//System.out.println(name + " has " + list.size() + " results");        		
//        	}
//        	try{
//        		Thread.sleep(r.nextInt(10)*100);
//        	}
//        	catch(InterruptedException e) 
//        	{
//                e.printStackTrace();
//            }
        	
        
	}

}
