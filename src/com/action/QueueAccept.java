package com.action;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;



public class QueueAccept 
{
	public static void main(String[] args) throws JMSException
	{
		String jmsprovider = "tcp://localhost:61616";
		ConnectionFactory factory = new ActiveMQConnectionFactory(jmsprovider);
		Connection conn = factory.createConnection();
		Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//String destinationName = "queue";
		//Destination dest = session.createQueue(destinationName);
		Queue dest = new ActiveMQQueue("queue");
		MessageConsumer consumer1 = session.createConsumer(dest);
		MessageConsumer consumer2 = session.createConsumer(dest);
		consumer1.setMessageListener(new QueueMessageListener("1"));
		consumer2.setMessageListener(new QueueMessageListener("2"));
		conn.start();
//		while(true)
//		{
//			TextMessage tm = (TextMessage)consumer1.receive();
//			String str = tm.getText();
//			System.out.println("Accept: " + str);
//		}
		
		
		
		
	}

}
