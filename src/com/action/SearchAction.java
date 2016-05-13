package com.action;

import java.util.*;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.data.SearchResult;
import com.opensymphony.xwork2.Action;
import com.service.Search;

public class SearchAction implements Action 
{
	private List<SearchResult> searchlist;
	private String searchword;
	
	public void setSearchword(String searchword)
	{
		this.searchword = searchword;
	}
	
	public String getSearchword()
	{
		return searchword;
	}
	
	public void setSearchlist(List<SearchResult> searchlist)
	{
		this.searchlist = searchlist;
	}
	
	public List<SearchResult> getSearchlist()
	{
		return searchlist;
	}

	public String execute() throws Exception 
	{
		System.out.println("searchword is " + searchword);
//		searchlist = new ArrayList<SearchResult>();
//		for(int i = 0; i < 50; i++)
//		{
//			searchlist.add(new SearchResult("anteater.png", "Anteater", "$20", "The anteaters are more closely related to the sloths than they are to any other group of mammals. Their next closest relations are armadillos."));
//		}
		
		String url = "http://localhost:8080/TraderService/S";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Search.class);
		factory.setAddress(url);
		Search search = (Search)factory.create();
		searchlist = search.doSearch(searchword);

		return "success";
	}

}
