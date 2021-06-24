package com.capgemini.springbootrestapi.service;

import java.util.List;

import com.capgemini.springbootrestapi.model.Customer;

public interface ICustomerService {

	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int id);
}
