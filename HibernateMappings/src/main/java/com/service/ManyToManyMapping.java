package com.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.utils.SessionFactoryConnection;

public class ManyToManyMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = SessionFactoryConnection.getSessionFactory();
		Session session = factory.openSession();
		
//		manyToManyInsert(session);
		
		manyToManySelectionByStudent(session);
		
//		manyToManySelectionByCourse(session);
		
	}

	private static void manyToManySelectionByStudent(Session session) {
		Student student = session.find(Student.class,1);
		System.out.println(student);
	}

	private static void manyToManySelectionByCourse(Session session) {
		Course course = session.find(Course.class,1);
		course.getStudent();
		System.out.println(course);
	}

	private static void manyToManyInsert(Session session) {
		session.beginTransaction();
		Student std1 = new Student("jithu",23);
		Student std2 = new Student("Jigar",24);
		Student std3 = new Student("jaheer",25);
		
		Course c1 = new Course("DSE");
		Course c2 = new Course("AI");
		Course c3 = new Course("ML");
		System.out.println(std1.getCourse());
		
		std1.getCourse().add(c1);
		std1.getCourse().add(c2);
		std2.getCourse().add(c1);
		std2.getCourse().add(c3);
		std3.getCourse().add(c2);
		std3.getCourse().add(c3);
		
		c1.getStudent().add(std1);
		c1.getStudent().add(std2);
		c2.getStudent().add(std1);
		c2.getStudent().add(std3);
		c3.getStudent().add(std1);
		c3.getStudent().add(std3);
		
		session.persist(std1);
		session.persist(std2);
		session.persist(std3);
		session.getTransaction().commit();
	}

}
