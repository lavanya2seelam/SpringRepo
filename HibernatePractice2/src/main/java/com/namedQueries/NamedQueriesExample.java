package com.namedQueries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employees;
import com.utils.SessionFactoryConnection;

public class NamedQueriesExample {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
//		namedQuerySelectAll(session);
//		namesQuerySelectById(session);
//		namedQueryUpdate(session);
}

	private static void namedQueryUpdate(Session session) {
		MutationQuery mutationQuery = session.createNamedMutationQuery("updateById");
		session.beginTransaction();
		mutationQuery.setParameter(1, 90000);
		mutationQuery.setParameter(2, 4);
		mutationQuery.executeUpdate();
		session.getTransaction().commit();
	}

	private static void namesQuerySelectById(Session session) {
		Query<Employees> namedQuery = session.createNamedQuery("selectById",Employees.class);
		namedQuery.setParameter(1,"2");
		List<Employees> list = namedQuery.list();
		System.out.println(list);
	}

	private static void namedQuerySelectAll(Session session) {
		Query<Employees> namedQuery = session.createNamedQuery("selectAll",Employees.class);
		List<Employees> list = namedQuery.list();
		for(Employees emp : list) {
			System.out.println(emp);
		}
	}

}
