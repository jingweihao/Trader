package com.getService;

import java.util.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.data.Sales;
import com.data.SearchResult;

public class Service 
{	
	private GetService gs;
	private ClassPathXmlApplicationContext context;
	private Service()
	{
		context = new ClassPathXmlApplicationContext(new String[]{"com/getService/BalancerList.xml"});
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
	
}
