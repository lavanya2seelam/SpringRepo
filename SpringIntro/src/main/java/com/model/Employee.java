package com.model;
import com.model.Employee;

public class Employee {
	int id;
	String name;
	Address address1;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address) {
		this.address1 = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address1 + "]";
	}

}
