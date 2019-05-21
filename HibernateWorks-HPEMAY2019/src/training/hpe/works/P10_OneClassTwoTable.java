package training.hpe.works;

import java.util.GregorianCalendar;

import org.hibernate.Session;

import training.hpe.entity.Customer;
import training.hpe.util.HibernateUtil;

public class P10_OneClassTwoTable {
	public static void main(String[] args) {
		
		Customer customer = new Customer(); 
		
		customer.setCustomerName("Pavan"); 
		customer.setCustomerIncome(4455);
		customer.setCustomerEmail("pavan@hpe.com");
		customer.setSecretPassword("Secret"); 
		customer.setCalendar(new GregorianCalendar(1990, 02, 20));

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.save(customer); 
		session.beginTransaction().commit(); 
		System.out.println("Saved to Database... ");
		
		
	}
}
