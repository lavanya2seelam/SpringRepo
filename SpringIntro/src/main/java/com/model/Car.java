package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	@Autowired
	@Qualifier("pEngine")
	Engine engine;
	
	public void drive() {
		engine.start();
	}

}
