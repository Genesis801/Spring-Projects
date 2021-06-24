package com.capgemini.ordermanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.ordermanagementsystem.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	@Query("select o from Order o where o.orderType like %?1")
	public List<Order> findByOrderType(String ordType);
	
	public List<Order> findByOrderStatus(String ordStatus);
}
