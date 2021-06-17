package com.capgemini.hibernateonetoone.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {
	
	
	@Id
	@SequenceGenerator(name = "ProjectsSeqGen",sequenceName = "ProjectsSeq",initialValue = 200,allocationSize = 100)
	@GeneratedValue(generator = "ProjectsSeqGen")
	@Column(name = "projectid")
	private Integer id;
	
	@Column(name="projecttitle")
	private String projectTitle;
	
	@ManyToMany(mappedBy = "projects" ,cascade = {CascadeType.ALL})
	private Set<Instructor> instructors = new HashSet<Instructor>();

	public Projects() {
		super();
	}

	public Projects(String projectTitle) {
		super();
		this.projectTitle = projectTitle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	
	

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public Set<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}



}