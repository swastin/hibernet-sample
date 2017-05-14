package com.mapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user=new User();
    	user.setName("swastin");
    	user.setEmail("swastin95.sahoo@gmail.com");
    	user.setAge(60);
    	user.setSex("male");
    	Contacts contact= new Contacts();
    	contact.setPhone_number("8908972686");
    	contact.setPhone_number("8908972687");
    	user.getContact().add(contact);
    	contact.setUser(user);
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.saveOrUpdate(contact);
        session.saveOrUpdate(user);
        session.flush();
        tx.commit();
        session.close();
        
        
        		
    }
}
