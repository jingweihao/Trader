//package com.service;
//
//
//import org.apache.cxf.endpoint.Client;
//import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
//
//
//public class Service 
//{
//	public static final String servicepath = "http://localhost:8080/TraderService/";
//	public static final String inversepath = "http://service.com/";
//	public static final String HS_WSDL = "hs?wsdl";
//	public static final String sayHello = "sayHello";
//	public static final String S_WSDL = "S?wsdl";
//	public static final String doSearch = "doSearch";
//	public static final String PS_WSDL = "PS?wsdl";
//	public static final String getSales = "getSales";
//		
//	private JaxWsDynamicClientFactory dcf;
//	private Client client;
//	
//	private Service()
//	{
//		this.dcf = JaxWsDynamicClientFactory.newInstance();
//		System.out.println("Initializing~~~~~~~~~");
//	}
//	
//	private static final Service service_use = new Service();
//		
//	public static Service getInstance()
//	{
//		System.out.println("Get Instance~~~~~~~~");
//		return service_use;
//	}
//	
//	public void setClient(String impl_name)
//	{
//		this.client = dcf.createClient(servicepath + impl_name);
//	}
//	
//	public Client getClient()
//	{
//		return client;
//	}
//	
//}
