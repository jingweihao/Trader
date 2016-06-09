package com.action;

import java.util.*;

import org.apache.struts2.interceptor.SessionAware;

import com.data.User;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class SoldAction implements Action, SessionAware 
{
	private String itemid;
	private String category;
	private String itemname;
	private Map<String, Object> sessionmap;
	
	public void setItemid(String itemid)
	{
		this.itemid = itemid;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setItemname(String itemname)
	{
		this.itemname = itemname;
	}

	public void setSession(Map<String, Object> sessionmap) 
	{		
		this.sessionmap = sessionmap;
	}
	
	public String execute() throws Exception 
	{
		System.out.println("item: " + category + "/" + itemname + "/" + itemid + "  has sold out!");
		User user = (User)sessionmap.get(".user");
		String sellername = user.getUsername();
		boolean flag = Service.getInstance().get_DeleteItem(category, itemname, itemid, sellername);
		if(flag)
			System.out.println("Sold out successfully!");
		else
			System.out.println("Sold out problem!");
		sessionmap.remove(itemid);
		return "success";
	}

}
