package training.hpe.works;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class PO4_DeletePerson {
	public static void main_not_correct_approch(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession(); 
		
		// here p1 is called transiernt 
		Person p1 = new Person(); 
		// id 100 is not there in the DB 
		p1.setId(100);
		
		session.remove(p1);
		session.beginTransaction().commit(); 
		
		System.out.println("Data Deleted... ");
		
		session.close();
	}
	
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession(); 
		
		
		// persist the person object 
		Person p1 = session.get(Person.class, 2); 
		
		if(p1!=null) {
			// remove method will remove record from DB 
			session.remove(p1);
			session.beginTransaction().commit(); 
			System.out.println("Deleted.. ");
		}
		
		session.delete(p1);
		
		session.close(); 
		
	}
	
	
	
	
	
	
	
}
