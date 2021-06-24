package com.capgemini.ordermanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.ordermanagementsystem.entity.Order;

@Service
public interface IOrderService {
	
	public List<Order> getAllOrders();
	public Order getOrderById(long orderId);
	public Order saveOrder(Order order);
	public Order updateOrder(Order order,long orderId);
	public ResponseEntity<Order> deleteOrder(long orderId);
	 List<Order> findByOrderType(String ordType);
	public List<Order> findByOrderStatus(String ordStatus);
}