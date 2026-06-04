package com.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.model.Employee;

public class DipendencyInjectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext();
		Employee employee = container.getBean(Employee.class);
		System.out.println(employee);

	}

}
