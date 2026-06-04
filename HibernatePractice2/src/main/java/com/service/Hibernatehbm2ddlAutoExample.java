package com.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Orders;
import com.utils.SessionFactoryConnection;

public class Hibernatehbm2ddlAutoExample {

	public static void main(String[] args) {
		
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
//		Orders order = new Orders(1,20,2);
//		session.persist(order);
//		Orders order1 = new Orders(2,200,20);
//		session.persist(order1);
		
		Orders order = session.find(Orders.class,1);
		System.out.println(order);
		
		session.getTransaction().commit();
	}

}
