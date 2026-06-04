package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine {

	public void start() {
		System.out.println("This is petorl Engine start");
	}
}
