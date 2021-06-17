package com.capgemini.hibernateonetoone.entity;

import javax.persistence.*;

@Entity
public class Instructor {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="instructor_details_id")
	
	private InstructorDetails instructorDetail;

	public Instructor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		//this.instructorDetail = instructorDetail;
	}

	public Instructor() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetails getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetails instructorDetail) {
		this.instructorDetail = instructorDetail;
	}
	
	
}
