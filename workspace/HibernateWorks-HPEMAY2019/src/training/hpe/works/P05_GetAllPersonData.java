package training.hpe.works;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P05_GetAllPersonData {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction(); 
		
		// getWithHQL(session);
		
		getWrithCriteria(session);
		
		
		
	}

	// select * from persons; 
	// select name from persons; 
	private static void getWrithCriteria(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		
		CriteriaQuery<Person> cr = criteriaBuilder.
					createQuery(Person.class); 
		
		cr.from(Person.class); 
		session.createQuery(cr).getResultList().
			forEach(System.out :: println);
	}

	private static void getWithHQL(Session session) {
		List<Person> persons = session.createQuery
				("from training.hpe.entity.Person").list(); 
		
		persons.forEach(System.out :: println);
	}
}
