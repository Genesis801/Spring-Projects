package com.capgemini.handsonhibernate.entity;

import javax.persistence.*;

@Entity
public class Addresses {
	@Id
	@SequenceGenerator(name = "addrSeqGen",sequenceName = "addrSeq",initialValue = 100,allocationSize = 100)
	@GeneratedValue(generator = "addrSeqGen")
	private Integer id;
	private String address;
	
	public Addresses(String address) {
		super();
		this.address = address;
	}

	public Addresses() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
