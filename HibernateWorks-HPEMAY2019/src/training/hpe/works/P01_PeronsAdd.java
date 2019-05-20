package training.hpe.works;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P01_PeronsAdd {
	public static void main(String[] args) throws ParseException {
		Person person = new Person(); 
		
		person.setAge(17);; 
		person.setName("Becky");
		person.setHeight(4.8);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
		
		person.setBirthDate(sdf.parse("20-02-1993"));
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// open session create a new session 
		// which reprents the connection to DB, which can 
		// be used to perform CRUD Operations 
		Session session = factory.openSession(); 
		
		// to perform CRUD Operators 
		// 1. Begin Transaction 
		Transaction tx = session.beginTransaction(); 
		
		try {
			// 2. Perform INSERT/UPDATE/DELETE Operators
			session.persist(person);
			
//		3. Try to commit the transaction 
			
			tx.commit();
			System.out.println("Data stored... ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		4. In case of error, rollback all your INSERT/UPDATE/DELETE
			tx.rollback(); 
		} finally {
//		5. close the session 
			session.close(); 
		}

		factory.close(); 
		
	}
}








