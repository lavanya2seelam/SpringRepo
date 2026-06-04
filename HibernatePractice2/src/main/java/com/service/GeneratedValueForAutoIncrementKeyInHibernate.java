package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employees;
import com.utils.SessionFactoryConnection;

public class GeneratedValueForAutoIncrementKeyInHibernate {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		
		Employees emp = new Employees("Teja",40000);
		session.persist(emp);
		
		Employees emp1 = session.find(Employees.class,2);
		System.out.println(emp1);
		
		session.getTransaction().commit();

	}

}
