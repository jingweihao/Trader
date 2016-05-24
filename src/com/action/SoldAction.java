package com.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
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
		// TODO: delete the item in S3
		System.out.println("itemid: " + itemid + " has sold out!");
		sessionmap.remove(itemid);
		return "success";
	}

}
