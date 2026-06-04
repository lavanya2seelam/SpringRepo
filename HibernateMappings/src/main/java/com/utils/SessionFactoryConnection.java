package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.entity.Course;
import com.entity.Student;

public class SessionFactoryConnection {
	public static SessionFactory factory = null;
	public static SessionFactory getSessionFactory() {
		
		if(factory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Aadhar.class);
			cfg.addAnnotatedClass(Citizen.class);
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Course.class);
			SessionFactory factory = cfg.buildSessionFactory();
			return factory;
		}else {
			return factory;
		}
	}
}
