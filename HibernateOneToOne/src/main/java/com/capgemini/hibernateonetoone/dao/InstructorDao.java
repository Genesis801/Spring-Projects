package com.capgemini.hibernateonetoone.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.hibernateonetoone.entity.Instructor;
import com.capgemini.hibernateonetoone.util.HibernateUtil;

/**
 * 
 * @author genesis
 *
 */

public class InstructorDao {
	
	//inserting the instructor
	public void SaveInstructor(Instructor instructor) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(instructor);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	
	public void updateInstructor(Instructor instructor) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.saveOrUpdate(instructor);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	public void deleteInstructor(int id) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			Instructor instructor = session.get(Instructor.class, id);
			//delete the instructor object
			session.delete(instructor);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	public Instructor getInstructor(int id) {
		Transaction transaction = null;
		Instructor instructor = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//get instructor using id
			instructor =session.get(Instructor.class, id);

			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return instructor;
		
	}
	public List<Instructor> getAllInstructors() {
		List<Instructor> instructors = null;
	    //read data from table instructor using Hibernate  
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
        	instructors = session.createQuery("from Instructor",Instructor.class).list();
        	instructors.forEach(instr -> System.out.println(instr.getEmail()));
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
		return instructors;
	}

}
