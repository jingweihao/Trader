package com.action;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.data.Sales;
import com.getService.Service;
import com.opensymphony.xwork2.Action;

public class AddItemAction implements Action, SessionAware, ServletContextAware 
{
	private Sales salesitem;
	private Map<String, Object> sessionmap;
	private ServletContext servletContext;
	private File file;
	private String fileFileName;
		
	public void setSalesitem(Sales salesitem)
	{
		this.salesitem = salesitem;
	}
	
	public void setSession(Map<String, Object> sessionmap) 
	{
		this.sessionmap = sessionmap;
	}
	
	public void setServletContext(ServletContext servletContext) 
	{
		this.servletContext = servletContext;
	}
	
	public void setFile(File file)
	{
		this.file = file;
	}
	
	public void setFileFileName(String fileFileName)
	{
		this.fileFileName = fileFileName;
	}
	
	public Sales getSalesitem()
	{
		return salesitem;
	}

	public String execute() throws Exception 
	{
		String imgstr = Image.imageToBase64(file);
		String downloadimg = servletContext.getRealPath("img") + "/" + fileFileName;
		System.out.println(downloadimg);
		Image.base64ToImage(imgstr, downloadimg);
		salesitem.setImgpath("img/" + fileFileName);
		String id_return = Service.getInstance().get_AddItem(salesitem);
		salesitem.setId(id_return);
		System.out.println("Successfully Add Item: " + salesitem);
		
		sessionmap.put(salesitem.getId(), salesitem);
		
		return "success";
	}

}
