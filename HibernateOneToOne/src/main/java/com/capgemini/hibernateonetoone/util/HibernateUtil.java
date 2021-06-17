package com.capgemini.hibernateonetoone.util;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.capgemini.hibernateonetoone.entity.Course;
import com.capgemini.hibernateonetoone.entity.Instructor;
import com.capgemini.hibernateonetoone.entity.InstructorDetails;
import com.capgemini.hibernateonetoone.entity.Projects;

/**
 * 
 * @author genesis
 *
 */
/*
 * Java Configuration file that contains
 * information about the database
 * instead of hibernate.cfg.xml file
 */
public class HibernateUtil {
	
	/* 
	 * Session Factory is used to create Session Object
	 * which is used to open the DB session through 
	 * Hibernate Framework
	 */
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				/*
				 * An instance/object of Configuration allows
				 * the application to specify db properties and mappings 
				 * used when creating a dbsession using SessionFactory
				 */
				Configuration cfg = new Configuration();
				/*
				 * This class contains key,value pair both are string
				 * it is subclass of Hashtable 
				 * can be used to represent persistent set of properties
				 */
				Properties dbsettings = new Properties();
				dbsettings.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
				dbsettings.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:xe");
				dbsettings.put(Environment.USER, "system");
				dbsettings.put(Environment.PASS, "root");
				dbsettings.put(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
				dbsettings.put(Environment.SHOW_SQL, "true");
				dbsettings.put(Environment.HBM2DDL_AUTO, "create-drop");
				dbsettings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				cfg.setProperties(dbsettings);
				cfg.addAnnotatedClass(Instructor.class);
				cfg.addAnnotatedClass(InstructorDetails.class);
				cfg.addAnnotatedClass(Course.class);
				cfg.addAnnotatedClass(Projects.class);
				/*
				 * this contains contract that make up the hibernate
				 * native bootstrapping API to register the application
				 * with hibernate.
				 */
				ServiceRegistry  srvReg = new StandardServiceRegistryBuilder()
						.applySettings(cfg.getProperties()).build();
				System.out.println("Hibernate Java Config Service Registry Created");
				sessionFactory = cfg.buildSessionFactory(srvReg);
				return sessionFactory;
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("finally block");
			}
		}
		
		return sessionFactory;
		
	}

}