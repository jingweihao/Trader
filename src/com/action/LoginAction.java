package com.action;

import java.util.*;

import com.data.Sales;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	private List<Sales> list;
	
	public void setList(List<Sales> list)
	{
		this.list = list;
	}
	
	public List<Sales> getList()
	{
		return list;
	}
	
	public String execute() throws Exception 
	{
		list = new ArrayList<Sales>();
		for(int i = 0; i < 50; i++)
		{
			list.add(new Sales("anteater.png", "Anteater", "$20", "The anteaters are more closely related to the sloths than they are to any other group of mammals. Their next closest relations are armadillos."));
		}

		return "success";
	}

}
