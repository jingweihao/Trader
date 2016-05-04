package com.action;


import javax.jms.*;
import javax.jms.Message;

import org.apache.activemq.*;
import org.apache.activemq.command.ActiveMQQueue;

public class QueueSend 
{
	public static void main(String[] args) throws JMSException
	{
		ConnectionFactory connectionfactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection connection = connectionfactory.createConnection();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue = new ActiveMQQueue("queue");
		MessageProducer msgproducer = session.createProducer(queue);
		for(int i = 0; i < 1000; i++)
		{
			Message msg = session.createTextMessage("JMS TEXT" + " - " + i);
			msgproducer.send(msg);
			System.out.println("Send out - " + i);
		}
		session.close();
		connection.close();
		
	}
	
   
}
