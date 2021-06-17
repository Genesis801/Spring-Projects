package com.capgemini.hibernateonetoone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class InstructorDetails {
	
	@Id
	@SequenceGenerator(name = "instrSeqGen",sequenceName = "instrSeq",initialValue = 100,allocationSize = 100)
	@GeneratedValue(generator = "instrSeqGen")
	private Integer id;
	private String youtubechannel;
	private String hobby;
	
	public InstructorDetails() {
		super();
	}
	
	public InstructorDetails(String youtubechannel, String hobby) {
		super();
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYoutubechannel() {
		return youtubechannel;
	}
	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}