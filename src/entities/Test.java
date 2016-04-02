package entities;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) throws Exception {

		Configuration c = new Configuration().configure();
        c.addResource("entities/region.hbm.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session session = sf.openSession();
        
        Country country1 = (Country)session.get(Country.class,"IN"); 
        System.out.println(country1.getName() + "<br/>");
        System.out.println(country1.getRegion().getName());
        
        
        Region r = (Region)session.get(Region.class, 3);
        Set<Country> countries = r.getCountries();
        for(Country co : countries){
            System.out.println(co.getName());
        }

	}

}
