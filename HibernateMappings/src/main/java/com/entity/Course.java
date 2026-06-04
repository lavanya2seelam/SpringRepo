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
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	
	@ManyToMany(mappedBy="course", fetch=FetchType.LAZY, cascade =CascadeType.ALL)
	private List<Student> student  = new ArrayList<>();;

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", student=" + student + "]";
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Course() {
		super();
	}

	public Course(String c_name) {
		super();
		this.c_name = c_name;
	}

	public Course(String c_name, List<Student> student) {
		super();
		this.c_name = c_name;
		this.student = student;
	}

	public Course(int c_id, String c_name, List<Student> student) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.student = student;
	}
	

}
