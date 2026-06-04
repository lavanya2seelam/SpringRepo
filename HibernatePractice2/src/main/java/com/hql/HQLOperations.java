package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.Employees;
import com.utils.SessionFactoryConnection;

public class HQLOperations {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();

//		selectAll(session);
		
//		selectByIdAndName(session);
//		insert(session);
//		update(session);
//		delete(session);
		
		

	}

	private static void delete(Session session) {
		session.getTransaction().begin();
		MutationQuery mutationQuery = session.createMutationQuery("delete Employees where empId = ?1");
		mutationQuery.setParameter(1,1);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void update(Session session) {
		session.getTransaction().begin();
		MutationQuery mutationQuery = session.createMutationQuery("Update Employees set name = :name where empId = :empId");
		mutationQuery.setParameter("name", "Lavanya Ravi Kumar");
		mutationQuery.setParameter("empId", 2);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void insert(Session session) {
		session.getTransaction().begin();
		MutationQuery mutationQuery = session.createMutationQuery("insert into Employees(name,salary) values (?1,?2)");
		mutationQuery.setParameter(1, "Sneha");
		mutationQuery.setParameter(2,30000);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void selectByIdAndName(Session session) {
		SelectionQuery<Employees> selectionQuery = session.createSelectionQuery("from Employees where empId = :empId and name = :name",Employees.class);
		selectionQuery.setParameter("empId", 4);
		selectionQuery.setParameter("name", "jithu");
		List<Employees> list = selectionQuery.list();
		System.out.println(list);
	}

	private static void selectAll(Session session) {
		SelectionQuery query = session.createSelectionQuery("select e from Employees e", Employees.class);
		List<Employees> list1 = query.list();
		for(Employees emp : list1){
			System.out.println(emp);
		}
	}

}
