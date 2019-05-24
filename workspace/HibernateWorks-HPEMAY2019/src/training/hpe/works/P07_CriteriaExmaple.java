package training.hpe.works;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P07_CriteriaExmaple {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession(); 
		
		Criteria cr = session.createCriteria(Person.class); 
		
		Criterion ageGreater = Restrictions.gt("age", 17); 
		Criterion heightGteater = Restrictions.gt("height", 5.7); 
		

		LogicalExpression andCondition = Restrictions.and(ageGreater, heightGteater); 
		
		cr.add(andCondition); 

		List<Person> persons  = cr.list(); 
		
		for(Person temp : persons) {
			System.out.println(temp);
		}
		
	}
}
