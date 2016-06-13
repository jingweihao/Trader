package com.getService;

import java.util.ArrayList;

import com.data.Sales;
import com.data.User;

public class TestLL 
{
	private static Service s;
	
	public static void main(String[] args)
	{
		s = Service.getInstance();
        // create users
			ArrayList<User> users = new ArrayList<User>();
			for(int i = 1; i <= 100; i++)
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

			ArrayList<Long> result = new ArrayList<Long>();
			
			for(int r = 1; r <= 10; r++)
			{
				long total = 0;
				System.out.println("Round: " + r*3);
				for(int i = 0; i < 10; i++)
				{
					long before = System.currentTimeMillis();
					for(int j = 1; j <= r; j++)
					{
						new Thread(new UserThread("A" + j, j)).start();
						new Thread(new UserThread("B" + j, j)).start();
						new Thread(new UserThread("C" + j, j)).start();
					}
					
					while(true)
					{
						if(Thread.activeCount() == 1) break;
					}
					long after = System.currentTimeMillis();
					long time = after - before;
					total += time;
					System.out.println("time : " + time);
					
				}
				System.out.println("Total time: " + total);
				System.out.println("Average time: " + total / 10);
				result.add(total/10);				
				
			}
		
			System.out.println(result);
		
	}



}
