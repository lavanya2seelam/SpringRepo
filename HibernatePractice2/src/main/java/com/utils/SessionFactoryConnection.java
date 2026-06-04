package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Orders;
import com.entity.*;

public class SessionFactoryConnection {
	public static SessionFactory factory = null;
	public static SessionFactory getSessionFactory() {
		
		if(factory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Orders.class);
			cfg.addAnnotatedClass(Employees.class);
			cfg.addAnnotatedClass(Product.class);
			SessionFactory factory = cfg.buildSessionFactory();
			return factory;
		}else {
			return factory;
		}
	}
}
