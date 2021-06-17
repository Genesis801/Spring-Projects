package com.capgemini.hibernateonetoone.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.hibernateonetoone.entity.Instructor;
import com.capgemini.hibernateonetoone.util.HibernateUtil;

public class InstructorDao {
	
	public void SaveInstructor(Instructor instructor) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			//start transaction
			transaction= session.beginTransaction();
			
			//save the instructor object
			session.save(instructor);
			
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
	
	public void updateInstructor() {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			//start transaction
			transaction= session.beginTransaction();
			
			//save the instructor object
			session.update(instructor);
			
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
	public void deleteInstructor() {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			//start transaction
			transaction= session.beginTransaction();
			
			Instructor instructor= session.get(Instructor.class,id);
			//save the instructor object
			session.delete(instructor);
			
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
