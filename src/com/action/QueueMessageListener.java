package com.action;

import javax.jms.*;

public class QueueMessageListener implements MessageListener
{  
    private String num;  

    public QueueMessageListener(String num)
    {  
        super();  
        this.num=num;  
    }
    
    public QueueMessageListener()
    {  
        super();  
    }  
    
    public void onMessage(Message message) 
    {  
        System.out.println(message.toString()+num);  
    } 
    
}