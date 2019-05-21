package training.hpe.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P02_GetPersonData {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();

		Session session2 = factory.openSession();
		
		Person p1 = session.get(Person.class, 2); 
		Person p2 = session2.get(Person.class, 2); 
		
		System.out.println(p1);
		System.out.println(p2);
		session.close(); 
		factory.close(); 
	}
}
