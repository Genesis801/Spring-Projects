package com.capgemini.ordermanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.ordermanagementsystem.entity.Order;
import com.capgemini.ordermanagementsystem.exception.OrderNotFoundException;
import com.capgemini.ordermanagementsystem.repository.OrderRepository;

@Service
public class OrderService implements IOrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return this.orderRepository.findAll();
	}

	@Override
	public Order getOrderById(long orderId) {
		// TODO Auto-generated method stub
		return this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
	}

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return this.orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order, long orderId) {
		// TODO Auto-generated method stub
		Order existingOrder = this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
		existingOrder.setOrderStatus(order.getOrderStatus());
		existingOrder.setOrderType(order.getOrderType());
		existingOrder.setOrderValue(order.getOrderValue());
		return this.orderRepository.save(existingOrder);
	}

	@Override
	public ResponseEntity<Order> deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		Order existingOrder = this.orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found with id " + orderId));
		this.orderRepository.delete(existingOrder);
		return ResponseEntity.ok().build();
	}
	
	@Override
	public List<Order> findByOrderType(String ordType){
		return this.orderRepository.findByOrderType(ordType);
	}
	
	@Override
	public List<Order> findByOrderStatus(String ordStatus){
		return this.orderRepository.findByOrderStatus(ordStatus);
	}

}
