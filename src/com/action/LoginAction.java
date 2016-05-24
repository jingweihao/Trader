package com.action;

import java.util.*;
import org.apache.struts2.interceptor.SessionAware;

import com.data.Sales;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action, SessionAware 
{
	private Map<String, Object> sessionmap;
	private String username;
	private String password;
	
	public void setSession(Map<String, Object> sessionmap) 
	{
		this.sessionmap = sessionmap;		
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String execute() throws Exception 
	{

		System.out.println("In the LoginAction and username is " + username + "  password is " + password);
		
		Service s = Service.getInstance();
		ArrayList<Sales> list = s.get_Sales(username);
		for(Sales item : list)
		{
			sessionmap.put(item.getId(), item);
		}
		
		return "success";
	}
	
	
}
