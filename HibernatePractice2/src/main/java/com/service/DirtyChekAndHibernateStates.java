package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employees;
import com.utils.SessionFactoryConnection;

public class DirtyChekAndHibernateStates {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		//object is not liked with session this is Transient object thats why hibernate does not execute this this automatically without calling session methods
		Employees emp = new Employees("Jithu",80000);
//		session.persist(emp);
		
		Employees emp1 = session.find(Employees.class,2);
		//Object is linked with session menas this object used session this is Persistent object thats why hibernate execute this automatically without calling session methods
		emp1.setSalary(5000);
//		session.merge(emp1);
//		System.out.println(emp1);
		
		session.getTransaction().commit();
		
		session.close();
		
		//Object is not linked with session because session is closed this is Detached object, That's why hibernate does not execute this automatically without calling session methods
//		Employees emp2 = session.find(Employees.class,2); // it throws error why because session is closed
//		System.out.println(emp2);

	}

}
