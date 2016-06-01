package com.action;

import java.util.*;

import org.apache.struts2.interceptor.SessionAware;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class SoldAction implements Action, SessionAware 
{
	private String itemid;
	private Map<String, Object> sessionmap;
	
	public void setItemid(String itemid)
	{
		this.itemid = itemid;
	}

	public void setSession(Map<String, Object> sessionmap) 
	{		
		this.sessionmap = sessionmap;
	}
	
	public String execute() throws Exception 
	{
		System.out.println("itemid: " + itemid + " has sold out!");
		boolean flag = Service.getInstance().get_DeleteItem(itemid);
		if(flag)
			System.out.println("Sold out successfully!");
		else
			System.out.println("Sold out problem!");
		sessionmap.remove(itemid);
		return "success";
	}

}
