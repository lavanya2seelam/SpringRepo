package com.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.dao.DepartmentDAO;
import com.models.Department;

public class Application {

	public static void main(String[] args) {
		ApplicationContext container =
		        new AnnotationConfigApplicationContext(Config.class);
		DepartmentDAO department = container.getBean(DepartmentDAO.class);
		
		department.saveDepartment(new Department("EEE"));
		Department department2 = department.getDepartment(1);
		System.out.println(department2);
		List<Department> allDepartment = department.getAllDepartment();
		System.out.println(allDepartment);

	}

}