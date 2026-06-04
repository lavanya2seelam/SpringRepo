package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.models.Department;

@Component("departmentDAO")
@Transactional
public class DepartmentDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession(SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	public Department getDepartment(int id) {
		Session session = getSession(sessionFactory);
		Department department =session.find(Department.class,1);
		return department;
	}
	
	public List<Department> getAllDepartment() {
		Session session = getSession(sessionFactory);
		return session.createQuery("from Department", Department.class).getResultList();
	}
	
	public void saveDepartment(Department department) {
		Session session = getSession(sessionFactory);
		session.persist(department);
		System.out.println("Inserted Successully");
	}

}