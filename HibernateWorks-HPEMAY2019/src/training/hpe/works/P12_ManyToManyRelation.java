package training.hpe.works;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import training.hpe.entity.Human;
import training.hpe.entity.Language;
import training.hpe.util.HibernateUtil;

public class P12_ManyToManyRelation {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		
		
		session.beginTransaction(); 
		
		Language language1 = new Language
					(0, "C Programming", 1972, "USA");
		
		Language language2 = new Language
				(0, "java", 1993, "India");
		
		Language language3 = new Language
				(0, "R Programming", 2010, "Australia");
		
		
		List<Language> human1Languages = Arrays.asList(
					language1, language2, language3); 
		
		List<Language> human2Languages = Arrays.asList(
				 language2, language3); 
		
		List<Language> human3Languages = Arrays.asList(
			 language3); 
		
		Human human1 = new Human(0, "Raghavendra", 
				"Programmer", 5566, human1Languages);
		
		Human human2 = new Human(0, "Nanditha", 
				"Software Engineer", 4466, human2Languages);
		
		Human human3 = new Human(0, "Ramaprasad", 
				"Business Analyst", 6655, human3Languages); 
		
		session.save(human1); 
		session.save(human2); 
		session.save(human3); 
		
		session.getTransaction().commit(); 
		
		System.out.println("Records Saved in DB ");
		
		
		
	}
}
