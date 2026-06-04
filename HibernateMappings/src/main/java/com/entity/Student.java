package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;
	private String s_name;
	private int s_age;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
	    name = "student_course",
	    joinColumns = @JoinColumn(name = "s_id"),
	    inverseJoinColumns = @JoinColumn(name = "c_id")
	)
	private List<Course> course = new ArrayList<>();
	

	public Student() {
		super();
	}

	public Student(int s_id, String s_name, int s_age, List<Course> course) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
		this.course = course;
	}

	public Student(String s_name, int s_age) {
		super();
		this.s_name = s_name;
		this.s_age = s_age;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_age=" + s_age + "]";
	}

}
