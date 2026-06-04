package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.entity.Product;
import com.entity.ProductId;
import com.utils.SessionFactoryConnection;

public class CompositePrimaryKeyOperations {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
//		compositePrimaryKeyInsert(session);
//		compositePrimaryKeyUpdate(session);
//		compositePrimaryKeySelect(session);
//		compositePrimaryKeySelectAll(session);

	}

	private static void compositePrimaryKeySelectAll(Session session) {
		SelectionQuery<Product> selectionQuery = session.createSelectionQuery("from Product",Product.class);
		List<Product> list = selectionQuery.list();	
		for(Product p : list) {
			System.out.println(p);
		}
	}

	private static void compositePrimaryKeySelect(Session session) {
		ProductId prod = new ProductId(2,"Lemon");
		Product product = session.find(Product.class,prod);
		System.out.println(product);
	}

	private static void compositePrimaryKeyUpdate(Session session) {
		ProductId prod = new ProductId(2,"Lemon");
		Product product = session.find(Product.class,prod);
		session.beginTransaction();
		product.setPrice(1000);
		session.merge(product);
		System.out.println(product);
		session.getTransaction().commit();
	}

	private static void compositePrimaryKeyInsert(Session session) {
		ProductId prod = new ProductId(2,"Lemon");
		Product product = new Product(prod,10,3);
		session.beginTransaction();
		session.persist(product);
		session.getTransaction().commit();
	}

}
