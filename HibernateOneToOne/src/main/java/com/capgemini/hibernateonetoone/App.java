package com.capgemini.hibernateonetoone;

import com.capgemini.hibernateonetoone.dao.InstructorDao;
import com.capgemini.hibernateonetoone.entity.Instructor;
import com.capgemini.hibernateonetoone.entity.InstructorDetails;

/**
 * 
 * @author genesis
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Instructor instructor= new Instructor("Deba","Roy","deba@gmail.com");
       InstructorDetails instructorDetails= new InstructorDetails("www.youtube.com","piano");
       
       instructor.setInstructorDetail(instructorDetails);
       InstructorDao instructorDao = new InstructorDao();
       instructorDao.SaveInstructor(instructor);
       
    }
}
