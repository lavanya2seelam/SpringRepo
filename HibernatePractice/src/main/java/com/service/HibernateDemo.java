package com.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SessionFactoryConnection;

class Operations {
	static SessionFactory fact = SessionFactoryConnection.getSessionFactory();
	public static void insert() {
		Session session = fact.openSession();
		System.out.println(fact);
		session.getTransaction().begin();
		Lav obj = new Lav(16,"kumar","TPT");
		session.persist(obj);
		session.getTransaction().commit();
		SessionFactory fact1 = SessionFactoryConnection.getSessionFactory();
		System.out.println(fact1);
	}
	//DQL operation
	public static void get() {
		Session session = fact.openSession();
		System.out.println(fact);
		//There is no need to get the begin transaction why because there is no transaction(changes/updation) only getting the data in table
		Lav obj = session.find(Lav.class,1);
		System.out.println(obj);
	}
	
	public static void delete() {
		Session session = fact.openSession();
		session.getTransaction().begin();
		Lav obj = new Lav(20,"","");
		session.remove(obj);
		session.getTransaction().commit();
		System.out.println("Removed successully");
	}
	
	public static void update() {
		Session session = fact.openSession();
		session.getTransaction().begin();
		Lav lav = session.find(Lav.class,15);
//		lav.setRoll(100);   we cannot update the primary key value 
		lav.setName("Rakesh");
		lav.setAddress("KCR");
		session.merge(lav);
		session.getTransaction().commit();
		System.out.println("Updated Successully");
	}

}

public class HibernateDemo{
	public static void main(String args[]) {
		Operations op = new Operations();
//		op.insert();
		op.get();
//		op.delete();
		op.update();
	}
}
