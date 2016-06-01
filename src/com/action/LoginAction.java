package com.action;

import java.util.*;

import org.apache.struts2.interceptor.SessionAware;

import com.data.Sales;
import com.data.User;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action, SessionAware 
{
	private Map<String, Object> sessionmap;
    private User user;
	
	public void setSession(Map<String, Object> sessionmap) 
	{
		this.sessionmap = sessionmap;		
	}
	
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

		System.out.println("In the LoginAction and username is " + user.getUsername() + "  password is " + user.getPassword());
		
		Service s = Service.getInstance();
		
		user = s.get_Verify(getUser());
		if(user == null)
		{
			System.out.println("User Wrong!");
			return "error";
		}
		
		System.out.println("Welcome!");
		
		sessionmap.put(".user", getUser());
		ArrayList<Sales> list = s.get_Sales(user.getUsername());

		for(Sales item : list)
		{
			sessionmap.put(item.getId(), item);
		}
		
		return "success";
	}

	
}
