package com.capgemini.handsonhibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.handsonhibernate.entity.Addresses;
import com.capgemini.handsonhibernate.util.HibernateUtil;



public class AddressesDao {
	public void SaveInstructor(Addresses addresses) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			//start transaction
			transaction= session.beginTransaction();
			
			//save the instructor object
			session.save(addresses);
			
			//commit the transaction
			transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
