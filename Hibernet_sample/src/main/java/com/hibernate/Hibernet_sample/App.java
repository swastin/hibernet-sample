package com.hibernate.Hibernet_sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args)
    {
        Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        User user=new User("rajj","razz95.sahoo","12345");
        session.save(user);
        t.commit();
        session.close();
       
    }
}
