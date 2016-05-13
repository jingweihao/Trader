package com.action;

import java.util.*;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.data.Sales;
import com.opensymphony.xwork2.Action;
import com.service.PersonalSales;

public class LoginAction implements Action {

	private List<Sales> list;
	private String username;
	private String password;
	
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
//		list = new ArrayList<Sales>();
//		for(int i = 0; i < 50; i++)
//		{
//			list.add(new Sales("anteater.png", "Anteater", "$20", "The anteaters are more closely related to the sloths than they are to any other group of mammals. Their next closest relations are armadillos."));
//		}
		
		System.out.println("In the LoginAction and username is " + username + "  password is " + password);
//		Service su = Service.getInstance();
//		su.setClient(Service.PS_WSDL);
//		Client c = su.getClient();
//		QName opname = new QName(Service.inversepath, Service.getSales);
//		Object[] result = c.invoke(opname, "XiaoFeng DaShen");
//		list = (List<Sales>)Arrays.asList((Sales[])result);
//		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
//		Client c = dcf.createClient(Service.servicepath + Service.HS_WSDL);
//		Object[] result = c.invoke(opname, "XiaoFeng DaShen");
//		System.out.println(result[0]);

		String url = "http://localhost:8080/TraderService/PS";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PersonalSales.class);
		factory.setAddress(url);
		PersonalSales ps = (PersonalSales)factory.create();
		list = ps.getSales(username);
		
		
		return "success";
	}

}
