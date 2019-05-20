package training.hpe.works;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P06_CriteriaExample {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
//		selectAll(session);
//		selectOneRecord(session);
//		selectOneField(session);
//		selectMultiFieldWithSelection(session);
	}

	private static void selectMultiFieldWithSelection(Session session) {
		//select name, age from persons where age > 33  order by name asc; 
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		
		// return type 
		CriteriaQuery<Object[]> query = 
			criteriaBuilder.createQuery(Object[].class);
		
		Root<Person> root = query.from(Person.class); 
		
		Predicate greaterThan = criteriaBuilder.
				greaterThan(root.get("age"), 17); 
		
		query.multiselect(root.get("name"), root.get("age"))
			.where(greaterThan).getOrderList(); 
			
//		query.orderBy(criteriaBuilder.asc(root.get("age"))); 
		query.orderBy(criteriaBuilder.desc(root.get("age"))); 
		
		List<Object[]> list =  session.createQuery(query).
				getResultList();  
		
		for(Object[] temp : list) {
			System.out.println("Name : " + temp[0] +", Age : " + temp[1]);
		}
	}

	private static void selectOneField(Session session) {
		// select one field 
		// select name from persons; 
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		// this is important if you are taking 1 field from 
		// the db in ealier versions/example it was from Person.class
		
		
		CriteriaQuery<String> query = criteriaBuilder.
				createQuery(String.class); 
		Root<Person> root = query.from(Person.class); 
		query.select(root.get("name")); 
		
		session.createQuery(query).getResultList()
			.forEach(System.out :: println);
	}

	private static void selectOneRecord(Session session) {
		// select * from persons where id = 1; 
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		CriteriaQuery<Person> query = criteriaBuilder.
				createQuery(Person.class); 
		Root<Person> root = query.from(Person.class); 
		
		query.select(root).where
			(criteriaBuilder.equal(root.get("id"), 4)); 
		
		Query<Person> q = session.createQuery(query); 
		System.out.println(q.getSingleResult());
	}

	// select * from persons; 
	private static void selectAll(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		CriteriaQuery<Person> query = criteriaBuilder.createQuery(Person.class); 
		Root<Person> root = query.from(Person.class); 
		query.select(root); 
		Query<Person> personsQuery = session.createQuery(query); 
		personsQuery.getResultList().forEach(System.out :: println);
	}
}
