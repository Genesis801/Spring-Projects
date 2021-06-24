package com.capgemini.ordermanagementsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "order_Sequence")
    @SequenceGenerator(name = "order_Sequence", sequenceName = "ORDER_SEQ")
	private long id;
	
	@Column(name="OrderType")
	private String orderType;
	
	@Column(name="OrderValue")
	private double orderValue;
	
	@Column(name="OrderDate")
	private Date orderDate;
	
	@Column(name="OrderStatus")
	private String orderStatus;

	public Order() {
		super();
	}

	public Order(String orderType, double orderValue, Date orderDate, String orderStatus) {
		super();
		this.orderType = orderType;
		this.orderValue = orderValue;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
