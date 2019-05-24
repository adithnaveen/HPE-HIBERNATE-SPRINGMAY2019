package training.hpe.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P03_GetAndUpdatePersonData {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession(); 
		
		Person p1 = session.get(Person.class, 1); 
		System.out.println(p1);
		
		p1.setName("Harry Potter"); 
		
		session.merge(p1); 
		
		Transaction transaction = session.beginTransaction();
		transaction.commit(); 
		System.out.println("Updated... ");
		
		
	}
}
