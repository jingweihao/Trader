package com.action;

import com.data.User;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action 
{
    private User user;
    
    public void setUser(User user)
    {
    	this.user = user;
    }
    
    public User getUser()
    {
    	return user;
    }
	
	public String execute() throws Exception 
	{
		
		boolean flag = Service.getInstance().get_Register(getUser());
		if(!flag)
		{
			System.out.println("Register fails!");
			return "error";
		}
		
		System.out.println("Register Successfully!");
		
		return "success";
	}

}
