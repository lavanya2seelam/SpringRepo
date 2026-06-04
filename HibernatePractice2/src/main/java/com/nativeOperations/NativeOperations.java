package com.nativeOperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.entity.Employees;
import com.utils.SessionFactoryConnection;

public class NativeOperations {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
//		nativeSelectAll(session);
//		nativeSelectByIdAndName(session);
//		nativeInsert(session);
//		nativeUpdate(session);
//		nativeDelete(session);
		
	}

	private static void nativeDelete(Session session) {
		session.getTransaction().begin();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("delete from Employee where empId = ?1");
		nativeMutationQuery.setParameter(1, 7);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void nativeUpdate(Session session) {
		session.getTransaction().begin();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("update Employee set name = ?1 where empId= ?2");
		nativeMutationQuery.setParameter(1, "Jithender Reddy");
		nativeMutationQuery.setParameter(2, 4);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void nativeInsert(Session session) {
		session.getTransaction().begin();
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("insert into Employee(name,salary) values(?1,?2)");
		nativeMutationQuery.setParameter(1, "Monica");
		nativeMutationQuery.setParameter(2, 30000);
		nativeMutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void nativeSelectByIdAndName(Session session) {
		NativeQuery<Employees> nativeQuery = session.createNativeQuery("select * from Employee where empId = ?1 and name = ?2 ",Employees.class);
		nativeQuery.setParameter(1, 4);
		nativeQuery.setParameter(2,"jithu");
		List<Employees> list1 = nativeQuery.list();
		System.out.println(list1);
	}

	private static void nativeSelectAll(Session session) {
		NativeQuery<Employees> nativeQuery = session.createNativeQuery("Select * from Employee",Employees.class);
		List<Employees> list1 = nativeQuery.list();
		for(Employees emp : list1) {
			System.out.println(emp);
		}
	}

}
