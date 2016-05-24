package com.action;

import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action 
{
	private String username;
	private String tel;
	private String password;
	private String confirmpassword;
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setConfirmPassword(String confirmpassword)
	{
		this.confirmpassword = confirmpassword;
	}
	
	public String execute() throws Exception {
		
		return null;
	}

}
