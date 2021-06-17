package com.capgemini.firsthibernateproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
 
public class Employee implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Employee(String email, String firstName, String lastName) {
		super();
		//this.employeeId = employeeId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
 
	public Employee() {
		super();
	}
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID",unique = true,nullable = false)
	private Integer employeeId;
	
	@Column(name = "EMAIL",unique = true,nullable = false,length = 100)
	private String email;
	
	@Column(name = "FIRSTNAME",unique = true,nullable = false,length = 100)
	private String firstName;
	
	@Column(name = "LASTNAME",unique = true,nullable = false,length = 100)
	private String lastName;
 
	public Integer getEmployeeId() {
		return employeeId;
	}
 
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}