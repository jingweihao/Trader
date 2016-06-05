package com.getService;

import java.util.Random;

public class UserThread implements Runnable 
{
    private String name;
    private Random r = new Random();
    
    public UserThread(String name)
    {
    	this.name = name;
    }
    
	public void run() 
	{
        for(int i = 1; i <= 1000; i++)
        {
        	System.out.println(name + " runs " + i);
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
