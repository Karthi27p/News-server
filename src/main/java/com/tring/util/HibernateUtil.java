package com.tring.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
    	
    	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    	System.out.println("Config: "+ configuration);
    	System.out.println("Key:"+ configuration.getProperty("hibernate.connection.url"));
	
    	sessionFactory = configuration.buildSessionFactory();
    	System.out.println("Session:"+ sessionFactory);
    	return sessionFactory;

    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
	
}
