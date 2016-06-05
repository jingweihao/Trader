package com.getService;

import java.util.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.data.Sales;
import com.data.SearchResult;
import com.data.User;

public class Service 
{	
	private GetService gs;
	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/getService/BalancerList.xml"});
	
	private Service()
	{
		gs = (GetService)context.getBean("balancer_service");
		System.out.println("Initializing~~~~~~~~~");
	}
	
	private static final Service service = new Service();
	
	public static Service getInstance()
	{
		System.out.println("Get Instance~~~~~~~~");
		return service;
	}
	
	public ArrayList<SearchResult> get_Search(String keyword)
	{
		System.out.println("Get_Search~~~~~~~~~");
		return gs.SearchService(keyword);
	}
	
	public ArrayList<Sales> get_Sales(String username)
	{
		System.out.println("Get_Sales~~~~~~~~~");
		return gs.SalesService(username);
	}
	
	public String get_AddItem(Sales sales)
	{
		System.out.println("Get_AddItem~~~~~~~~");
		return gs.AddItemService(sales);
	}
	
	public boolean get_DeleteItem(String category, String itemname, String itemid)
	{
		System.out.println("Get_DeleteItem~~~~~~~~~");
		return gs.DeleteItemService(category, itemname, itemid);
	}
	
	public User get_Verify(User user)
	{
		System.out.println("Get_Verify~~~~~~~~~");
		return gs.VerifyService(user);
	}
	
	public boolean get_Register(User user)
	{
		System.out.println("Get_Register~~~~~~~~~");
		return gs.RegisterService(user);
	}
	
}
