package com.getService;

import java.util.*;

import com.data.Sales;
import com.data.User;

public class Test 
{
	private final static boolean flag = true;
	private static Service s;
	
	public static void main(String[] args)
	{
		s = Service.getInstance();
        // create users
		if(!flag)
		{
			ArrayList<User> users = new ArrayList<User>();
			for(int i = 1; i <= 3; i++)
			{
				User user = new User();
				user.setUsername("user" + i);
				user.setTel("0000000000");
				user.setPassword("123");
				user.setConfirmpassword("123");
				users.add(user);
				boolean b = s.get_Register(user);
				System.out.println("Register user " + i + "  Result: " + b);
			}
			
			for(int i = 0; i < users.size(); i++)
			{
				Sales salesitem_book = new Sales("1", "img/book.png", "Book" + i, "$15", "A good book!", "Book", users.get(i).getUsername(), users.get(i).getTel());
			    Sales salesitem_comp = new Sales("2", "img/computer.png", "Computer" + i, "$800", "A good computer!", "Computer", users.get(i).getUsername(), users.get(i).getTel());
				s.get_AddItem(salesitem_book);
				System.out.println("Add book " + i);
				s.get_AddItem(salesitem_comp);
				System.out.println("Add computer" + i);
			}

		}
		else
		{
			long before = System.currentTimeMillis();
			new Thread(new UserThread("A1")).start();
			new Thread(new UserThread("B1")).start();
			//new Thread(new UserThread("A2")).start();
			//new Thread(new UserThread("B2")).start();
			//new Thread(new UserThread("A3")).start();
			//new Thread(new UserThread("B3")).start();
			//new Thread(new UserThread("A4")).start();
			while(true)
			{
				if(Thread.activeCount() == 1) break;
			}
			System.out.println("final active acounts: " + Thread.activeCount());
			long after = System.currentTimeMillis();
			long time = after - before;
			System.out.println("time : " + time);

		}
		
		
		
		
		
		
		
	}

}
