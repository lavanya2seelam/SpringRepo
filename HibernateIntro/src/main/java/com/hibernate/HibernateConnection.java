package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConnection {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Lavanya.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		Lavanya obj = new Lavanya(12,"Monica","HYD");
		
		session.persist(obj);
		session.getTransaction().commit();
	}

}
