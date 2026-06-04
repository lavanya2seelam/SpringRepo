package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements Engine{
	public void start() {
		System.out.println("Diesel Engine start");
	}
}
