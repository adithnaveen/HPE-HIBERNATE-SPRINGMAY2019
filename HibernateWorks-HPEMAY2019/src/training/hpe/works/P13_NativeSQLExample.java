package training.hpe.works;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import training.hpe.entity.Person;
import training.hpe.util.HibernateUtil;

public class P13_NativeSQLExample {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		
		String sql="select id,age,dob,height,name from persons";
//		selectExample1(session, sql);
//		selectNativeWithList(session, sql);
		
		List<Person> persons = (List<Person>) 
					session.createNativeQuery
					(sql, Person.class).list();  
		for(Person temp : persons) {
			System.out.println(temp);
		}
	}

	private static void selectNativeWithList(Session session, String sql) {
		List<Object[]> persons = 
				 session.createNativeQuery(sql).list();
         for (Object[] objects : persons) {
            Integer age =(Integer)objects[0];
            Timestamp dob=(Timestamp)objects[1];
            Double height = (Double)objects[2];

            System.out.println("Age " +age +" Date Of Brith : " + 
            		dob +", Height : " + height);
            

         }
	}

	private static void selectExample1(Session session, String sql) {
		 NativeQuery query = session.createSQLQuery(sql); 
		query.setResultTransformer
			(org.hibernate.Criteria.ALIAS_TO_ENTITY_MAP); 
		
		List list = query.list(); 
		
		for(Object obj : list) {
			Map map = (Map) obj; 
			System.out.println(
					"Age : " + map.get("age") +
					"Name : " + map.get("name") +
					"Height " + map.get("height")) ;
		}
	}
}
