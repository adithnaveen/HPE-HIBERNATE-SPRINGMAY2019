package training.hpe.works;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.hpe.entity.AccountEntity;
import training.hpe.entity.EmployeeEntity;
import training.hpe.util.HibernateUtil;

public class P11_OneToManyRelationExample {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory(); 
		
		Session session = factory.openSession(); 
		
		session.beginTransaction(); 
		EmployeeEntity employee1 = new EmployeeEntity(); 
		employee1.setFirstName("Ankit");
		employee1.setLastName("Jain"); 
		employee1.setEmail("ankit@hpe.com");
		
		EmployeeEntity employee2 = new EmployeeEntity(); 
		employee2.setFirstName("ershad");
		employee2.setLastName("ahemad"); 
		employee2.setEmail("ershad@hpe.com");

		AccountEntity account1 = new AccountEntity(); 
		account1.setAccountNumber("1234");

		AccountEntity account2 = new AccountEntity(); 
		account2.setAccountNumber("4455");

		AccountEntity account3 = new AccountEntity(); 
		account3.setAccountNumber("8901");
		
		Set<AccountEntity> accountsForEmployee1 = new HashSet<>(); 
		accountsForEmployee1.add(account1); 		
		accountsForEmployee1.add(account2); 
		
		Set<AccountEntity> accountsForEmployee2 = new HashSet<>(); 
		accountsForEmployee2.add(account3); 

		employee1.setAccounts(accountsForEmployee1);
		employee2.setAccounts(accountsForEmployee2);
		
		session.save(employee1);
		session.save(employee2); 
		
		session.getTransaction().commit(); 
		
		System.out.println("Saved to Database... ");
		
		
		
	}
}








