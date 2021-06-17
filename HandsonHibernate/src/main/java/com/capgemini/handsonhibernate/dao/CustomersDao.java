package com.capgemini.handsonhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.handsonhibernate.entity.Customers;
import com.capgemini.handsonhibernate.util.HibernateUtil;

public class CustomersDao {
	//inserting the instructor
		public void saveCustomers(Customers customers) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.save(customers);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}
		
		
		
		public void updateCustomers(Customers customers) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//save the instructor object
				session.saveOrUpdate(customers);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public void deleteCustomers(int id) {
			Transaction transaction = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				Customers customers = session.get(Customers.class, id);
				//delete the instructor object
				session.delete(customers);
				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			
		}
		public Customers getCustomers(int id) {
			Transaction transaction = null;
			Customers customers = null;
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				//start transaction
				transaction =  session.beginTransaction();
				//get instructor using id
				customers =session.get(Customers.class, id);

				//commit the transaction
				transaction.commit();
			}catch (Exception e) {
				if(transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return customers;
			
		}
		public List<Customers> getAllCustomers() {
			List<Customers> instructors = null;
		    //read data from table instructor using Hibernate  
	        try {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	        	instructors = session.createQuery("from Instructor",Customers.class).list();
	        	instructors.forEach(instr -> System.out.println(instr.getCust_Name()));
	        
	        }catch(Exception e) {
	        	e.printStackTrace();
	        }
			return instructors;
		}
}
