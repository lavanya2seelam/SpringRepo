package com.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class SpringBeanEx {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext();

        User bean = container.getBean(User.class);

        System.out.println(bean);
    }
}