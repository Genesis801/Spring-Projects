package com.capgemini.hibernateonetoone;

import com.capgemini.hibernateonetoone.dao.InstructorDao;
import com.capgemini.hibernateonetoone.entity.Course;
import com.capgemini.hibernateonetoone.entity.Instructor;
import com.capgemini.hibernateonetoone.entity.InstructorDetails;
import com.capgemini.hibernateonetoone.entity.Projects;

/**
 * 
 * @author genesis
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Instructor instructor = new Instructor("Ramya","Krishna","ramyaki@gmail.com");
        Instructor instructor1 = new Instructor("Rama","Krishna","ramki@gmail.com");
        InstructorDetails instructorDetail = new InstructorDetails("www.youtube.com/ramya","Guitar");
        InstructorDao instructorDao = new InstructorDao();
        instructor.setInstructorDetail(instructorDetail);
       
        //create some courses
        Course cs1 = new Course("Java");
        instructor.getCourses().add(cs1);
        Course cs2 = new Course("Hibernate");
        instructor.getCourses().add(cs2);
        
        //create some projects
        Projects proj1 = new Projects("HR Management System");
        Projects proj2 = new Projects("Course Management System");
        
        instructor.getProjects().add(proj1);
        instructor.getProjects().add(proj2);
        
        //Add Instructors to the projects
        proj1.getInstructors().add(instructor);
        proj2.getInstructors().add(instructor1);
        
        instructorDao.saveInstructor(instructor);
        
		/*
		 * Scanner sc = new Scanner(System.in); char ch = 'y'; while(ch == 'y') {
		 * System.out.println("Enter the transaction");
		 * System.out.println("insert : insert data");
		 * System.out.println("update : update data");
		 * System.out.println("delete : delete data");
		 * System.out.println("get : get a instructor by id");
		 * System.out.println("getall : get all instructor data");
		 * System.out.println("exit : to exit"); String choice = sc.next();
		 * 
		 * switch(choice) { case "insert":
		 * instructor.setInstructorDetail(instructorDetail);
		 * instructorDao.SaveInstructor(instructor); break; case "update": instructor =
		 * new Instructor("Ramya","Krishna","ramkrish@gmail.com");
		 * instructorDao.updateInstructor(instructor); break; case "delete":
		 * System.out.println("Enter the Instructor Id"); int id = sc.nextInt();
		 * instructorDao.deleteInstructor(id); break; case "get":
		 * System.out.println("Enter the Instructor Id"); int gid = sc.nextInt();
		 * Instructor instr = instructorDao.getInstructor(gid);
		 * System.out.println(instr.getEmail()+"\t\t"
		 * +instr.getFirstName()+"\t\t"+instr.getLastName());
		 * System.out.println(instr.getInstructorDetail().getId());
		 * System.out.println(instr.getInstructorDetail().getHobby()); break;
		 * 
		 * case "getall": instructorDao.getAllInstructors(); break; case "exit":
		 * System.exit(0); } System.out.println("do you want to continue"); ch =
		 * sc.next().trim().charAt(0); }
		 */
    }
}