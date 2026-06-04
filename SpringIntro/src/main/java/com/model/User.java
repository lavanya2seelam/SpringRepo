package com.model;

import java.util.List;
import java.util.Map;

public class User {
	int id;
	String name;
	List<String> skills;
	Map<Integer,String> hobbies;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", skills=" + skills + ", hobbies=" + hobbies + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<Integer, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}

	public User(int id, String name, List<String> skills, Map<Integer, String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.hobbies = hobbies;
	}


	
}