package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.utils.SessionFactoryConnection;

public class HibernateOneToOneMapping {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
//		oneToOneInsert(session);
//OneToOneSelect(session);
		One2OneOnlyAadhar(session);
//		One2OneOnlyAadharWithCitizenBiDirectional(session);
	}

	private static void One2OneOnlyAadharWithCitizenBiDirectional(Session session) {
		Aadhar aadhar = session.find(Aadhar.class,123456789);
		System.out.println(aadhar);
		System.out.println(aadhar.getCitizen());
	}
	private static void One2OneOnlyAadhar(Session session) {
		Aadhar aadhar = session.find(Aadhar.class,123456789);
		System.out.println(aadhar);
	}
	private static void OneToOneSelectCitizenWithAadhar(Session session) {
		Citizen citizen = session.find(Citizen.class,1);
		System.out.println(citizen);
	}

	private static void oneToOneInsert(Session session) {
		Aadhar adhar = new Aadhar(123456789,"MPT");
		Citizen citizen = new Citizen("Lavanya",23,adhar);
		session.beginTransaction();
		session.persist(citizen);
		session.getTransaction().commit();
	}

}
