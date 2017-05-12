package com.hibernate_sample.hibernet_embaded;

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
    	Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        Address ad=new Address("2rbf59/7","saheednagar","khourdha","odisha","india","751022");
        User user=new User();
        user.setAddress(ad);
        user.setEmail("swastin97.sahoo@gmail.com");
        user.setName("raju");
        user.setPassword("prashaddf");
        session.save(user);
        t.commit();
        session.close();
    }
}
