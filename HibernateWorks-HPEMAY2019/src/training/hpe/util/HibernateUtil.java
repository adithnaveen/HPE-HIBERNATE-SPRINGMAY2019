package training.hpe.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// this call will be resource intensive 
public class HibernateUtil {
	// since its private the object is not created from external world
	private HibernateUtil() {
	}

	// static -> singleton
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// have an empty configuration object
			Configuration cfg = new Configuration();
			// read then information from hibernate.cfg.xml
			// which will be kept in the build path
			cfg.configure();

			// it is possible to keep the bean class
			// information in hibernate.cfg.xml
			// <mapping class="training.hpe.beans.Employee"/>
//			cfg.addAnnotatedClass(Employee.class); 

			sessionFactory = cfg.buildSessionFactory();

		}

		return sessionFactory;
	}

}
