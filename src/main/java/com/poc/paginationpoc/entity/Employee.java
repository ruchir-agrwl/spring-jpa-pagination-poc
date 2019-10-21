package com.poc.paginationpoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer empId;
	
	private String name;
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(Integer id, String name) {
		super();
		this.empId = id;
		this.name = name;
	}
	
	

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", name=" + name + "]";
	}
	
	
	

}
