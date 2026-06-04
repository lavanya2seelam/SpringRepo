package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table (name = "Employee")
@NamedQueries({
    @NamedQuery(
        name = "selectAll",
        query = "from Employees"
    ),

    @NamedQuery(
        name = "selectById",
        query = "from Employees where empId = ?1"
    ),
    @NamedQuery(
            name = "updateById",
            query = "update Employees set salary= ?1 where empId =?2"
        )
}) //This Annotation is for multiple named query
//@NamedQuery(name = "selectAll", query = "from Employees")  This Annotation is for single named query
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String name;
	private int salary;
	public Employees(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employees() {
		super();
	}
	

}
