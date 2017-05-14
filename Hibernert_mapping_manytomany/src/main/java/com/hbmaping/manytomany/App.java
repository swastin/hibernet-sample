package com.hbmaping.manytomany;

import java.util.ArrayList;
import java.util.List;

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
        User user1=new User();
        user1.setName("swastin");
    	user1.setEmail("swastin95.sahoo@gmail.com");
    	User user2=new User();
    	user2.setName("swastin");
    	user2.setEmail("swastin95.sahoo@gmail.com");
    	Address address= new Address();
    	address.setPlotno("59/5");
    	address.setDistrect("cuttack");
    	address.setCountry("India");
    	Address address1= new Address();
    	address1.setPlotno("59/5");
    	address1.setDistrect("cuttack");
    	address1.setCountry("India");

    	List <Address> add=new ArrayList<>();
    	List<User>usr=new ArrayList<>();
    	usr.add(user1);
    	usr.add(user2);
    	add.add(address);
    	add.add(address1);
    	
        user1.getAddresses().addAll(add);
    	address.getOwners().addAll(usr);
    	
    	Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        
   
        Transaction tx=session.beginTransaction();
        session.delete(address);
        
        session.flush();
        tx.commit();
        session.clear();
        
    }
}
