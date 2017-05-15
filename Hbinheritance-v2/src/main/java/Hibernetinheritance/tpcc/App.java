package Hibernetinheritance.tpcc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();
        Employee emp=new Employee();
        emp.setName("swasik");
        emp.setAge(1000);
        emp.setGender("male");
        ContractEmployee ce=new ContractEmployee();
        ce.setName("swastini");
        ce.setAge(10);
        ce.setGender("freemale");
        ce.setNo_0f_year(61);
        ce.setNo_of_hours(6);
        ce.setPay_per_hours(600);
        RegularEmployee re=new RegularEmployee();
        re.setAnnual_salary(1000);
        session.save(emp);
        session.save(ce);
        session.save(re);
        session.flush();
        tx.commit();
        session.close();
    }
}
