package com.springbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.model.Car;

import org.springframework.context.ApplicationContext;

public class BeanAnnotationsEx {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		Car car = container.getBean("car",Car.class);
		car.drive();
	}

}
