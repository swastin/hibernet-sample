package hibernet_mapping_one2one.hibernet_mapping;

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
        Address ad=new Address();
        User user=new User();
        ad.setPlotno("2rbf59/9");
        ad.setPs("saheednagar");
        ad.setDistrect("khourdha");
        ad.setState("odisha");
        ad.setCountry("india");
        ad.setPincode(751022);
        ad.setUser(user);
        user.setAddress(ad);
        user.setEmail("swastin99.sahoo@gmail.com");
        user.setName("rajuram");
        user.setPassword("plallasll");
        session.save(user);
        session.save(ad);
        t.commit();
        session.close();
    }
}
