package com.hbmapping;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbmapping.models.*;

public class App 
{
   
    @SuppressWarnings({ "unused" })
	public static void main( String[] args )
    {
    	
    	 /**
         * creates object of model class 
         */
    	Student student=new Student();
    	Faculty faculty=new Faculty();
    	Department department=new Department();
    	Course course=new Course();
    	Address address=new Address();
    	student.setName("swastin");
    	student.setGender("male");
    	student.setAge(60);
    	student.setAddress(address);
    	student.setCourse(course);
    	student.setDepartment(department);
 
    	/*faculty*/
    	faculty.setName("mahendra bahubali");
    	faculty.setGender("male");
    	faculty.setAge("60");
    	faculty.setAddress(address);
    	faculty.setDepartment(department);
    	Date dt=new Date();
    	faculty.setDate_of_join(dt);
    	/*department*/
    	department.setName("computerscience");
    	
    	
    	/*course*/
    	course.setName("Btech");
    	course.setFaculty(faculty);
    	course.getStudent().add(student);
    	course.setDepartment(department);
    	/*Address*/
    	 address.setPlotno("2rbf59/9");
         address.setState("odisha");
         address.setCountry("india");
         address.setPincode(751022);
         
         department.getFaculity().add(faculty);
     	department.getStudent().add(student);
     	department.getCourse().add(course);
    
    	 /**
         * configuration setting
         */
    	Configuration cfg = new Configuration().configure();
    	Session session=cfg.buildSessionFactory().openSession();
    	Transaction tx=session.beginTransaction();
    	/**/
        session.save(address);
    	session.save(course);
    	session.save(department);
    	//session.save(faculty);
    	session.save(student);
    	tx.commit();
    	session.close();
    	
    	
    }
}
