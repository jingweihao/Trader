package com.data;

public class Sales 
{
	private String img;
	private String name;
	private String price;
	private String info;
		
	public Sales(String img, String name, String price, String info)
	{
		this.img = img;
		this.name = name;
		this.price = price;
		this.info = info;
	}
	
	public String getImg()
	{
		return img;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	public String getInfo()
	{
		return info;
	}


}
