package com.capgemini.hibernateonetoone.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.hibernateonetoone.entity.InstructorDetails;
import com.capgemini.hibernateonetoone.util.HibernateUtil;
/**
 * 
 * @author genesis
 *
 */
public class InstructorDetailsDao {

	public void SaveInstructor(InstructorDetails instructordetails) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			//start transaction
			transaction= session.beginTransaction();
			
			//save the instructor object
			session.save(instructordetails);
			
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
